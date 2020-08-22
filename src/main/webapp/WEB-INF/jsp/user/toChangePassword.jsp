<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改密码</title>
</head>
<body>
	<form action="ChangePassword" method="post">
		<fieldset>
			<p>
				用户名：<input type="text" readonly="readonly" value="${user.username}" name = "username"> 
			</p>
			<p>
				请输入新密码：<input type="password" name = "newPassword1">
			</p>
			<p>
				在此输入新密码：<input type="password" name = "newPassword">
			</p>
			<p>
				<input type="submit" value = "确认修改">
			</p>
		</fieldset>
	</form>
	<div style="color:red">${msg}</div>
</body>
</html>