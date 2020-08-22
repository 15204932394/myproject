<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改宿舍</title>
</head>
<body>
	<form:form modelAttribute="dormitory" action="modifyDormitory" method="post">
		<fieldset>
			<legend>修改宿舍</legend>
			<form:hidden path="id"/>
			门牌号：<form:input path="name"/><br/>
			性    别：<form:radiobutton path="sex" value="男"/>男
					<form:radiobutton path="sex" value="女"/>女<br/>
			几人舍：<form:input path="yd_number"/><br/>
			实住人数：<form:input path="sd_number"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="修改">
		</fieldset>
	</form:form>
</body>
</html>