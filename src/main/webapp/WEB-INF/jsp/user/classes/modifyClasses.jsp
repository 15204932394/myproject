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
	<form:form modelAttribute="classes" action="modifyClasses" method="post">
		<fieldset>
			<legend>修改班级</legend>
			<form:hidden path="id"/>
			班级名：<form:input path="name"/><br/>
			班级人数：<form:input path="bj_number"/><br/>
			班级人员：<form:input path="lists"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="修改">
		</fieldset>
	</form:form>
</body>
</html>