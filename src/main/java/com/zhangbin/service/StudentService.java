package com.zhangbin.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhangbin.pojo.Student;
import com.zhangbin.pojo.User;

@Repository
public interface StudentService {
	//查询
	public List<Student> studentSelect(Student student);
	
	//id查询
	public Student studentSelectId(int id);
	
	//添加
	public void insertStudent(Student student);
	
	//id修改
	public void modifyStudent(Student student);
	
	//根据id删除
	public void deleteStudent(int id);
	
}
