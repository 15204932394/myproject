<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户</title>
<script type="text/javascript">
	function deleteuser(id) {
		if(window.confirm("你确定要删除这条数据吗")){
			document.getElementById("myform").action="deleteuser?id="+id;
			document.getElementById("myform").submit();
		}
	}
</script>
<style type="text/css">
	a{ text-decoration:none}
	a:hover{ text-decoration:none}
</style>
</head>
<body>
	<form:form modelAttribute="user" action="userSelect" method="post">
		<fieldset>
			<legend>用户</legend>
			<p>
				<label>用户名：</label>
				<form:input path="username"/>
				<label>姓名：</label>
				<form:input path="name"/>
				<label>性别：</label>
				<form:input path="sex"/><br/>
				<label>职位：</label>
				<form:radiobutton path="position" value="学生"/>学生
				<form:radiobutton path="position" value="维修员"/>维修员
				<form:radiobutton path="position" value="班级管理员"/>班级管理员<br/>
			</p>
			<p>
				<a href="addUser">
					<input type="button" onclick="window.location.href('addUser')" value="添加">
				</a>
				<input type="submit" value="查询">
			</p>
		</fieldset>
	</form:form>


	<c:if test="${users.size() == 0 }">
		查无此人
	</c:if>

	<c:if test="${users.size() != 0 }">
		<form id = "myform" method="post">
			<table border="1">
				<tr>
					<td width="50px">ID</td>
					<td width="100px">用户名</td>
					<td width="80px">姓名</td>
					<td width="40px">性别</td>
					<td width="40px">年龄</td>
					<td width="100px">职位</td>
					<td width="120px">手机号</td>
					<td width="80px">邮箱</td>
					<td width="80px">操作</td>
				</tr>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.id }</td>
						<td>${user.username }</td>
						<td>${user.name }</td>
						<td>${user.sex }</td>
						<td>${user.age }</td>
						<td>${user.position }</td>
						<td>${user.phone }</td>
						<td>${user.email }</td>
						<td>
							<a href="oneSelectModifyUser?id=${user.id }">修改</a>
							<a href="javascript:deleteuser('${user.id }')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</c:if>
</body>
</html>