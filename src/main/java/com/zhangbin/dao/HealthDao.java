package com.zhangbin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhangbin.pojo.Health;

@Repository
public interface HealthDao {
	//查询
	public List<Health> healthSelect(Health health);
	
	//id查询
	public Health healthSelectId(int id);
	
	//添加
	public void insertHealth(Health health);
	
	//根据id修改
	public void modifyHealth(Health health);
	
	//根据id删除
	public void deleteHealth(int id);
}
