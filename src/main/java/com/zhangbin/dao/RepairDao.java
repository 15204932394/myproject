package com.zhangbin.dao;

import java.util.List;

import com.zhangbin.pojo.Repair;

public interface RepairDao {
	//查询
	public List<Repair> repairSelect(Repair repair);
	
	//id查询
	public Repair repairSelectId(int id);
	
	//添加
	public void insertRepair(Repair repair);
	
	//根据id修改
	public void modifyRepair(Repair repair);
	
	//根据id删除
	public void deleteRepair(int id);
}
