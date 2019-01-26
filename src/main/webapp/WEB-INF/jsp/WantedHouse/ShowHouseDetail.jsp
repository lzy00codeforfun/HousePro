<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <title>Show</title>
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
    <link href="../css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="../css/style.css" type="text/css" rel="stylesheet" media="all">
    <link rel="stylesheet" href="../css/swipebox.css">
    <link rel="stylesheet" href="../css/flexslider.css" type="text/css" media="screen" />
    <!-- //Custom Theme files -->
    <!-- font-awesome icons -->
    <link href="../css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome icons -->
    <!-- js -->
    <script src="../js/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="../js/jquery.jcarousellite.min.js"></script>
    <script src="../js/distpicker.min.js"></script>

    <!-- //js -->
    <!-- web-fonts -->
    <link href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic"
        rel="stylesheet" type="text/css">
    <!-- //web-fonts -->

</head>

<body>
 <div class="header">
			<div class="navbar-fixed-container">

				<div class="navbar navbar-fixed-top affix" data-spy="affix" data-offset-top="0">
					<nav role="navigation" class="nav-top">
						<div class="container">
							<div class="nav navbar-header">
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapes" aria-label="Expand and Collapse Menu">
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
								<a class="navbar-brand" href="../FrontPage">
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
											<li><a href="../houseInfor/toinsertHouse">房源</a></li>
											<li><a href="../wantedInfor/toinsertWanted">求租</a></li>
										</ul>
									</li>
									<li class="dropdown menu-item-has-child">
										<a href="#" data-toggle="dropdown" data-target="#">搜索<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="../houseInfor/searchFront">房源</a></li>
											<li><a href="../wantedInfor/searchFront">求租</a></li>
										</ul>
									</li>
								<c:if test="${empty cuser}">
	                                <li class="nav-log">
	                                    <a href="../tologin"> 登录</a>
	                                </li>'
	                                <li class="nav-log">
										<a href="../toregister">注册</a>
									</li>
								 </c:if>
									
								<c:if test="${not empty cuser}">
	                                <li class="nav-log" >
	                                    <a href="../user/UserFront?username=${cuser}" id="cuser_id">${cuser}</a>
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
		
    <div class="show-area container">
        <div class="col-lg-12 show-area-head row">
            <div class="col-lg-10 col-sm-12">
                <h1>${house.title }</h1>
            </div>
            <div class="col-lg-2 " style="padding:0 30px;">
                <button href="baidu.com" onclick="">联系</button>
            </div>
        </div>
        <div class="col-lg-12 row show-area-body">

            <div class="col-lg-4 col-sm-12 show-text-area col-lg-offset-1 col-md-offset-1">
                <div class="area-price row">
                    <p class="col-lg-4 col-md-4 col-sm-4">
                        <l style="color:red; font-size:30px; font-weight: bold;">${house.rent_lb }</l>
                    </p>
                    <p class="col-lg-2 col-md-2" style="margin-left:-15px; font-size: 20px;">
                        ~
                    </p>
                    <p class="col-lg-6 col-md-6 col-sm-6">
                        <l style="color:red; font-size:30px; font-weight: bold;">${house.rent_ub }</l>
                        <l class="text-black">元/月</l>
                    </p>
                </div>
                <div class="area-price row" style="margin-top:8px;">
                    <p class="row-lg-4 col-sm-4 col-sm-4">
                        <l style="color:black; font-size:30px; font-weight: bold;">${house.area_lb }</l>
                        <l class="text-black">m<sup>2</sup></l>
                    </p>
                    <p class="col-lg-2 col-md-2" style="margin-left:-15px; font-size: 20px;">
                        ~
                    </p>
                    <p class="row-lg-5 col-sm-5 col-sm-5">
                        <l style="color:black; font-size:30px; font-weight: bold;">${house.area_ub }</l>
                        <l class="text-black">m<sup>2</sup></l>
                    </p>
                </div>
                <hr width="100%">
                <div class="low-show row">
                    <div class="col-xs-7 col-md-7">
                        <p>${house.city }|${house.district }|${house.community }</p>
                    </div>
                    <div class="col-xs-5">
                        <p>
                            <l>${house.floor_lb }</l>
                            <l>~</l>
                            <l>${house.floor_ub }</l>
                            <l>楼</l>
                        </p>
                    </div>

                </div>
                <div class="low-show row">
                    <div class="col-xs-7 col-md-7">
                        <p>
                            ${house.type }
                        </p>
                    </div>
                    <div class="col-xs-5">
                    	<c:if test="${house.elevator==1}">
                        	<p><l>有</l>电梯</p>
                        </c:if>
                        <c:if test="${house.elevator==0}">
                        	<p><l>无</l>电梯</p>
                        </c:if>
                    </div>
                </div>
                <div class="low-show-last row">
                    <div class="col-xs-6">
                        <p>
                            <l>租客：</l><a id="id_c" name="id_c" href="../user/getUserDetail?getuser=${house.username }" alert="afuisdhfs">${house.username }</a>
                        </p>
                    </div>
                    <div class="col-xs-6">
                        <p>
                            <l>编号：</l>
                            <l name="id_h" id="id_h">${house.house_id }</l>
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-sm-12 show-text-area col-lg-offset-1 col-md-offset-1">
                <div class="show-des">
                    <p>${house.description}</p>
                </div>
            </div>

        </div>
    </div>










    <script defer src="../js/jquery.flexslider.js"></script>
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
    <script src="../js/modernizr.js"></script> <!-- Modernizr -->
    <script src="../js/menu.js"></script> <!-- Resource jQuery -->
    <!-- //menu-js -->
    <!-- Kick off Filterizr -->
    <script src="../js/jquery.filterizr.js"></script>
    <script src="../js/controls.js"></script>
    <script type="text/javascript">
        $(function () {
            //Initialize filterizr with default options
            $('.filtr-container').filterizr();
        });
    </script>
    <!-- swipe box js -->
    <script src="../js/jquery.swipebox.min.js"></script>
    <script type="text/javascript">
        jQuery(function ($) {
            $(".swipebox").swipebox();
        });
    </script>


    <!-- //swipe box js -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../js/bootstrap.js"></script>

</body>

</html>