<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息</title>
</head>
<body>
	<fieldset>
		<legend>个人信息</legend>
	</fieldset>

	<table border="1">
		<tr>
			<td width="50px">ID</td>
			<td width="100px">用户名</td>
			<td width="100px">姓名</td>
			<td width="55px">性别</td>
			<td width="55px">年龄</td>
			<td width="100px">职位</td>
			<td width="100px">手机号</td>
			<td width="150px">邮箱</td>
			<td width="100px">操作</td>
		</tr>
		<tr>
			<td>${user.id }</td>
			<td>${user.username }</td>
			<td>${user.name }</td>
			<td>${user.sex }</td>
			<td>${user.age }</td>
			<td>${user.position }</td>
			<td>${user.phone }</td>
			<td>${user.email}</td>
			<td>
				<a href="oneSelectModifyUser?id=${user.id }">修改</a>
			</td>
		</tr>		
	</table>
</body>
</html>