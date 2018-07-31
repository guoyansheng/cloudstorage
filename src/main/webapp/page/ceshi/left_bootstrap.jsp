<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Bootstrap 实例 - 垂直的胶囊式导航菜单</title>
		<link rel="stylesheet" href="./../js/bootstrap/css/bootstrap.min.css">
		<script src="./../js/jQuery/jquery-3.1.1.min.js"></script>
		<script src="./../js/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<style type="text/css">
		
		//定义标签
		li a{
			 margin-top: 50px;
		}
		
		//定义class
		.spread {
			margin-top: 50px;
		}
		
		.tight {
			word-spacing: -0.5em;
		}
	</style>

	<body>
		<p>垂直的胶囊式导航菜单</p>
		<div style="width:200px;">
			<ul class="nav nav-pills nav-stacked">
				<li class="active spread">
					<a class="spread" href="#">导航栏1</a>
				</li>
				<li class="spread">
					<a href="#">导航栏2</a>
				</li>
				<li>
					<a href="#">导航栏13</a>
				</li>
				<li>
					<a href="#">VB.Net</a>
				</li>
				<li>
					<a href="#">Java</a>
				</li>
				<li>
					<a href="#">PHP</a>
				</li>
			</ul>
		</div>
		<div style="padding-bottom: 150px;width:100px;padding-top:150px;background-color: blue;">
		</div>
	</body>

</html>