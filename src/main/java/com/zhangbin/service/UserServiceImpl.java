package com.zhangbin.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangbin.dao.UserDao;
import com.zhangbin.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	

	@Resource
	private UserDao userDao;
	
	//验证登录
	@Override
	public User checkLogin(User user) {
		User user1 =  userDao.checkLogin(user);
		return user1;
	}

	//添加用户
	@Override
	public void insertPerson(User user) {
		userDao.insertPerson(user);
	}

	//查询个人用户
	@Override
	public User gerenSelect(User user) {
		User user1 =  userDao.gerenSelect(user);
		return user1;
	}

	//修改用户
	@Override
	public void modifyUser(User user) {
		userDao.modifyUser(user);
		
	}

	//删除用户
	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
		
	}

//	用户列表
	@Override
	public List<User> userSelect(User user) {
		List<User> users = userDao.userSelect(user);
		return users;
	}

	//id查询
	@Override
	public User userSelectId(int id) {
		User user = userDao.userSelectId(id);
		return user;
	}

	//修改密码
	@Override
	public void modifyPassword(String username, String password) {
		userDao.modifyPassword(username, password);
	}
	
}
