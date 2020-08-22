package com.zhangbin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangbin.pojo.Classes;
import com.zhangbin.service.ClassesService;

@Controller
public class ClassesController {
	@Resource
	private ClassesService classesService;
	
	//班级查询
	@RequestMapping("classesSelect")
	public String classesSelect(Classes classes,Model model) {
		System.out.println("进入");
		List<Classes> classess = classesService.classesSelect(classes);
		System.out.println("进入2");
		model.addAttribute("classess", classess);
		model.addAttribute("classes", classes);
		return "user/classes/classesSelect";
	}
	
	//跳转到添加班级
	@RequestMapping("toiIsertClasses")
	public String toiIsertClasses(Classes classes,Model model) {
		model.addAttribute("classes", new Classes());
		return "user/classes/insertClasses";
	}
	
	//添加班级
	@RequestMapping("insertClasses")
	public String insertClasses(Classes classes) {
		classesService.insertClasses(classes);
		return "redirect:/classesSelect";
		
	}

	//带着要修改的数据跳转到修改界面
	@RequestMapping("oneSelectModifyClasses")
	public String oneSelectModifyClasses(int id,Model model) {
		//根据id查询到的学生
		Classes classes = classesService.classesSelectId(id);
		model.addAttribute("classes", classes);		
		return "user/classes/modifyClasses";
	}
	
	//在修改界面确定修改后跳转到查询界面
	@RequestMapping("modifyClasses")
	public String modifyClasses(Classes classes){
		classesService.modifyClasses(classes);
		return "redirect:/classesSelect";
	}
	
	
	//删除
	@RequestMapping("deleteClasses")
	public String deleteClasses(int id) {
		//根据id查询到的班级
		classesService.deleteClasses(id);
		return "redirect:/classesSelect";
	}
}
