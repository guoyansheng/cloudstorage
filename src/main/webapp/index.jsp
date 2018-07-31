<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<!-- 引入jquery-->
	<script type="text/javascript" src="./js/jQuery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="./js/jQuery/jquery-3.1.1.min.js"></script>

	<script type="text/javascript">
		function ajaxTest() {
			setCookie("test",0);
			setCookie("test", parseInt(getCookie("test")) + 1);
			$.ajax({
				type: "post",
				dataType: "html",
				url: './personController/test.json',
				success: function(data) {
					if(data != "") {
						alert(data + "测试cookie:" +getCookie("test"));
					}
				}
			});
		}

		function setCookie(name,value)
		{
		    var Days = 30;
		    var exp = new Date();
		    exp.setTime(exp.getTime() + Days*24*60*60*1000);
		    document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
		}

		//读取cookies
		function getCookie(name)
		{
		    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");

		    if(arr=document.cookie.match(reg))

		        return unescape(arr[2]);
		    else
		        return null;
		}

		//删除cookies
		function delCookie(name)
		{
		    var exp = new Date();
		    exp.setTime(exp.getTime() - 1);
		    var cval=getCookie(name);
		    if(cval!=null)
		        document.cookie= name + "="+cval+";expires="+exp.toGMTString();
		}
	</script>

	<body>
		<h2>Hello World!</h2>
		<input type="button" value="ajax测试" onclick="ajaxTest()" />

	</body>

</html>