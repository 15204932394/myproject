package com.zhangbin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangbin.pojo.Student;
import com.zhangbin.service.StudentService;

@Controller
public class StudentController {
	
	@Resource
	private StudentService studentService;
		
	//学生查询
	@RequestMapping("studentSelect")
	public String studentSelect(Student student,Model model) {
		List<Student> students = studentService.studentSelect(student);
		model.addAttribute("students", students);
		model.addAttribute("student", student);
		return "user/student/studentSelect";
	}
	
	//学生登录的学生查询
	@RequestMapping("studentSelectStudent")
	public String studentSelectStudent(Student student,Model model) {
		List<Student> students = studentService.studentSelect(student);
		model.addAttribute("students", students);
		model.addAttribute("student", student);
		return "student/studentSelect";
	}
	
	//跳转到添加学生
	@RequestMapping("toiIsertStudent")
	public String toiIsertStudent(Student student,Model model) {
		model.addAttribute("student", new Student());
		return "user/student/insertStudent";
	}
	
	//添加学生
	@RequestMapping("insertStudent")
	public String insertStudent(Student student) {
		studentService.insertStudent(student);
		return "redirect:/studentSelect";
		
	}

	//带着要修改的数据跳转到修改界面
	@RequestMapping("oneSelectModify")
	public String oneSelectModify(int id,Model model) {
		//根据id查询到的学生
		Student student = studentService.studentSelectId(id);
		model.addAttribute("student", student);		
		return "user/student/modifyStudent";
	}
	
	//在修改界面确定修改后跳转到查询界面
	@RequestMapping("modifyStudent")
	public String modifyStudent(Student student){
		studentService.modifyStudent(student);
		return "redirect:/studentSelect";
	}
	
	
	//删除
	@RequestMapping("deleteStudent")
	public String deleteStudent(int id) {
		//根据id查询到的学生
		studentService.deleteStudent(id);
		return "redirect:/studentSelect";
	}
}
