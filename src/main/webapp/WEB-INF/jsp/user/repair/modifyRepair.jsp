<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改维修记录</title>
</head>
<body>
	<form:form modelAttribute="repair" action="modifyRepair" method="post">
		<fieldset>
			<legend>修改宿舍</legend>
			<form:hidden path="id"/>
			维修时间：<form:input path="timees"/><br/>
			门牌号：<form:input path="ss_name"/><br/>
			维修员：<form:input path="name"/><br/>
			维修状态：<form:radiobutton path="situation" value="已维修"/>已维修
					<form:radiobutton path="situation" value="未维修"/>未维修<br/>
			维修物品：<form:input path="contents"/><br/>
			<input type="reset" value="重置">
			<input type="submit" value="修改">
		</fieldset>
	</form:form>
</body>
</html>