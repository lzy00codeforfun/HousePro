<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="ch">

<head>
    <title>User</title>
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
    <!-- banner -->
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
    <div class="row search-body">

        <div class="container">
            <div class="row search-show">
                <div class="col-md-12 col-lg-12 show-h">
                    <h1 style="text-align:left" padding-left:>用户管理</h1>
                    <hr width="100%">
                </div>
               
                <ul class="col-md-12 col-lg-12 show-h-list col">
                    <c:forEach var="us" items="${userlist}">
                    <li class="col-xs-5 user-show">
                        <div class="show-box-img col-md-12 col-sm-12">
                            <div class="col-md-12 col-sm-12 text-box">
                                <a href="getUserDetail?getuser=${us.username}">
                                    <h3>${us.username}</h3>
                                </a>
                            </div>
                            <div class="col-md-12 col-sm-12 text-box">
                                <h5>注册时间：<l>${us.registration_time}</l></h5>
                            </div>
                            <div class="col-md-12 col-sm-12 text-box">
                                <h5>
                                    <l>${us.registration_area}</l>
                                </h5>
                            </div>
                            <div class="col-md-6 col-sm-6 text-box">
                                <h5>租客等级：<l>${us.renter_lv}</l>
                                </h5>
                            </div>
                            <div class="col-md-6 col-sm-6 text-box">
                                <h5>房客等级：<l>${us.landlord_lv}</l>
                                </h5>
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