<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>班级</title>
<script type="text/javascript">
	function deleteClasses(id) {
		if(window.confirm("你确定要删除这条数据吗")){
			document.getElementById("myform").action="deleteClasses?id="+id;
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
	<form:form modelAttribute="classes" action="classesSelect" method="post">
		<fieldset>
			<legend>学生</legend>
			<p>
				<label>班级名：</label>
				<form:input path="name"/>
				<label>班级人员：</label>
				<form:input path="lists"/>
			</p>
			<p>
				<a href="toiIsertClasses">
					<input type="button" onclick="window.location.href('toiIsertClasses')" value="添加">
				</a>
				<input type="submit" value="查询">
			</p>
		</fieldset>
	</form:form>


	<c:if test="${classess.size() == 0 }">
		查无此人
	</c:if>

	<c:if test="${classess.size() != 0 }">
		<form id = "myform" method="post">
			<table border="1">
				<tr>
					<td width="50px">ID</td>
					<td width="150px">班级名</td>
					<td width="90px">班级人数</td>
					<td width="400px">班级人员</td>
					<td width="100px">操作</td>
				</tr>
				<c:forEach items="${classess}" var="classes">
					<tr>
						<td>${classes.id }</td>
						<td>${classes.name }</td>
						<td>${classes.bj_number }</td>
						<td>${classes.lists }</td>
						<td>
							<a href="oneSelectModifyClasses?id=${classes.id }">修改</a>
							<a href="javascript:deleteClasses('${classes.id }')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</c:if>
</body>
</html>