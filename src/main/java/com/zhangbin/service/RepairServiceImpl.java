package com.zhangbin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangbin.dao.RepairDao;
import com.zhangbin.pojo.Repair;
@Service
public class RepairServiceImpl implements RepairService {

	@Resource
	private RepairDao repairDao;
	
	@Override
	public List<Repair> repairSelect(Repair repair) {
		List<Repair> rList = repairDao.repairSelect(repair);
		return rList;
	}

	@Override
	public Repair repairSelectId(int id) {
		Repair repair = repairDao.repairSelectId(id);
		return repair;
	}

	@Override
	public void insertRepair(Repair repair) {
		repairDao.insertRepair(repair);

	}

	@Override
	public void modifyRepair(Repair repair) {
		repairDao.modifyRepair(repair);

	}

	@Override
	public void deleteRepair(int id) {
		repairDao.deleteRepair(id);

	}

}
