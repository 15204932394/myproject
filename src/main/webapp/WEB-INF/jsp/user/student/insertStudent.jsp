<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
</head>
<body>
	<form:form modelAttribute="student" action="insertStudent" method="post">
		<fieldset>
			<legend>添加学生</legend>
			学    号：<form:input path="xs_number"/>
			姓&nbsp;&nbsp;&nbsp;名：<form:input path="name"/>
			年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：	<form:input path="age"/><br/>
			性    别：<form:radiobutton path="sex" value="男"/>男
					<form:radiobutton path="sex" value="女"/>女<br/>
			手机号：<form:input path="phone"/>
			入学时间：<form:input path="rx_date"/><br/>
			学    院：<form:input path="college"/>
			专 &nbsp;&nbsp;&nbsp;业：<form:input path="speciality"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="添加">
		</fieldset>
	</form:form>
</body>
</html>