<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加打扫记录</title>
</head>
<body>
	<form:form modelAttribute="health" action="insertHealth" method="post">
		<fieldset>
			<legend>添加宿舍</legend>
			门牌号：<form:input path="ss_name"/><br/>
			打扫时间：<form:input path="timees"/><br/>
			值日生：<form:input path="xs_name"/>
			评价：<form:input path="grade"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="添加">
		</fieldset>
	</form:form>
</body>
</html>