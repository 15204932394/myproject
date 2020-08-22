<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页面</title>
<style type="text/css">
	* {
		margin: 0px;
		padding: 0px;
	}
	
	body {
		font-family: Arial, Helvetica, sans-serif;
		font-size: 12px;
		margin: 0px auto;
		height: auto;
		width: 800px;
		border: 1px solid #006633;
	}
	#header {
		height: 90px;
		width: 800px;
		margin: 0px 0px 3px 0px;
	}
	
	#header h1 {
		text-align: center;
		font-family: 华文彩云;
		color: #000000;
		font-size: 30px;
	}

	#navigator {
		height: 25px;
		width: 800px;
		font-size: 14px;
	}
	#navigator ul {
		list-style-type: none;
	}
	#navigator li {
		float: left;
		position: relative;
	}
	#navigator li a {
		color: #000000;
		text-decoration: none;
		padding-top: 4px;
		display: block;
		width: 157px;
		height: 22px;	
		text-align: center;
		background-color: PaleGreen;
		margin-left: 2px;
	}
	#navigator li a:hover {
		background-color: #006633;
		color: #FFFFFF;
	}
	#navigator ul li ul {
	   visibility: hidden;
	   position: absolute;
	}
	
	#navigator ul li:hover ul,
	#navigator ul a:hover ul{
	   visibility: visible;
	}
	
	#content {
		height: auto;
		width: 780px;
		padding: 10px;
	}
	
	#content iframe {
		height: 500px;
		width: 780px;
	}
</style>
</head>
<body>
	<div id="header">
		<h1>欢迎${user.username}进入系统</h1>
	</div>
	
	
	<div id="navigator">
		<ul>
			<li>
				<a>我的面板</a>
				<ul>
					<li><a href="gerenSelect" target="center">个人信息</a></li>
					<li><a href="toChangePassword" target="center">修改密码</a></li>
				</ul>
			</li>
			<li>
				<a>管理员管理</a>
				<ul>
					<li><a href="userSelect" target="center">管理员列表</a></li>
				</ul>
			</li>
			<li>
				<a>学生管理</a>
				<ul>
					<li><a href="studentSelect" target="center">学生列表</a></li>
				</ul>
			</li>
			<li>
				<a>班级管理</a>
				<ul>
					<li><a href="classesSelect" target="center">班级列表</a></li>
				</ul>
			</li>
			<li>
				<a>宿舍管理</a>
				<ul>
					<li><a href="dormitorySelect" target="center">宿舍信息</a></li>
					<li><a href="healthSelect" target="center">卫生打扫记录</a></li>
					<li><a href="repairSelect" target="center">维修记录</a></li>
				</ul>
			</li>
		</ul>
	
	</div>
	
	<div id="content">
		<iframe name="center"></iframe>
	
	</div>
</body>
</html>