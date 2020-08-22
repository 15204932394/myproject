package com.zhangbin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangbin.pojo.User;
import com.zhangbin.service.UserService;

@Controller
public class IndexController {
	
	@Resource
	private UserService userService;
	
	//登录界面
	@RequestMapping("toLogin")
	public String toLogin() {
		return "login";
	}
	
	//注册界面
	@RequestMapping("registered")
	public String registered(User user,Model model) {
		model.addAttribute("user",user);
		return "registered";
	}
	
	//注册用户
	@RequestMapping("insertPerson")
	public String insertPerson(User user,Model model) {
		userService.insertPerson(user);
		model.addAttribute("user", user);
		return "success";
	}
	
	//跳转修改密码界面
	@RequestMapping("toChangePassword")
	public String toChangePassword() {
		return "user/toChangePassword";
	}
}
