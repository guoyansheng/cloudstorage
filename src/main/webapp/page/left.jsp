<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>菜单栏</title>
		
		<link rel="icon" href="./../images/web_icon.jpg" type="image/x-icon" />
		<link rel="stylesheet" href="./../js/bootstrap/css/bootstrap.min.css">
		<script src="./../js/jQuery/jquery-3.1.1.min.js"></script>
		<script src="./../js/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<style type="text/css">

		body{font-size: 18px;font-family: "宋体","微软雅黑";} 
		.list{width:260px;}
		.list ul li{background-color: #BBFFEE;margin-top: 2px;border-radius: 5px;list-style-type:none;}
		.list ul li a{padding-left: 10px; display: block; font-weight:bold; height:36px;line-height: 36px;position: relative;  
    }  
		.list ul li .inactive { background:url(./../images/off.png) no-repeat 210px center;}  
		.list ul li .inactives{ background:url(./../images/on.png) no-repeat 210px center;}   
		.list ul li ul{display: none;}  
		.list ul li ul li .inactive {background:url(./../../images/on.png) no-repeat 154px center;}   
		.list ul li ul li .inactives{background:url(./../../images/on.png) no-repeat 154px center;}  
		.list ul li ul li { border-left:1px; border-right:0; background-color:#FFFFFF; border-color:#467ca2;margin-top: 2px;}  
		.list ul li ul li ul{display: none;}  
		.list ul li ul li a{ padding-left:20px;}  
		.list ul li ul li ul li { background-color:#BBFFEE; }  
	</style>

	<script type="text/javascript">  
    $(document).ready(function() {  
        $('.inactive').click(function(){  
            if($(this).siblings('ul').css('display')=='none'){  
                $(this).addClass('inactives');  
                $(this).siblings('ul').slideDown(100).children('li');  
            }else{  
                $(this).removeClass('inactives');  
                $(this).siblings('ul').slideUp(100);  
            }  
        })  
    });  
    </script>  

	<body>
		<div style="margin-left: 50px;">
			导航栏
		</div>
		<div class="list">
			<ul class="yiji">  
            <li><a href="#">后台管理员</a></li>  
            <li><a href="#" class="inactive active">用户管理</a>  
            <li><a href="#" class="inactive active">交易查询</a>  
                <ul>  
                    <li><a href="#">提现查询</a></li>  
                    <li><a href="#">交易查询</a></li>  
                    <li><a href="#">转账查询</a></li>  
                </ul>  
            </li>  
            <li><a href="#" class="inactive">商品管理</a>  
                <ul style="display: none">  
                    <li><a href="#" class="inactive active">商品类型管理</a></li>  
                    <li><a href="#" class="inactive active">违规记录</a> </li>  
                    <li class="last"><a href="#">禁止售物品</a></li>  
                </ul>  
            </li>  
        </ul>  
		</div>
	</body>

</html>