<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改学生</title>
</head>
<body>
	<form:form modelAttribute="student" action="modifyStudent" method="post">
		<fieldset>
			<legend>修改学生</legend>
			<form:hidden path="id"/>
			学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：<form:input path="xs_number"/><br/>
			姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<form:input path="name"/><br/>
			年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：	<form:input path="age"/><br/>
			性    别：<form:radiobutton path="sex" value="男"/>男
					<form:radiobutton path="sex" value="女"/>女<br/>
			手&nbsp;&nbsp;机&nbsp;&nbsp;号：<form:input path="phone"/><br/>
			入学时间：<form:input path="rx_date"/><br/>
			学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;院：<form:input path="college"/><br/>
			专 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业：<form:input path="speciality"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="修改">
		</fieldset>
	</form:form>
</body>
</html>