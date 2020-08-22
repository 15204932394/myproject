<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>打扫记录</title>
<script type="text/javascript">
	function deleteHealth(id) {
		if(window.confirm("你确定要删除这条数据吗")){
			document.getElementById("myform").action="deleteHealth?id="+id;
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
	<form:form modelAttribute="health" action="healthSelect" method="post">
		<fieldset>
			<legend>宿舍</legend>
			<p>
				<label>门牌号：</label>
				<form:input path="ss_name"/>
				<label>打扫时间：</label>
				<form:input path="timees"/>
				<label>值日生：</label>
				<form:input path="xs_name"/>
				<label>评价：</label>
				<form:input path="grade"/>
			</p>
			<p>
				<a href="toiIsertHealth">
					<input type="button" onclick="window.location.href('toiIsertHealth')" value="添加">
				</a>
				<input type="submit" value="查询">
			</p>
		</fieldset>
	</form:form>


	<c:if test="${healths.size() == 0 }">
		查无此人
	</c:if>

	<c:if test="${healths.size() != 0 }">
		<form id = "myform" method="post">
			<table border="1">
				<tr>
					<td width="50px">ID</td>
					<td width="150px">门牌号</td>
					<td width="90px">打扫时间</td>
					<td width="100px">值日生</td>
					<td width="100px">评价</td>
					<td width="100px">操作</td>
				</tr>
				<c:forEach items="${healths}" var="health">
					<tr>
						<td>${health.id }</td>
						<td>${health.ss_name }</td>
						<td>${health.timees }</td>
						<td>${health.xs_name }</td>
						<td>${health.grade }</td>
						<td>
							<a href="oneSelectModifyHealth?id=${health.id }">修改</a>
							<a href="javascript:deleteHealth('${health.id }')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</c:if>
</body>
</html>