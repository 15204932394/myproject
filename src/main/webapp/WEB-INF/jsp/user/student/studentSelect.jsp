<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生</title>
<script type="text/javascript">
	function deleteStudent(id) {
		if(window.confirm("你确定要删除这条数据吗")){
			document.getElementById("myform").action="deleteStudent?id="+id;
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
	<form:form modelAttribute="student" action="studentSelect" method="post">
		<fieldset>
			<legend>学生</legend>
			<p>
				<label>姓名：</label>
				<form:input path="name"/>
				性    别：<form:radiobutton path="sex" value="男"/>男
					<form:radiobutton path="sex" value="女"/>女<br/>
				<label>学院：</label>
				<form:input path="college"/><br/>
				<label>专业：</label>
				<form:input path="speciality"/>
			</p>
			<p>
				<a href="toiIsertStudent">
					<input type="button" onclick="window.location.href('toiIsertStudent')" value="添加">
				</a>
				<input type="submit" value="查询">
			</p>
		</fieldset>
	</form:form>


	<c:if test="${students.size() == 0 }">
		查无此人
	</c:if>

	<c:if test="${students.size() != 0 }">
		<form id = "myform" method="post">
			<table border="1">
				<tr>
					<td width="50px">ID</td>
					<td width="100px">学号</td>
					<td width="80px">姓名</td>
					<td width="40px">年龄</td>
					<td width="40px">性别</td>
					<td width="120px">手机号</td>
					<td width="120px">入学时间</td>
					<td width="80px">学院</td>
					<td width="80px">专业</td>
					<td width="80px">操作</td>
				</tr>
				<c:forEach items="${students}" var="student">
					<tr>
						<td>${student.id }</td>
						<td>${student.xs_number }</td>
						<td>${student.name }</td>
						<td>${student.age }</td>
						<td>${student.sex }</td>
						<td>${student.phone }</td>
						<td>${student.rx_date }</td>
						<td>${student.college }</td>
						<td>${student.speciality }</td>
						<td>
							<a href="oneSelectModify?id=${student.id }">修改</a>
							<a href="javascript:deleteStudent('${student.id }')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</c:if>
</body>
</html>