<%@ page language="java" contentType="text/html; charset=utf-8"
     pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <script type="text/javascript" src="./js/jQuery/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="./js/jQuery/jquery-3.1.1.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>测试</title>
        <script type="text/javascript">
		function ajaxTest() {

			$.ajax({
				type: "post",
				dataType: "html",
				url: './personController/test.json',
				success: function(data) {
					if(data != "") {
						alert(data);
					}
				}
			});

		}
	</script>
    </head>
    <body>
        <form action="testController/test1.htm" method="post" onsubmit="return check()" >
        
        
        
        <input type="submit" value="提交">
        </form>
    </body>
</html>