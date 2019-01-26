<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Information</title>
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
    <!-- //js -->
    <!-- web-fonts -->
    <link href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700" rel="stylesheet">

    <!-- //web-fonts -->
</head>

<body>
		<!-- header -->

		<!-- //header -->
		<!-- top-nav -->
		    <div class="header">
        <div class="navbar-fixed-container">

            <div class="navbar navbar-fixed-top affix" data-spy="affix" data-offset-top="0">
                <nav role="navigation" class="nav-top">
                    <div class="container">
                        <div class="nav navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"
                                aria-label="Expand and Collapse Menu">
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="index.html">
                                <span itemprop="navbar-brand">House Pro</span>
                            </a>
                        </div>
                        <div class="navbar-collapse collapse in">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="nav-log">
                                    <a href="../ProvinceData">业绩统计</a>
                                </li>

                                <li class="nav-log">
                                    <a href="../admin/AdminFront">查看用户</a>
                                </li>
                                <li class="nav-id">
                                    <a href="#">${cuser}</a>
                                </li>


                            </ul>
                        </div>
                    </div>
                </nav>
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
    
    <section class="mtop info-page" id="information">

        <div class="container">
            <div class="row">
                <div class="logo-login col-sm-12 ">
                    <a href="index.html" class="logo_text" style="font-size:40px">
                        用户信息
                    </a>
                </div>
                <form id="sign-up" name="sign_up" autocomplete="off" role="form">

                     <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <input type="text" name="user_id" id="user_id" class="form-control col-md-12" maxlength="32"
                            value="${user.username }" required readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="phone" class="control-label col-md-12">Phone No</label> -->
                        <input type="text" name="phone" id="phone" onkeypress="return isNumber(event)" class="form-control col-md-12 no-paste"
                            value="电话号码:${user.phone }" required readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="fname" class="control-label col-md-12">First Name</label> -->
                        <input type="text" name="name" id="name" class="form-control col-md-12" value="真实姓名:${user.real_name}" required
                            readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="package" class="control-label col-md-12">Package</label> -->
                        <input class="form-control" id="card" name="card" required readonly value="身份证">
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="lname" class="control-label col-md-12">Last Name</label> -->
                        <input type="text" name="id_num" id="id_num" class="form-control col-md-12" value="证件号码:${user.ID_no}"
                            required readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="country_name" class="control-label col-md-12">Country Name</label> -->
                        <input class="form-control" id="province" name="province" required readonly value="注册地:${user.registration_area}">
                    </div>
                   <div class="col-md-12 col-lg-12 text-box" style="font-size:16px; ">
                       <div class="col-lg-6 col-md-6">
                           <p class="text-black">房东会员：<l>${user.landlord_lv }</l></p> 
                       </div>
                       <div class="col-lg-6 col-md-6">
                            <p class="text-black">收费等级：<l>${landlord_lv }</l>%</p> 
                        </div>
                   </div>
                   <div class="col-md-12 col-lg-12 text-box" style="font-size:16px; ">
                        <div class="col-lg-6 col-md-6">
                            <p class="text-black">求租会员：<l>${user.renter_lv}</l></p> 
                        </div>
                        <div class="col-lg-6 col-md-6">
                             <p class="text-black">收费等级：<l>${renter_lv}</l>%</p> 
                         </div>
                    </div>
                    <div class="col-md-12 col-lg-12 text-box" style="font-size:16px; text-align: center;">
                            <p class="text-black">注册日期：<l>${user.registration_time }</l></p>
                    </div>

                </form>
            
                <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center ">
                
                 <button  class="btn updatehousebutton col-md-5 col-sm-5 col-xs-5 btn-admin" onclick="levelUpRenter()" >
                        		提升租客等级
                       </button>
                    <button  class="btn updatehousebutton col-md-5 col-sm-5 col-xs-5 btn-admin" onclick="levelUpLandlord()" >
                        		提升房东等级
                       </button>
                       
                 <button  class="btn deletehousebutton col-md-8 col-sm-8 col-xs-offset-2 " onclick="deleteUser()">封号</button>
                   
                        
                </div>
                <script type="text/javascript">
                	function levelUpRenter(){
                		var username=$("#user_id").val();
                		window.location.href="levelUpRenter?getuser="+username;
                	}
                	
                	function levelUpLandlord(){
                		var username=$("#user_id").val();
                		window.location.href="levelUpLandlord?getuser="+username;
                	}
                	function deleteUser(){
                		var username=$("#user_id").val();
                		window.location.href="deleteUser?getuser="+username;
                	}
                </script>
            </div>
        </div>
    </section>




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
    <script src="../js/bootstrap.js"></script>
</body>

</html>