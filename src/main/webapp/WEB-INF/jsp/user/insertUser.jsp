<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<form:form modelAttribute="user" action="insertPersonUser" method="post">
			用户名：<form:input path="username"/><br/>
			密&nbsp;&nbsp;&nbsp;码：<form:input path="password"/><br/>
			姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：	<form:input path="name"/><br/>
			性    别：<form:radiobutton path="sex" value="男"/>男
					<form:radiobutton path="sex" value="女"/>女<br/>
			年龄：<form:input path="age"/><br/>
			职位：<form:radiobutton path="position" value="学生"/>学生
				<form:radiobutton path="position" value="维修员"/>维修员
				<form:radiobutton path="position" value="班级管理员"/>班级管理员<br/>
			手机号：<form:input path="phone"/><br/>
			邮箱：<form:input path="email"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="注册">
	</form:form>
</center>
</body>
</html>