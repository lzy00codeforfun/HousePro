<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Signup</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
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
    <!-- js -->
    <script src="js/jquery-2.2.3.min.js"></script>
    <script src="js/distpicker.min.js"></script>
    <!-- //js -->
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
    <section class="mtop info-page" id="register">

        <div class="container">
            <div class="row">
                <div class="logo-login col-sm-12 ">
                    <a href="index.html" class="logo_text" style="font-size:40px">
                        注册
                    </a>
                </div>
                <form id="sign-up" name="sign_up" method="post" autocomplete="off" role="form" action="user/registerturn">

                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <input type="text" name="username" id="user_id" class="form-control col-md-12" maxlength="32"
                            placeholder="用户名" required>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="phone" class="control-label col-md-12">Phone No</label> -->
                        <input type="text" name="phone" id="phone" onkeypress="return isNumber(event)" class="form-control col-md-12 no-paste"
                            placeholder="电话号码" required>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="fname" class="control-label col-md-12">First Name</label> -->
                        <input type="text" name="real_name" id="name" class="form-control col-md-12" placeholder="真实姓名"
                            required>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="package" class="control-label col-md-12">Package</label> -->
                        <select class="form-control" id="card" name="card" required>
                            <option selected value="shenfenzheng">身份证</option>
                            <option value="huzhao">护照</option>
                        </select>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="lname" class="control-label col-md-12">Last Name</label> -->
                        <input type="text" name="id_num" id="id_num" class="form-control col-md-12" placeholder="证件号码"
                            required>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="password" class="control-label col-md-12">Password</label> -->
                        <input type="password" maxlength="32" name="password" id="password" class="form-control col-md-12"
                            required placeholder="密码">
                    </div>

                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="country_name" class="control-label col-md-12">Country Name</label> -->
                        <select class="form-control" id="province" name="province" onchange="selectprovince(this);"
                            required>
                        </select>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="country_name" class="control-label col-md-12">Country Name</label> -->
                        <select class="form-control" id="city" name="city" required>
                        </select>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <a href="#" data-toggle="modal" data-target="#price" class="see col-md-12 col-sm-12 col-xs-12">阅读协议</a>
                    </div>
                    <div class="checkbox">
                        <!-- <label for="news_subscription"><input type="checkbox" id="news_subscription" name="news_subscription" value="yes" checked="checked">News Subscribe Data</label> -->
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center">
                        <button id="register-btn" type="submit" class="btn btn-blue col-md-12 col-sm-12 col-xs-12">同意协议并注册</button>
                    </div>
                </form>
                <div class="add_account col-md-12 col-sm-12 col-xs-12">
                    已有账号 <a href="tologin">登录</a>
                </div>
            </div>
        </div>
    </section>
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
    <script src="js/jquery.filterizr.js"></script>
    <script src="js/controls.js"></script>
    <script type="text/javascript">
        $(function () {
            //Initialize filterizr with default options
            $('.filtr-container').filterizr();
        });
    </script>
    <!-- swipe box js -->
    <script src="js/jquery.swipebox.min.js"></script>
    <script type="text/javascript">
        jQuery(function ($) {
            $(".swipebox").swipebox();
        });
    </script>
    <!-- //swipe box js -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>

</html>