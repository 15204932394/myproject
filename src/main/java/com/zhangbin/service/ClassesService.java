package com.zhangbin.service;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.zhangbin.pojo.Classes;

@Repository
public interface ClassesService {
	//查询
	public List<Classes> classesSelect(Classes classes);
	
	//id查询
	public Classes classesSelectId(int id);
	
	//添加
	public void insertClasses(Classes classes);
	
	//根据id修改
	public void modifyClasses(Classes classes);
	
	//根据id删除
	public void deleteClasses(int id);
}
