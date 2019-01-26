<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<title>Home</title>
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
	<div id="home" class="w3ls-banner">
		<!-- header -->

		<!-- //header -->
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
								<a class="navbar-brand" href="index.html">
									<span itemprop="navbar-brand">House Pro</span>
								</a>
							</div>
							<div class="navbar-collapse collapse in">
								
								
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
											<li><a href="houseInfor/toinsertHouse?username=${cuser }">房源</a></li>
											<li><a href="wantedInfor/toinsertWanted?username=${cuser }">求租</a></li>
										</ul>
									</li>
									<li class="dropdown menu-item-has-child">
										<a href="#" data-toggle="dropdown" data-target="#">搜索<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="houseInfor/searchFront?username=${cuser }">房源</a></li>
											<li><a href="wantedInfor/searchFront?username=${cuser }">求租</a></li>
										</ul>
									</li>
								<c:if test="${empty cuser}">
	                                <li class="nav-log">
	                                    <a href="tologin"> 登录</a>
	                                </li>
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


		<!-- //top-nav -->
		<!-- banner-text -->
		<div class="banner-w3ltext">
			<div class="container">
				<h3>House Pro</h3>
				<h2>帮你寻找一个<br>温暖的家	</h2>
				<a href="houseInfor/searchFront?username=${cuser }" class="wthree-btn" data-toggle="modal">Start to Seek</a>
			</div>
		</div>
		<!-- //banner-text -->
	</div>
	<!-- //banner -->
	<!-- banner-bottom -->
	<div class="serach-w3agile">
		<div class="container">
			<div class="place-grids">
				<form action="houseInfor/indexSearch" method="post">
					<div class="col-md-2 col-xs-4 place-grid">
						<h5>district</h5>
						<select class="sel" name="district" required>
							<option selected>海淀区</option>
							<option >西城区</option>
							<option >朝阳区</option>
							<option >东城区</option>
							<option >昌平区</option>
						</select>
					</div>
					<div class="col-md-2 col-xs-4 place-grid">
						<h5>Price From</h5>
						<select class="sel" name="rent_lb" required>
							<option selected value="0">$0</option>
							<option value="2000">$2000</option>
							<option value="5000">$5000</option>
							<option value="10000">$10000</option>
							<option value="20000">$20000</option>
						</select>
					</div>
					<div class="col-md-2 col-xs-4 place-grid">
						<h5>Price To</h5>
						<select class="sel" name="rent_ub" required>
							<option selected value="2000">$2000</option>
							<option value="5000">$5000</option>
							<option value="10000">$10000</option>
							<option value="20000">$20000</option>
							<option value="100000">$100000</option>
						</select>
					</div>
					<div class="col-md-2 col-xs-4 place-grid">
						<h5>Area From</h5>
						<select class="sel" name="area_lb" required>
							<option value="0">0</option>
							<option value="40">40</option>
							<option value="60">60</option>
							<option value="80">80</option>
							<option value="120">120</option>
						</select>
					</div>
					<div class="col-md-2 col-xs-4 place-grid">
						<h5>Area To</h5>
						<select class="sel" name="area_ub" required>
							<option value="40">40</option>
							<option value="60">60</option>
							<option value="80">80</option>
							<option value="120">120</option>
							<option value="200">200</option>
						</select>
					</div>
					<div class="col-md-2 col-xs-4 place-grid">
						<input type="submit" value="Search">
					</div>
					<div class="clearfix"></div>
				</form>
			</div>
		</div>
	</div>
	<!-- //banner-bottom -->
	<!-- services -->
	<!-- //services -->
	<!-- about -->	
	<!--<div id="about" class="about">
		<div class="container">
			<div class="col-md-6 about-left">
				<h3 class="w3title">About Us</h3>
				<h4>Blanditiis praesentium deleniti atque corrupti quos corrupti quos dolores</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tincidunt lorem sed velit fermentum lobortis, eget
					placerat mauris sed lectus tellus. Sed porta magna vitae nisl vulputate lacinia. Lorem ipsum dolor sit amet,
					consectetur adipiscing elit. Quisque in lobortis nulla.</p>
				<a href="#myModal" class="wthree-btn w3btn2" data-toggle="modal">Read more</a>
			</div>
			<div class="col-md-6 about-right">
				<img src="images/img1.jpg" class="img-responsive" alt=" ">
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>-->
	<!-- //about -->
	<!-- portfolio -->
	<div id="portfolio" class="services portfolio">
		<div class="container">
			<h3 class="w3title">房源推荐</h3>
			<p class="wthree-ttext"></p>
			<div class="gallery_gds">
				<ul class="simplefilter">
					<li class="active" data-filter="all">All</li>
					<li data-filter="1">合租</li>
					<li data-filter="2">50~70m<sup>2</sup></li>
					<li data-filter="3">100m<sup>2</sup>+</li>
				</ul>
				<div class="filtr-container">
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="1" data-sort="Busy streets">
						<div class="agileits-img">
							<a href="images/g1.jpg" class="swipebox" title="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non">
								<img class="img-responsive " src="images/g1.jpg" alt="" />
								<div class="wthree-pcatn">
									<p>北京司法解释就覅时间佛</p>
									<p>50m<sup>2</sup>, 二室一厅</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="2" data-sort="Luminous night">
						<div class="agileits-img">
							<a href="images/g2.jpg" class="swipebox" title="Duis maximus tortor diam, ac lobortis justo rutrum quis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent non purus fermentum, eleifend velit non">
								<img src="images/g2.jpg" alt="" class="img-responsive" />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="1" data-sort="City wonders">
						<div class="agileits-img">
							<a href="images/g3.jpg" class="swipebox" title="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non">
								<img src="images/g3.jpg" alt="" class="img-responsive" />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="3" data-sort="Industrial site">
						<div class="agileits-img">
							<a href="images/g4.jpg" class="swipebox" title="Praesent non purus fermentum, eleifend velit non Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis.">
								<img src="images/g4.jpg" alt="" class="img-responsive " />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="3" data-sort="In production">
						<div class="agileits-img">
							<a href="images/g5.jpg" class="swipebox" title="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non">
								<img src="images/g5.jpg" alt="" class="img-responsive" />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="2" data-sort="Peaceful lake">
						<div class="agileits-img">
							<a href="images/g6.jpg" class="swipebox" title="Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non">
								<img src="images/g6.jpg" alt="" class="img-responsive" />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="1" data-sort="Peaceful lake">
						<div class="agileits-img">
							<a href="images/g7.jpg" class="swipebox" title="Eleifend velit non duis maximus tortor diam, ac lobortis justo rutrum quis, praesent non purus fermentum. ">
								<img src="images/g7.jpg" alt="" class="img-responsive" />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="2" data-sort="Peaceful lake">
						<div class="agileits-img">
							<a href="images/g3.jpg" class="swipebox" title="Praesent non purus fermentum, eleifend velit non, Duis maximus tortor diam, ac lobortis justo rutrum quis.">
								<img src="images/g3.jpg" alt="" class="img-responsive" />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-4 col-sm-4 col-xs-6 filtr-item" data-category="3" data-sort="Peaceful lake">
						<div class="agileits-img">
							<a href="images/g1.jpg" class="swipebox" title="Ac lobortis justo rutrum quis. Praesent non purus fermentum, duis maximus tortor diam, eleifend velit non">
								<img src="images/g1.jpg" alt="" class="img-responsive" />
								<div class="wthree-pcatn">
									<h4>House Pro</h4>
								</div>
							</a>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	</div>
	<!-- //portfolio -->
	<!-- blog -->
	<div id="blog" class="services blog">
		<div class="container">
			<h3 class="w3title">热门求租</h3>

			<div class="blog-agileinfo">
				<div class="col-md-6 col-sm-6 blog-w3lgrids">
					<div class="blog-gridtext">
						<div class="blog-w3imgtext">
							<h4><a href="#myModal" data-toggle="modal">Fringilla condi ectetur</a></h4>
							<p class="w3-agilep">Posted By<a href="#"> Admin</a> &nbsp;&nbsp;on Nov 30, 2016 &nbsp;&nbsp; <a href="#">Comments
									(10)</a></p>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor If you are going to use a
								passage There are many variations of passages of Lorem Ipsum available, but the majority have suffered </p>
							<a href="#myModal" class="wthree-btn w3btn2 w3btn2a" data-toggle="modal">Read more</a>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-sm-6 blog-w3lgrids">
					<div class="blog-gridtext">
						<div class="blog-w3imgtext">
							<h4><a href="#myModal" data-toggle="modal">Consectetur fringilla condi</a></h4>
							<p class="w3-agilep">Posted By<a href="#"> Admin</a> &nbsp;&nbsp;on Nov 21, 2016 &nbsp;&nbsp; <a href="#">Comments
									(10)</a></p>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor If you are going to use a
								passage There are many variations of passages of Lorem Ipsum available, but the majority have suffered </p>
							<a href="#myModal" class="wthree-btn w3btn2 w3btn2a" data-toggle="modal">Read more</a>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="blog-agileinfo">
				<div class="col-md-4 col-sm-6 blog-w3lgrids">
					<div class="blog-gridtext">
						
						<div class="blog-w3imgtext">
							<h4><a href="#myModal" data-toggle="modal">Fringilla condi me </a></h4>
							<p class="w3-agilep">Posted By<a href="#"> Admin</a> &nbsp;&nbsp;on Nov 12, 2016 </p>
							<p>In dignissim nunc curabitur eleifend orci eu sapien imperdiet tempus.</p>
							<a href="#myModal" class="wthree-btn w3btn2 w3btn2a" data-toggle="modal">Read more</a>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-6 blog-w3lgrids">
					<div class="blog-gridtext">
						
						<div class="blog-w3imgtext">
							<h4><a href="#myModal" data-toggle="modal">Cfringilla condi me</a></h4>
							<p class="w3-agilep">Posted By<a href="#"> Admin</a> &nbsp;&nbsp;on Nov 4, 2016</p>
							<p>Curabitur eleifend orci eu sapien imperdiet tempus. In dignissim nunc.</p>
							<a href="#myModal" class="wthree-btn w3btn2 w3btn2a" data-toggle="modal">Read more</a>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-6 blog-w3lgrids">
					<div class="blog-gridtext">
						
						<div class="blog-w3imgtext">
							<h4><a href="#myModal" data-toggle="modal">Sectetur fringilla</a></h4>
							<p class="w3-agilep">Posted By<a href="#"> Admin</a> &nbsp;&nbsp;on Sept 21, 2016</p>
							<p>Morbi a vehicula risus, vitae interdum orci. Praesent ac eleifend turpis.</p>
							<a href="#myModal" class="wthree-btn w3btn2 w3btn2a" data-toggle="modal">Read more</a>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //blog -->
	<!-- testimonials -->
	<!--<div class="testimonials">
		<div class="container">
			<h3 class="w3title">Testimonials</h3>
			<section class="slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<div class="testimonials-grid agileinfo">
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
									sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
									Ut enim ad minim veniam sed do eiusmod.</p>
								<h5>John Doe,<span> Tempor</span></h5>
							</div>
						</li>
						<li>
							<div class="testimonials-grid">
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
									sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
									Ut enim ad minim veniam sed do eiusmod.</p>
								<h5>Elit semper,<span> Veniam</span></h5>
							</div>
						</li>
						<li>
							<div class="testimonials-grid">
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
									sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
									Ut enim ad minim veniam sed do eiusmod.</p>
								<h5>Daniel Nyari,<span> Enim </span></h5>
							</div>
						</li>
					</ul>
				</div>
			</section>
			FlexSlider 
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
		</div>
	</div>-->
	<!-- //testimonials -->
	<!-- news --> 
	<!-- //news -->
	<!-- contact -->
	
	<!-- //contact -->
	<!-- address -->

	<!-- //address -->
	<!-- map -->
	<!---<div class="map">
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d343829.1271629402!2d-122.61489066225299!3d47.681214398164556!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54906aba3648f20b%3A0xc5c4dedaafcead17!2sSeattle%2C+WA+98104!5e0!3m2!1sen!2sin!4v1461914461629"></iframe>
	</div>--->
	<!-- //map -->
	<!-- footer -->

	<!-- //footer -->
	<!-- modal-about -->
	<div class="modal bnr-modal fade" id="myModal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				</div>
				<div class="modal-body modal-spa">
					<img src="images/bg2.jpg" class="img-responsive" alt="" />
					<h4>Blanditiis deleniti</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras rutrum iaculis enim, non convallis felis mattis
						at. Donec fringilla lacus eu pretium rutrum. Cras aliquet congue ullamcorper. Etiam mattis eros eu ullamcorper
						volutpat. Proin ut dui a urna efficitur varius. uisque molestie cursus mi et congue consectetur adipiscing elit
						cras rutrum iaculis enim, Lorem ipsum dolor sit amet, non convallis felis mattis at. Maecenas sodales tortor ac
						ligula ultrices dictum et quis urna. Etiam pulvinar metus neque, eget porttitor massa vulputate in. Fusce lacus
						purus, pulvinar ut lacinia id, sagittis eu mi. Vestibulum eleifend massa sem, eget dapibus turpis efficitur at.
						Aliquam viverra quis leo et efficitur. Nullam arcu risus, scelerisque quis interdum eget, fermentum viverra
						turpis. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias
						consequatur aut At vero eos </p>
				</div>
			</div>
		</div>
	</div>
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