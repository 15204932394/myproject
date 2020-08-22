package com.zhangbin.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangbin.pojo.User;
import com.zhangbin.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	//添加用户
	@RequestMapping("addUser")
	public String toAdd(User user,Model model) {
		model.addAttribute("user", user);
		return "user/insertUser";
	}
	
	//注册用户
	@RequestMapping("insertPersonUser")
	public String insertPerson(User user,Model model) {
		userService.insertPerson(user);
		model.addAttribute("user", user);
		return "redirect:/userSelect";
	}
	
	
	//查询个人信息
	@RequestMapping("gerenSelect")
	public String gerenSelect(User user,Model model) {
		User user2 = userService.gerenSelect(user);
		model.addAttribute("user", user2);
		return "user/gerenSelect";
	}
	
	//用户登录
	@RequestMapping("doLogin")
	public String login(User user,Model model,HttpSession session) {
		//根据用户输入的用户名、密码去数据库查询数据
		System.out.println(user);
		User user1 = userService.checkLogin(user);
		//若能查出数据来（user1不为空），登录成功
		if(user1!=null) {
			//管理员界面
			if ("管理员".equals(user1.getPosition())) {
				//将数据传入
				session.setAttribute("user", user1);
				return "user/main";
			}else if ("维修员".equals(user1.getPosition())) {
				//维修员界面
				session.setAttribute("user", user1);
				return "weixiu/main";
			}else if("学生".equals(user1.getPosition())){
				//学生界面
				session.setAttribute("user", user1);
				return "student/main";				
			}else {
				//班级管理员界面
				session.setAttribute("user", user1);
				return "banji/main";	
			}
		}else {
			//若不能查出数据来（user1为空），登录失败
			model.addAttribute("msg", "输入的用户名或密码错误，请重新输入！");
			return "login";
		}
	}
	
	//修改密码
	@RequestMapping("ChangePassword")
	public String ChangePassword(HttpServletRequest hRequest,Model model) {
		String newPassword1 = hRequest.getParameter("newPassword1");
		String newPassword = hRequest.getParameter("newPassword");
		String username = hRequest.getParameter("username");
		if(newPassword.equals(newPassword1)) {
			userService.modifyPassword(username, newPassword);
			model.addAttribute("msg", "修改密码成功");
			return "user/toChangePassword";
		}else {
			model.addAttribute("msg", "输入的两次密码不同");
			return "user/toChangePassword";
		}
	}
	
	//删除
	@RequestMapping("deleteuser")
	public String deleteUser(int id) {
		//根据id查询到的用户
		userService.deleteUser(id);
		return "redirect:/userSelect";
	}
	
	//用户列表
	@RequestMapping("userSelect")
	public String userSelect(User user,Model model) {
		List<User> users = userService.userSelect(user);
		model.addAttribute("users", users);
		model.addAttribute("user", user);
		return "user/userSelect";
	}
	
	//带着要修改的数据跳转到修改界面
	@RequestMapping("oneSelectModifyUser")
	public String oneSelectModifyUser(int id,Model model) {
		//根据id查询到的学生
		User user = userService.userSelectId(id);
		model.addAttribute("user", user);		
		return "user/modifyUser";
	}
	
	//在修改界面确定修改后跳转到查询界面
	@RequestMapping("modifyUser")
	public String modifyUser(User user){
		userService.modifyUser(user);
		return "redirect:/userSelect";
	}
}
