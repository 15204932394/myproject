package com.zhangbin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhangbin.pojo.Dormitory;

@Repository
public interface DormitoryDao {
	//查询
	public List<Dormitory> dormitorySelect(Dormitory dormitory);
	
	//id查询
	public Dormitory dormitorySelectId(int id);
	
	//添加
	public void insertDormitory(Dormitory dormitory);
	
	//根据id修改
	public void modifyDormitory(Dormitory dormitory);
	
	//根据id删除
	public void deleteDormitory(int id);
}
