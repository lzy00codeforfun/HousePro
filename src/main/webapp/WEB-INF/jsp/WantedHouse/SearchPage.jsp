

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <title>WantedHouseSearch</title>
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
											<li><a herf="../houseInfor/toinsertHouse?username=${cuser}">房源</a></li>
											<li><a herf="../wantedInfor/toinsertWanted?username=${cuser}">求租</a></li>
										</ul>
									</li>
									<li class="dropdown menu-item-has-child">
										<a href="#" data-toggle="dropdown" data-target="#">搜索<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="../houseInfor/searchFront?username=${cuser}">房源</a></li>
											<li><a href="../wantedInfor/searchFront?username=${cuser}">求租</a></li>
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
    <div class="row search-body">
        <div class="box-left-s">
            <div class="back-search affix-top" data-spy="affix" data-offset-top="60"
                data-offset-b>
                <section class="mtop search" id="publish_seek">
                    <div class="logo-login col-sm-12 ">
                        <p href="#" class="logo_text" style="font-size:20px; color: #31708f; padding-bottom:20px">
                          		  寻找求租
                        </p>
                    </div>
                    <form id="seach_s" name="seach_s" method="post" autocomplete="off"  action="../wantedInfor/conditionSearch" role="form">
                        <div data-toggle="distpicker">
                            <div class="row pub form-group">
                                <div class="col-md-6 col-sm-12 col-xs-6 ">
                                    <select class="form-control" id="province" name="province">
                                    </select>
                                </div>
                                <div class="col-md-6 col-sm-12 col-xs-6 ">
                                    <select class="form-control" id="city" name="city">
                                    </select>
                                </div>
                            </div>
                            <div class="row pub form-group">
                                <div class="col-md-6 col-sm-12 col-xs-6 ">
                                    <select class="form-control" id="district" name="district">
                                    </select>
                                </div>
                                <div class="form-group col-md-6 col-sm-6">
                                    <input type="text" class="form-control" id="s_commu" name="community" placeholder="小区名称"
                                        maxlength="20">
                                </div>
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
                        <div class="row pub">
                            <div class="form-group col-md-4 col-sm-6">
                                <div class="input-group">
                                    <input type="number" name="s_bed" id="s_bed" class="form-control  no-paste no-ud"
                                        max="10" value="2" min="1">
                                    <span class="input-group-addon">室</span>
                                </div>
                            </div>
                            <div class="form-group col-md-4 col-sm-6">
                                <div class="input-group">
                                    <input type="number" name="s_hall" id="s_hall" class="form-control  no-paste no-ud"
                                        max="5" min="0" value="1">
                                    <span class="input-group-addon">厅</span>
                                </div>

                            </div>
                            <div class="col-md-4 col-sm-6">
                                <div class="input-group form-group">
                                    <input type="number" name="s_bath" id="s_bath" class="form-control  no-paste no-ud"
                                        max="5" value="1">
                                    <span class="input-group-addon">卫</span>
                                </div>
                            </div>
                        </div>
                        <div class="row pub">
                            <div class="col-md-4 col-sm-4">
                                <div class="form-group input-group">
                                    <input type="number" name="area" id="h_area_f" class="form-control  no-paste no-ud"
                                        placeholder="面积">
                                    <span class="input-group-addon">m<sup>2</sup></span>
                                </div>
                            </div>
                            <div class="form-group col-md-4 col-sm-12">
                                <div class="input-group">
                                    <input type="number" name="floor" id="s_floor_f" class="form-control  no-paste no-ud"
                                        min="-2" placeholder="楼层">
                                    <span class="input-group-addon">层</span>
                                </div>

                            </div>
                            <div class="form-group col-md-4 col-sm-12">
                                    <div class="input-group">
                                        <select name="elevator" id="elevator" class="form-control  no-paste no-down">
                                            <option value="1" selected>有</option>
                                            <option value="0">无</option>
                                        </select>
                                        <span class="input-group-addon">电梯</span>
                                    </div>
                                </div>
                        </div>
                        <div class="row pub">
                            <div class="form-group col-md-12 col-sm-12">
                                <div class="input-group">
                                    <span class="input-group-addon input-group-addon-before">月租金：</span>
                                    <input type="number" name="rent" id="s_rent_b" class="form-control  no-paste no-ud"
                                        step="100" min="0">
                                    <span class="input-group-addon">元/月</span>
                                </div>

                            </div>
                        </div>
                        <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center"><button id="register-btn"
                                type="submit" class="btn btn-blue col-mdß-12 col-sm-12 col-xs-12">搜索房源</button></div>
                    </form>
                </section>
            </div>
        </div>
        <div class="box-right-s">
            <div class="row search-show">
                <div class="col-md-12 col-lg-12 show-h">
                    <h1 style="text-align:left" padding-left:>热门求租</h1>
                    <hr width="100%">
                </div>
                <ul class="col-md-12 col-lg-12 show-h-list">
                
                
                <c:forEach var="hl" items="${houselist}">
                    <li class="show-h-ind row">
                        <div class="show-box-img col-md-12 col-sm-12">
                            <div class="col-md-12 col-sm-12 text-box">
                                <a href="getHouseDetail?house_id=${hl.house_id }">
                                    <h3>${hl.title}</h3>
                                </a>
                                <div class="area-line">
                                    <l class="show-h-area">${hl.area_lb}</l>
                                    <l class="m2"> m<sup>2</sup></l>
                                    <l class="show-h-area"> ~ </l>
                                    <l class="show-h-area">${hl.area_ub}</l>
                                    <l class="m2"> m<sup>2</sup></l>
                                </div>
                                <h4>${hl.description}</h4>

                                <div class="rent-show-box">
                                    <l class="price-search-show">${hl.rent_lb}</l>
                                    <l>元/月</l>
                                    <l class="price-search-show" style="color:black;"> ~ </l>
                                    <l class="price-search-show">${hl.rent_ub}</l>
                                    <l>元/月</l>
                                </div>
                            </div>
                        </div>
                    </li>
					</c:forEach>
					
					

                </ul>
            </div>
        </div>

    </div>

















    <!-- //banner -->
    <!-- banner-bottom -->
    <!-- //modal-about -->
    <!-- FlexSlider -->
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