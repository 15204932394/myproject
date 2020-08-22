<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	a{ text-decoration:none}
	a:hover{ text-decoration:none}
</style>
<title>登录页面</title>
</head>
<body>
<div style="width:100%;text-align:center">
	<form action="doLogin" method="post">
		用户名：<input type="input" name="username" placeholder="请输入用户名"><br/>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" placeholder="请输入密码"><br/>
		<a href="registered">
			<input type="button" onclick="window.location.href('registered')" value="注册">
		</a>
		<input type="submit" value="登录">
	</form>
	<div style="color: red">${msg}</div> 
</div>
</body>
</html>