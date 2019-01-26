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
    <div class="header">
        <div class="navbar-fixed-container">

            <div class="navbar navbar-fixed-top affix" data-spy="affix" data-offset-top="0">
                <nav role="navigation" class="nav-top">
                    <div class="container">
                        <div class="nav navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapes"
                                aria-label="Expand and Collapse Menu">
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="../FrontPage">
                                <span itemprop="navbar-brand">House Pro</span>
                            </a>
                        </div>
                        <div class="navbar-collapse collapse">

							<script src="js/distpicker.min.js"></script>
                            <div data-toggle="distpicker" class="nav-location col-xs-4 col-md-4">
                                    <select data-province="北京市" id="s-province"></select>
                                    <select data-city="北京市" id="s-city"></select>
                                </div>
                                <script type="text/javascript" scr="js/distpicker.min.js">
                                    $("#distpicker").distpicker('destroy');
                                    $('#distpicker').distpicker({
                                        province: '北京市',
                                        city: '北京市',
                                        placeholder:false
                                    });
                                </script>

                            <ul class="nav navbar-nav navbar-right">
                                <li>
                                    <a href="#">小区</a>
                                </li>
                                <li>
                                    <a href="#">发布</a>
                                </li>
                                <li>
                                    <a href="#">搜索</a>
                                </li>
                                <li class="nav-log">
                                    <a href="js/login.jsp"> 登录</a>
                                </li>
                                <li class="nav-log">
                                    <a href="#">注册</a>
                                </li>
                                <li class="nav-id">
                                    <a href="#">id______</a>
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
                        shfsnfei
                    </a>
                </div>
                <form id="sign-up" name="sign_up" autocomplete="off" role="form">

                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <input type="text" name="user_id" id="user_id" class="form-control col-md-12" maxlength="32"
                            value="用户名" required readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="phone" class="control-label col-md-12">Phone No</label> -->
                        <input type="text" name="phone" id="phone" onkeypress="return isNumber(event)" class="form-control col-md-12 no-paste"
                            value="电话号码" required readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="fname" class="control-label col-md-12">First Name</label> -->
                        <input type="text" name="name" id="name" class="form-control col-md-12" value="真实姓名" required
                            readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="package" class="control-label col-md-12">Package</label> -->
                        <input class="form-control" id="card" name="card" required readonly value="身份证">
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="lname" class="control-label col-md-12">Last Name</label> -->
                        <input type="text" name="id_num" id="id_num" class="form-control col-md-12" value="证件号码"
                            required readonly>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="country_name" class="control-label col-md-12">Country Name</label> -->
                        <input class="form-control" id="province" name="province" required readonly value="北京">
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <!-- <label for="country_name" class="control-label col-md-12">Country Name</label> -->
                        <input class="form-control" id="city" name="city" required readonly value="海淀">
                    </div>
                    <div class="checkbox">
                        <!-- <label for="news_subscription"><input type="checkbox" id="news_subscription" name="news_subscription" value="yes" checked="checked">News Subscribe Data</label> -->
                    </div>

                </form>
                <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center">
                    <button id="change_phone" class="btn btn-blue btn-chg col-md-5 col-sm-5 col-xs-5" data-target="#change_phone_mod"
                        data-toggle="modal">
                        修改电话</button>
                    <button id="change_password" class="btn btn-blue btn-chg col-md-5 col-sm-5 col-xs-5" data-target="#change_password_mod"
                        data-toggle="modal">
                        修改密码</button>
                </div>
            </div>
        </div>
    </section>




    <div class="modal bnr-modal fade" id="change_password_mod" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                </div>
                <div class="modal-body modal-spa">
                    <form class="change_password_form" role="form">
                        <div class="form-group">
                            <input type="password" id="user_old_password" class="form-control" required placeholder="原密码"
                                maxlength="32">
                        </div>
                        <div class="form-group">
                            <input type="password" id="user_new_password" class="form-control" required placeholder="新密码"
                                maxlength="32">
                        </div>
                        <div>
                            <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center">
                                <button id="btn-change-passsword" type="submit" class="btn btn-blue col-md-12 col-sm-12 col-xs-12">
                                    提交</button>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="modal bnr-modal fade" id="change_phone_mod" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                </div>
                <div class="modal-body modal-spa">
                    <form class="change_password_form" role="form">
                        <div class="form-group">
                            <input type="text" id="user_old_phone" class="form-control" required placeholder="原手机"
                                maxlength="32">
                        </div>
                        <div class="form-group">
                            <input type="text" id="user_new_phone" class="form-control" required placeholder="新手机"
                                maxlength="32">
                        </div>
                        <div class="form-group">
                                <input type="password" id="change_phone_password" class="form-control" required placeholder="密码"
                                    maxlength="32">
                        </div>
                        <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center">
                            <button id="btn-change-phone" type="submit" class="btn btn-blue col-md-12 col-sm-12 col-xs-12">
                            提交</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
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