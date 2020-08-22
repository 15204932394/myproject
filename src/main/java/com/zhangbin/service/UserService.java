package com.zhangbin.service;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zhangbin.pojo.User;
@Repository
public interface UserService {
	//登录
	public User checkLogin(User user);
	//注册
	public void insertPerson(User user);
	//个人查询
	public User gerenSelect(User user);
	//id查询
	public User userSelectId(int id);
	//查询全部用户
	public List<User> userSelect(User user);
	//根据id修改
	public void modifyUser(User user);
	//根据id删除
	public void deleteUser(int id);
	//修改密码
	public void modifyPassword(@Param("username")String username,@Param("password") String password);
	
}
