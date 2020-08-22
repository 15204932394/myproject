package com.zhangbin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangbin.dao.StudentDao;
import com.zhangbin.pojo.Student;
import com.zhangbin.pojo.User;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDao studentDao;

	//学生列表
	@Override
	public List<Student> studentSelect(Student student) {
		List<Student> students = studentDao.studentSelect(student);
		return students;
	}
	
	//id查询
	@Override
	public Student studentSelectId(int id) {
		Student student = studentDao.studentSelectId(id);
		return student;
	}

	//添加
	@Override
	public void insertStudent(Student student) {
		studentDao.insertStudent(student);
	}

	//修改
	@Override
	public void modifyStudent(Student student) {
		studentDao.modifyStudent(student);		
	}

	//删除
	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}
	
}
