<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html lang="ch">

<head>
    <title>Publish_h</title>
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
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.5.1/css/fileinput.min.css" media="all" rel="stylesheet"
        type="text/css" />
    <link href="../css/style.css" type="text/css" rel="stylesheet" media="all">
    <link rel="stylesheet" href="../css/swipebox.css">
    <link rel="stylesheet" href="../css/flexslider.css" type="text/css" media="screen" />
    <!-- //Custom Theme files -->
    <!-- font-awesome icons -->
    <link href="../css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome icons -->
    <!-- js -->
    <script src="../js/jquery-2.2.3.min.js" ></script>
    <script src="../js/distpicker.min.js"></script>
    <!-- //js -->
    <!-- web-fonts -->
    <link href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700" rel="stylesheet">




    <script src="../js/distpicker.min.js"></script>
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
		
    <section class="mtop publish" id="publish_house">

        <div class="container">
            <div class="row">
                <div class="logo-login col-sm-12 ">
                    <p href="#" class="logo_text" style="font-size:30px; color: #31708f">
                       		 修改房源
                    </p>
                </div>
                <form action="updateHouse?house_id=${house.house_id }" id="publish_h" name="publish_h" method="post"  role="form">
                    <div class="row pub">
                        <div class="form-group col-md-12">
                            <input type="text" name="title" id="h_title" class="form-control  " maxlength="32"
                                required placeholder="请输入标题，32字以内" value="${house.title}">
                        </div>

                    </div>
                   
                    <div class="row pub">
                        <div class="form-group col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_community" name="community" placeholder="小区名称"
                                maxlength="20" required value="${house.community}">
                        </div>
                        <div class="form-group col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_build" name="building" placeholder="楼栋号"
                                maxlength="10" required value="${house.building}">
                        </div>
                        <div class="form-group col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_unit" name="unit" placeholder="单元号"
                                maxlength="10" required value="${house.unit}">
                        </div>
                        
                        <div class="form-group col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_num" name="no" placeholder="门牌号" 
                            	maxlength="10" required value="${house.no}">
                        </div>
                    </div>
                   
                    <div class="row pub">
                        <div class="form-group col-md-6 col-sm-12">

                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">楼层：</span>
                                <input type="number" name="floor" id="h_floor" class="form-control  no-paste "
                                    required min="-2" value="${house.floor}">
                                <span class="input-group-addon">层</span>
                            </div>

                        </div>
                        <div class="form-group col-md-6 col-sm-12">
                            <div class="input-group">
                                <select name="elevator" id="h_elevator" class="form-control  no-paste " max="5" min="0" value="${house.elevator}"
                                    required>
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
                                <span class="input-group-addon input-group-addon-before">预期租金：</span>
                                <input type="number" name="rent" id="h_rent" class="form-control  no-paste no-ud" value="${house.rent}"
                                    required min="0">
                                <span class="input-group-addon">元/月</span>
                            </div>
                        </div>
                    </div>

                    <div class="row pub">
                        <div class="form-group col-md-6 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">押金：</span>
                                <input type="number" name="deposit" id="h_deposit" class="form-control  no-paste no-ud"
                                    min="0" required value="${house.deposit}">
                                <span class="input-group-addon">元</span>
                            </div>
                        </div>
                        <div class="form-group col-md-6 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">支付方式</span>
                                <select name="payment_of_rent" id="h_p_rent" class="form-control" value="${house.payment_of_rent}">
                                    <option selected>一月一付</option>
                                    <option>一季一付</option>
                                    <option>半年一付</option>
                                    <option>一年一付</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="row pub">

                        <div class="form-group col-md-12 col-sm-12">
                            <p style="text-align:left">描述一下您的房子，介绍一下家具装修以及周边环境情况吧。</p>
                            <textarea class="describe" rows="3" placeholder="请输入描述，不少于20个字，不多于140个字" maxlength="140"
                                minlength="20" name="description">${house.description}</textarea>
                        </div>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center"><button id="register-btn" type="submit"
                            class="btn btn-blue col-md-12 col-sm-12 col-xs-12">修改房源</button></div>
                   
                   </form>
            </div>
        </div>
    </section>
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
                    }

                );
            }

        );
    </script>
    <!-- End-slider-script -->
    <!-- start-smooth-scrolling -->
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                        event.preventDefault();

                        $('html,body').animate({
                                scrollTop: $(this.hash).offset().top
                            }

                            , 1000);
                    }

                );
            }

        );
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
        })
    </script>
    <!-- //swipe box js -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../js/bootstrap.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>


</body>

</html>