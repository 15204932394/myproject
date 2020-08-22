<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿舍</title>
<script type="text/javascript">
	function deleteDormitory(id) {
		if(window.confirm("你确定要删除这条数据吗")){
			document.getElementById("myform").action="deleteDormitory?id="+id;
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
	<form:form modelAttribute="dormitory" action="dormitorySelect" method="post">
		<fieldset>
			<legend>宿舍</legend>
			<p>
				<label>门牌号：</label>
				<form:input path="name"/>
				宿舍：<form:radiobutton path="sex" value="男"/>男
					<form:radiobutton path="sex" value="女"/>女<br/>
				<label>几人舍：</label>
				<form:input path="yd_number"/>
			</p>
			<p>
				<a href="toiIsertDormitory">
					<input type="button" onclick="window.location.href('toiIsertDormitory')" value="添加">
				</a>
				<input type="submit" value="查询">
			</p>
		</fieldset>
	</form:form>


	<c:if test="${dormitorys.size() == 0 }">
		查无此人
	</c:if>

	<c:if test="${dormitorys.size() != 0 }">
		<form id = "myform" method="post">
			<table border="1">
				<tr>
					<td width="50px">ID</td>
					<td width="150px">门牌号</td>
					<td width="90px">男女宿舍</td>
					<td width="100px">几人舍</td>
					<td width="100px">实住人数</td>
					<td width="100px">操作</td>
				</tr>
				<c:forEach items="${dormitorys}" var="dormitory">
					<tr>
						<td>${dormitory.id }</td>
						<td>${dormitory.name }</td>
						<td>${dormitory.sex }</td>
						<td>${dormitory.yd_number }</td>
						<td>${dormitory.sd_number }</td>
						<td>
							<a href="oneSelectModifyDormitory?id=${dormitory.id }">修改</a>
							<a href="javascript:deleteDormitory('${dormitory.id }')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</c:if>
</body>
</html>