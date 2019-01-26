<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <title>Publish_s</title>
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
    <script src="../js/distpicker.min.js"></script>
    <!-- //js -->
    <!-- web-fonts -->
    <link href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic"
        rel="stylesheet" type="text/css">
    <!-- //web-fonts -->



</head>

<body>
    <!-- banner -->
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
											<li><a href="../houseInfor/toinsertHouse?username=${cuser }">房源</a></li>
											<li><a href="../wantedInfor/toinsertWanted?username=${cuser }">求租</a></li>
										</ul>
									</li>
									<li class="dropdown menu-item-has-child">
										<a href="#" data-toggle="dropdown" data-target="#">搜索<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="../houseInfor/searchFront?username=${cuser }">房源</a></li>
											<li><a href="../wantedInfor/searchFront?username=${cuser }">求租</a></li>
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
	                                <li class="nav-log">
	                                    <a href="../user/UserFront?username=${cuser}">${cuser}</a>
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
		
		
    <section class="mtop publish" id="publish_seek">

        <div class="container">
            <div class="row">
                <div class="logo-login col-sm-12 ">
                    <p href="#" class="logo_text" style="font-size:30px; color: #31708f">
                        发布求租
                    </p>
                </div>

                <div class="alert col-md-12 alert-sub" id="alert_pub_s">

                </div>
                <form id="publish_s" name="publish_s" method="post" autocomplete="off" role="form" action="insertWanted">
                    <div class="row pub">
                        <div class="form-group col-md-12">
                            <input type="text" name="title" id="s_title" class="form-control " maxlength="32"
                                placeholder="请输入标题，32字以内" required>
                        </div>
                    </div>
                    <div class="row pub">
                        <div class="row pub form-group" data-toggle="distpicker">
                            <div class="col-md-4 col-sm-12 col-xs-4 ">
                                <select class="form-control" id="province" name="province" required>
                                </select>
                            </div>
                            <div class="col-md-4 col-sm-12 col-xs-4 ">
                                <select class="form-control" id="city" name="city" required>
                                </select>
                            </div>
                            <div class="col-md-4 col-sm-12 col-xs-4 ">
                                <select class="form-control" id="district" name="district" required>
                                </select>
                            </div>
                        </div>
                        <script type="text/javascript">
                            $("#distpicker").distpicker('destroy');
                            $('#distpicker').distpicker({
                                province: '北京市',
                                city: '北京市',
                                placeholder: false
                            });
                        </script>
                    </div>
                    <div class="row pub">
                        <div class="form-group col-md-4 col-sm-6">
                            <div class="input-group">
                                <input type="number" name="bedroom" id="s_bed" class="form-control  no-paste " max="10"
                                    value="2" required min="1">
                                <span class="input-group-addon">室</span>
                            </div>
                        </div>
                        <div class="form-group col-md-4 col-sm-6">
                            <div class="input-group">
                                <input type="number" name="hall" id="s_hall" class="form-control  no-paste " max="5"
                                    min="0" value="1" required>
                                <span class="input-group-addon">厅</span>
                            </div>

                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="input-group form-group">
                                <input type="number" name="bath" id="s_bath" class="form-control  no-paste " max="5"
                                    value="1" required>
                                <span class="input-group-addon">卫</span>
                            </div>
                        </div>
                    </div>
                    <div class="row pub">
                        <div class="col-md-2 col-sm-12">
                            <p class="text-form">面积:</p>
                        </div>
                        <div class="col-md-5 col-sm-12">
                            <div class="form-group input-group" aria-required="true">
                                <span class="input-group-addon">最低</span>
                                <input type="number" name="area_lb" id="s_area_b" class="form-control  no-paste no-ud"
                                    value="80" required>
                                <span class="input-group-addon">m<sup>2</sup></span>
                            </div>
                        </div>
                        <div class="col-md-5 col-sm-12">
                            <div class="form-group input-group" aria-required="true">
                                <span class="input-group-addon">最高</span>
                                <input type="number" name="area_ub" id="s_area_t" class="form-control  no-paste no-ud"
                                    value="120" required onchange="">
                                <span class="input-group-addon">m<sup>2</sup></span>
                            </div>
                        </div>
                    </div>
                    <div class="row pub">
                        <p style="text-align:left; padding-left:15px">输入一个期待楼层区间，方便寻找舒适的家。</p>
                        <div class="form-group col-md-4 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">最低</span>
                                <input type="number" name="floor_lb" id="s_floor_b" class="form-control  no-paste "
                                    required min="-2">
                                <span class="input-group-addon">层</span>
                            </div>

                        </div>
                        <div class="form-group col-md-4 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">最高</span>
                                <input type="number" name="floor_ub" id="s_floor_t" class="form-control  no-paste "
                                    required min="-2">
                                <span class="input-group-addon">层</span>
                            </div>

                        </div>
                        <div class="form-group col-md-4 col-sm-12">
                            <div class="input-group">
                                <select name="elevator" id="s_elevator" class="form-control  no-paste " max="5" min="0"
                                    required>
                                    <option value="1" selected>有</option>
                                    <option value="0">无</option>
                                </select>
                                <span class="input-group-addon">电梯</span>
                            </div>
                        </div>
                    </div>
                    <div class="row pub">
                        <div class="form-group col-md-7 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">预期租金：</span>
                                <input type="number" name="rent_lb" id="s_rent_lb" class="form-control  no-paste no-ud"
                                    required min="0">
                                <span class="input-group-addon">元/月</span>
                            </div>

                        </div>
                        <div class="form-group col-md-5 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">至</span>
                                <input type="number" name="rent_ub" id="s_rent_t" class="form-control  no-paste no-ud"
                                    required min="0">
                                <span class="input-group-addon">元/月</span>
                            </div>

                        </div>
                    </div>



                    <div class="row pub">

                        <div class="form-group col-md-12 col-sm-12">
                            <p style="text-align:left">描述一下您的需求，方便寻找心仪的房源吧。</p>
                            <textarea class="describe" rows="3" name="description" placeholder="请输入描述，不少于20个字，不多于140个字" maxlength="140"
                                minlength="20"></textarea>
                        </div>
                    </div>


                    <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center"><button id="register-btn" type="submit"
                            class="btn btn-blue col-md-12 col-sm-12 col-xs-12">同意协议并发布求租</button></div>
                </form>
                <div class="form-group col-md-12 col-sm-12 col-xs-12">
                    <a href="#" data-toggle="modal" data-target="#price" class="see col-md-12 col-sm-12 col-xs-12">阅读发布协议及管理办法</a>
                </div>
            </div>
        </div>
    </section>
    <!-- //banner -->
    <!-- banner-bottom -->
    <!-- //modal-about -->

    <!-- FlexSlider -->
    
    <!-- //end-smooth-scrolling -->

    <!-- if using RTL (Right-To-Left) orientation, load the RTL CSS file after fileinput.css by uncommenting below -->
    <!-- link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/css/fileinput-rtl.min.css" media="all" rel="stylesheet" type="text/css" /-->
    <script src="../js/jquery-2.2.3.min.js"></script>

    <!-- menu-js -->
    <script src="../js/modernizr.js"></script>
    <!-- Modernizr -->
    <script src="../js/menu.js"></script>
    <!-- Resource jQuery -->
    <!-- //menu-js -->

    <!-- Kick off Filterizr -->
    <script src="../js/jquery.filterizr.js"></script>
    <script src="../js/controls.js"></script>
    <script type="text/javascript">
        $(function () {
                //Initialize filterizr with default options
                $('.filtr-container').filterizr();
            }

        );
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