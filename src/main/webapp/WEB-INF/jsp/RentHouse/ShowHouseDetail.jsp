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
    <script src="../js/distpicker.min.js"></script>
    <script type="text/javascript" src="../js/jquery.jcarousellite.min.js"></script>

    <!-- //js -->
    <!-- web-fonts -->
    <link href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic"
        rel="stylesheet" type="text/css">
    <!-- //web-fonts -->
	<script type="text/javascript">
		function RequireHouse(){
			var hostid=$("#id_c").text();
			var guestid=$("#cuser_id").text();
			var month=$("#length-rent").val();
		//	alert(hostid);
		//	alert(guestid);
			var house_id=$("#id_h").text();
		//	alert("month");
		//	alert(month)
			if(hostid==guestid){
				alert("it's your own house. no need to require");
				window.location.href="../houseInfor/getHouseDetail?house_id="+house_id;
			}
			else{
				alert(month);
				alert(house_id);
				window.location.href="../user/RequireHouse?house_id="+house_id+"&month="+month;
			}
		//	alert("done");
		}
	</script>
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
            <div class="col-lg-10 col-sm-10">
                <h1>${house.title }</h1>
            </div>
            <div class="col-lg-2  " style="padding:0 30px;">
                <button data-toggle="modal" data-target="#sign-mod">预定房源</button>
            </div>
        </div>
        <div class="col-lg-12 row show-area-body">
            <div class="col-lg-8 col-sm-12 show-img-area">
                <div class="show-gallery row">
                    <div class="show-big-img">
                        <img src="${photolist[0].url }">
                    </div>

                    <button class="prev show-btn">&lt;</button>
                    <div class="gallery">
                        <ul>
                        	<c:forEach var="pl" items="${photolist }">
	                            <li>
	                                <img class="action-img" src="${pl.url }">
	                            </li>
                            </c:forEach>
                        </ul>
                    </div>

                    <button class="next show-btn">&gt;</button>
                    <script type="text/javascript">
                        $(function () {
                            $(".gallery").jCarouselLite({
                                btnNext: " .next",
                                btnPrev: " .prev",
                                visible: 4,
                            });

                            $(".action-img").click(function () {
                                $(".show-gallery .show-big-img img").attr("src", $(this).attr("src"));
                            });
                        });
                    </script>
                </div>
            </div>
            <div class="col-lg-4 col-sm-5 show-text-area">
                <div class="area-price row">
                    <p class="col-lg-7 col-md-7 col-sm-12">
                        <l style="color:red; font-size:40px; font-weight: bold;">${house.rent }</l>
                        <l class="text-black">元/月</l>
                    </p>
                    <p class="row-lg-5 col-sm-5 col-sm-5">
                        <l style="color:black; font-size:40px; font-weight: bold;">${house.area }</l>
                        <l class="text-black">m<sup>2</sup></l>
                    </p>
                </div>
                <hr width="100%">
                <div class="low-show row">
                    <div class="col-xs-8 col-md-8">
                        <p>${house.country }|${house.province }|${house.city }|${house.district }</p>
                    </div>
                    <div class="col-xs-3">
                        <p>
                        <l>${house.floor }</l>
                        <l>楼</l></p>
                    </div>

                </div>
                <div class="low-show row">
                    <div class="col-xs-8 col-md-8">
                        <p>
                            <l>一</l>
                            <l>室</l>
                            <l>一</l>
                            <l>厅</l>
                            <l>一</l>
                            <l>卫</l>
                        </p>
                    </div>
                    <div class="col-xs-3">
                    	<c:if test="${elevator==1 }">
                        	<p>有电梯</p>
                        </c:if>
                        <c:if test="${elevator==0 }">
                        	<p>无电梯</p>
                        </c:if>
                    </div>
                </div>
                <div class="low-show row">
                    <div class="col-xs-7 col-md-7">
                        <p>
                            <l>押金：</l>
                            <l>${house.payment_of_rent}</l>
                            <l>元</l>
                        </p>
                    </div>
                    <div class="col-xs-5">
                        <p>一月一付</p>
                    </div>
                </div>
                <div class="low-show-last row">
                    <div class="col-xs-6">
                        <p>
                            <l>用户：</l><a id="id_c" name="id_c" href="../user/getUserDetail?getuser=${house.username}" alert="afuisdhfs">${house.username}</a>
                        </p>
                    </div>
                    <div class="col-xs-6">
                        <p>
                            <l>编号：</l>
                            <l name="id_h" id="id_h">${house.house_id}</l>
                        </p>
                    </div>
                </div>
                <hr width="100%">
                <div class="show-des">
                    <p>${house.description}</p>
                </div>
            </div>
        </div>
    </div>
	<div class="modal bnr-modal fade" id="sign-mod" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    </div>
                    <div class="modal-body modal-spa">
                        <div class="change_password_form" role="form">
                            <p style="color: black; font-size: 20px; margin-bottom: 15px;">请选择签约时长</p>
                            <div class="form-group input-group">
                                <input type="number" id="length-rent" name="require_month" class="form-control" required  min="0" >
                                <span class="input-group-addon">个月</span>
                            </div>
                            <div>
                                <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center">
                                    <button id="btn-sign" class="btn btn-blue col-md-12 col-sm-12 col-xs-12"  onclick="RequireHouse()" >
                                        提交</button>
                                </div>
                            </div>
    
                        </div>
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