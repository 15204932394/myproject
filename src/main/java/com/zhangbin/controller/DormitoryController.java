package com.zhangbin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangbin.pojo.Dormitory;
import com.zhangbin.service.DormitoryService;

@Controller
public class DormitoryController {
	@Resource
	private DormitoryService dormitoryService;
	
	//班级查询
	@RequestMapping("dormitorySelect")
	public String DormitorySelect(Dormitory dormitory,Model model) {
		List<Dormitory> dormitorys = dormitoryService.dormitorySelect(dormitory);
		model.addAttribute("dormitorys", dormitorys);
		model.addAttribute("dormitory", dormitory);
		return "user/dormitory/dormitorySelect";
	}
	
	//跳转到添加班级
	@RequestMapping("toiIsertDormitory")
	public String toiIsertDormitory(Dormitory dormitory,Model model) {
		model.addAttribute("dormitory", new Dormitory());
		return "user/dormitory/insertDormitory";
	}
	
	//添加班级
	@RequestMapping("insertDormitory")
	public String insertDormitory(Dormitory dormitory) {
		dormitoryService.insertDormitory(dormitory);
		return "redirect:/dormitorySelect";
		
	}

	//带着要修改的数据跳转到修改界面
	@RequestMapping("oneSelectModifyDormitory")
	public String oneSelectModifyDormitory(int id,Model model) {
		//根据id查询到的学生
		Dormitory dormitory = dormitoryService.dormitorySelectId(id);
		model.addAttribute("dormitory", dormitory);		
		return "user/dormitory/modifyDormitory";
	}
	
	//在修改界面确定修改后跳转到查询界面
	@RequestMapping("modifyDormitory")
	public String modifyDormitory(Dormitory dormitory){
		dormitoryService.modifyDormitory(dormitory);
		return "redirect:/dormitorySelect";
	}
	
	
	//删除
	@RequestMapping("deleteDormitory")
	public String deleteDormitory(int id) {
		//根据id查询到的班级
		dormitoryService.deleteDormitory(id);
		return "redirect:/dormitorySelect";
	}

}
