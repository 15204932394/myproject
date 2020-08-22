<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>维修记录</title>
<script type="text/javascript">
	function deleteRepair(id) {
		if(window.confirm("你确定要删除这条数据吗")){
			document.getElementById("myform").action="deleteRepair?id="+id;
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
	<form:form modelAttribute="repair" action="repairSelect" method="post">
		<fieldset>
			<legend>宿舍</legend>
			<p>
				<label>维修时间：</label>
				<form:input path="timees"/>
				<label>门牌号：</label>
				<form:input path="ss_name"/>
				<label>维修员：</label>
				<form:input path="name"/>
				宿舍：<form:radiobutton path="situation" value="已维修"/>已维修
					<form:radiobutton path="situation" value="未维修"/>未维修<br/>
				<label>维修物品：</label>
				<form:input path="contents"/>
			</p>
			<p>
				<a href="toiIsertRepair">
					<input type="button" onclick="window.location.href('toiIsertRepair')" value="添加">
				</a>
				<input type="submit" value="查询">
			</p>
		</fieldset>
	</form:form>


	<c:if test="${repairs.size() == 0 }">
		查无此人
	</c:if>

	<c:if test="${repairs.size() != 0 }">
		<form id = "myform" method="post">
			<table border="1">
				<tr>
					<td width="50px">ID</td>
					<td width="150px">维修时间</td>
					<td width="90px">门牌号</td>
					<td width="100px">维修员</td>
					<td width="100px">维修状况</td>
					<td width="100px">维修物品</td>
					<td width="100px">操作</td>
				</tr>
				<c:forEach items="${repairs}" var="repair">
					<tr>
						<td>${repair.id }</td>
						<td>${repair.timees }</td>
						<td>${repair.ss_name }</td>
						<td>${repair.name }</td>
						<td>${repair.situation }</td>
						<td>${repair.contents }</td>
						<td>
							<a href="oneSelectModifyRepair?id=${repair.id }">修改</a>
							<a href="javascript:deleteRepair('${repair.id }')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</c:if>
</body>
</html>