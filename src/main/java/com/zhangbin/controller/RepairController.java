package com.zhangbin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangbin.pojo.Repair;
import com.zhangbin.service.RepairService;

@Controller
public class RepairController {

	@Resource
	private RepairService repairService;
	
	//班级查询
	@RequestMapping("repairSelect")
	public String RepairSelect(Repair repair,Model model) {
		List<Repair> repairs = repairService.repairSelect(repair);
		model.addAttribute("repairs", repairs);
		model.addAttribute("repair", repair);
		return "user/repair/repairSelect";
	}
	
	//跳转到添加班级
	@RequestMapping("toiIsertRepair")
	public String toiIsertRepair(Repair repair,Model model) {
		model.addAttribute("repair", new Repair());
		return "user/repair/insertRepair";
	}
	
	//添加班级
	@RequestMapping("insertRepair")
	public String insertRepair(Repair repair) {
		repairService.insertRepair(repair);
		return "redirect:/repairSelect";
		
	}

	//带着要修改的数据跳转到修改界面
	@RequestMapping("oneSelectModifyRepair")
	public String oneSelectModifyRepair(int id,Model model) {
		//根据id查询到的学生
		Repair repair = repairService.repairSelectId(id);
		model.addAttribute("repair", repair);		
		return "user/repair/modifyRepair";
	}
	
	//在修改界面确定修改后跳转到查询界面
	@RequestMapping("modifyRepair")
	public String modifyRepair(Repair repair){
		repairService.modifyRepair(repair);
		return "redirect:/repairSelect";
	}
	
	
	//删除
	@RequestMapping("deleteRepair")
	public String deleteRepair(int id) {
		//根据id查询到的班级
		repairService.deleteRepair(id);
		return "redirect:/repairSelect";
		}
}
