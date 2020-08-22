package com.zhangbin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangbin.dao.ClassesDao;
import com.zhangbin.pojo.Classes;

@Service
public class ClassesServiceImpl implements ClassesService {
	
	@Resource
	private ClassesDao classesDao;

	//班级列表
	@Override
	public List<Classes> classesSelect(Classes classes) {
		List<Classes> cList =  classesDao.classesSelect(classes);
		return cList;
	}

	//ID查询
	@Override
	public Classes classesSelectId(int id) {
		Classes classes = classesDao.classesSelectId(id);
		return classes;
	}

	//添加
	@Override
	public void insertClasses(Classes classes) {
		classesDao.insertClasses(classes);
	}

	//修改
	@Override
	public void modifyClasses(Classes classes) {
		classesDao.modifyClasses(classes);
	}

	//删除
	@Override
	public void deleteClasses(int id) {
		classesDao.deleteClasses(id);
	}

}
