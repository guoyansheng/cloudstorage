<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="icon" href="./../images/web_icon.jpg" type="image/x-icon" />
		<script src="./../js/jQuery/jquery-3.1.1.min.js"></script>
		<script src="./../js/jQuery/jquery-3.1.1.js"></script>
		<script type="text/javascript">
			function load_home() {
				//document.getElementById("main").innerHTML = '<object type="text/html" data="./left.jsp" width="400px" height="600px"></object>';
				//$("#main").load("./left.jsp");
			}
			$(document).ready(function() {
				$("#main").load("./left.jsp");
			});
		</script>
		
		<title>主页</title>
	</head>

	<body>
		<div id="main" style="float:left;"></div>
		<div id="" style="float:left;">
			<div id="">
				头部导航
			</div>
			<div>
				<div style="float:left; width:100px; height:100px; border:2px solid #0000FF;"></div>
				<div style="float:left; width:300px; height:100px; border-right:2px solid #0000FF; border-top:2px solid #0000FF; border-bottom:2px solid #0000FF;">
				</div>
			</div>
			<br/>
			<div>
				<div style="float:left;width:100px; height:100px; border:2px solid #0000FF;"></div>
				<div style="float:left;width:100px; height:100px; border:2px solid #0000FF;"></div>
			</div>

		</div>

	</body>

</html>