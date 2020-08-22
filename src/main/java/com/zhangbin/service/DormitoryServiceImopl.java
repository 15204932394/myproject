package com.zhangbin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangbin.dao.DormitoryDao;
import com.zhangbin.pojo.Dormitory;

@Service
public class DormitoryServiceImopl implements DormitoryService {
	
	@Resource
	private DormitoryDao dormitoryDao;

	//宿舍列表
	@Override
	public List<Dormitory> dormitorySelect(Dormitory dormitory) {
		List<Dormitory> dList = dormitoryDao.dormitorySelect(dormitory);
		return dList;
	}

	//宿舍信息
	@Override
	public Dormitory dormitorySelectId(int id) {
		Dormitory dormitory = dormitoryDao.dormitorySelectId(id);
		return dormitory;
	}

	//添加宿舍
	@Override
	public void insertDormitory(Dormitory dormitory) {
		dormitoryDao.insertDormitory(dormitory);

	}

	//修改宿舍
	@Override
	public void modifyDormitory(Dormitory dormitory) {
		dormitoryDao.modifyDormitory(dormitory);

	}

	//删除宿舍
	@Override
	public void deleteDormitory(int id) {
		dormitoryDao.deleteDormitory(id);

	}

}
