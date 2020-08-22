<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加宿舍</title>
</head>
<body>
	<form:form modelAttribute="dormitory" action="insertDormitory" method="post">
		<fieldset>
			<legend>添加宿舍</legend>
			门牌号：<form:input path="name"/><br/>
			宿舍：<form:radiobutton path="sex" value="男"/>男
					<form:radiobutton path="sex" value="女"/>女<br/>
			几人舍：<form:input path="yd_number"/>
			实住人数：<form:input path="sd_number"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="添加">
		</fieldset>
	</form:form>
</body>
</html>