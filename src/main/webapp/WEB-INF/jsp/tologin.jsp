<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
     <!-- js -->
    <script src="js/jquery-2.2.3.min.js"></script>
    <script src="js/distpicker.min.js"></script>
    <!-- //js -->
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <script type="text/javascript">
        function check(){
        	var att={account:"",password:""};
        	att.account=$("#account").val();
        	att.password=$("#pass").val();
        	var loginflag;
        	alert("login");
        	//var too = '<li class="nav-log"> <a href="#"> '+'pass_right'+'</a> </li>';
    		//$("#navigate").append(too); 
        	$.ajax({
                type: "post",
                url: "user/logincheck/ret",
                data: {account:att.account,password:att.password},
                dataType: "text",
                success: function (result) {
                	var jsobj=$.parseJSON(result);
                	if(jsobj[0].code=="1"){
                		alert(jsobj[0].msg);
                		loginflag="1";
                    	window.location.href="FrontPage";
                    }
                	else {
                		alert(jsobj[0].msg);
                	}
                	// jsonarray obj[0].name 
                	//alert(jsobj.ttt); //foo
                	//var i;
                	//for(i=0;i<jsobj.length;i++){
                	//	alert(jsobj[i].ttt);
                	//}
    				//alert(result);
    				//alert(Object.keys(jsobj)[0]);
    				//alert("sucessful login");
    				//var row = '<li class="nav-log"> <a href="#"> '+ result +'</a> </li>';
            		//$("#navigate").append(row); 
                },
                error:function(data, XMLHttpRequest, textStatus, errorThrown){  
                	alert("error"); 
                	  }
            });
        	
        }
    </script>
    <!-- Custom Theme files -->
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="css/style.css" type="text/css" rel="stylesheet" media="all">
    <link rel="stylesheet" href="css/swipebox.css">
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    <!-- //Custom Theme files -->
    <!-- font-awesome icons -->
    <link href="css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome icons -->

    <!-- web-fonts -->
    <link href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'
        rel='stylesheet' type='text/css'>
    <!-- //web-fonts -->
</head>

<body>
   <!-- banner -->
   	<!-- top-nav -->
		<div class="header">
			<div class="navbar-fixed-container">

				<div class="navbar navbar-fixed-top affix" data-spy="affix" data-offset-top="0">
					<nav role="navigation" class="nav-top">
						<div class="container">
							<div class="nav navbar-header">
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse" aria-label="Expand and Collapse Menu">
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
								<a class="navbar-brand" href="FrontPage">
									<span itemprop="navbar-brand">House Pro</span>
								</a>
							</div>
							<div class="navbar-collapse collapse">
								
								
								<div data-toggle="distpicker" class="nav-location col-xs-4 col-md-4">
									<select data-province="北京市" id="s-province"></select>
									<select data-city="北京市" id="s-city"></select>
								</div>
								<script type="text/javascript">
									$("#distpicker").distpicker('destroy');
									$('#distpicker').distpicker({
										province: '北京市',
										city: '北京市',
										placeholder:false
									});
								</script>
								
								<ul class="nav navbar-nav navbar-right">
									<li class="dropdown menu-item-has-child">
										<a href="#" data-toggle="dropdown" data-target="#">发布<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="houseInfor/toinsertHouse?username=${cuser}">房源</a></li>
											<li><a href="wantedInfor/toinsertWanted?username=${cuser}">求租</a></li>
										</ul>
									</li>
									<li class="dropdown menu-item-has-child">
										<a href="#" data-toggle="dropdown" data-target="#">搜索<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="houseInfor/searchFront?username=${cuser}">房源</a></li>
											<li><a href="wantedInfor/searchFront?username=${cuser}">求租</a></li>
										</ul>
									</li>
								<c:if test="${empty cuser}">
	                                <li class="nav-log">
	                                    <a href="tologin"> 登录</a>
	                                </li>'
	                                <li class="nav-log">
										<a href="toregister">注册</a>
									</li>
								 </c:if>
									
								<c:if test="${not empty cuser}">
	                                <li class="nav-log">
	                                    <a href="user/UserFront?username=${cuser}">${cuser}</a>
	                                </li>
								 </c:if>	
								 
								</ul>
							</div>
						</div>
					</nav>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
    
    <div class= "container login-form">
        <div class="logo-login">
            <a class="logo-name">House Pro</a>
        </div>
        <div class="form-login" role="form">
            <div class="form-group">
                 <input type="text" class="form-control" id="account" placeholder="用户名" maxlength="32" required>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" id="pass" placeholder="密码" maxlength="32" required>
            </div>
            <div class="form-group">
                <button class="btn btn-lg btn-primary btn-block"  onclick="check()">登录</button>
            </div>
        </div>
        <div class="else-login row">
            <a href="#" id="forget_password">忘记密码</a> 
            <a href="toregister" id="register">注册</a>
            <a href="toadminlogin" id="adminlogin" class="pull-right">我是管理员</a>
        </div>
    </div>
    <!-- //banner -->
    <!-- banner-bottom -->
    <!-- //modal-about -->
    <!-- FlexSlider -->
    <script defer src="js/jquery.flexslider.js"></script>
    <script type="text/javascript">
        $(window).load(function () {
            $('.flexslider').flexslider({
                animation: "slide",
                start: function (slider) {
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
    <!-- End-slider-script -->
    <!-- start-smooth-scrolling -->
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();

                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <!-- //end-smooth-scrolling -->
    <!-- menu-js -->
    <script src="js/modernizr.js"></script> <!-- Modernizr -->
    <script src="js/menu.js"></script> <!-- Resource jQuery -->
    <!-- //menu-js -->
    <!-- Kick off Filterizr -->
    <script src="js/controls.js"></script>
    <script type="text/javascript">
        $(function () {
            //Initialize filterizr with default options
            $('.filtr-container').filterizr();
        });
    </script>
    <!-- swipe box js -->
    <!-- //swipe box js -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>

</html>