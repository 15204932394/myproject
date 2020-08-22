package com.zhangbin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangbin.dao.HealthDao;
import com.zhangbin.pojo.Health;

@Service
public class HealthServiceImol implements HealthService {
	
	@Resource
	private HealthDao healthDao;

	
	//打扫记录列表
	@Override
	public List<Health> healthSelect(Health health) {
		List<Health> hList = healthDao.healthSelect(health);
		return hList;
	}

	//id查询打扫记录
	@Override
	public Health healthSelectId(int id) {
		Health health = healthDao.healthSelectId(id);
		return health;
	}

	//添加打扫记录
	@Override
	public void insertHealth(Health health) {
		healthDao.insertHealth(health);

	}

	//修改打扫记录
	@Override
	public void modifyHealth(Health health) {
		healthDao.modifyHealth(health);

	}

	//删除打扫记录
	@Override
	public void deleteHealth(int id) {
		healthDao.deleteHealth(id);

	}

}
