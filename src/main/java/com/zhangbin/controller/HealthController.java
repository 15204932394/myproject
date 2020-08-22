package com.zhangbin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangbin.pojo.Health;
import com.zhangbin.service.HealthService;

@Controller
public class HealthController {
	@Resource
	private HealthService healthService;
	
	//班级查询
	@RequestMapping("healthSelect")
	public String healthSelect(Health health,Model model) {
		List<Health> healths = healthService.healthSelect(health);
		model.addAttribute("healths", healths);
		model.addAttribute("health", health);
		return "user/health/healthSelect";
	}
	
	//跳转到添加班级
	@RequestMapping("toiIsertHealth")
	public String toiIsertHealth(Health health,Model model) {
		model.addAttribute("health", new Health());
		return "user/health/insertHealth";
	}
	
	//添加班级
	@RequestMapping("insertHealth")
	public String insertHealth(Health health) {
		healthService.insertHealth(health);
		return "redirect:/healthSelect";
		
	}

	//带着要修改的数据跳转到修改界面
	@RequestMapping("oneSelectModifyHealth")
	public String oneSelectModifyHealth(int id,Model model) {
		//根据id查询到的学生
		Health health = healthService.healthSelectId(id);
		model.addAttribute("health", health);		
		return "user/health/modifyHealth";
	}
	
	//在修改界面确定修改后跳转到查询界面
	@RequestMapping("modifyHealth")
	public String modifyHealth(Health health){
		healthService.modifyHealth(health);
		return "redirect:/healthSelect";
	}
	
	
	//删除
	@RequestMapping("deleteHealth")
	public String deleteHealth(int id) {
		//根据id查询到的班级
		healthService.deleteHealth(id);
		return "redirect:/healthSelect";
	}
}
