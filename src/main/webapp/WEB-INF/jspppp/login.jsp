<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 	  <title>front-page</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <script src="//cdn.bootcss.com/jquery/2.1.4/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	${testsession }
	${"just for test" }
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="carousel slide" id="carousel-608999">
				<ol class="carousel-indicators">
					<li class="active" data-target="#carousel-608999" data-slide-to="0">
					</li>
					<li data-target="#carousel-608999" data-slide-to="1">
					</li>
					<li data-target="#carousel-608999" data-slide-to="2">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="file://C:/Users/rever/Desktop/login1.jpg" />
						<div class="carousel-caption">
							<h4>
								First Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="file://C:/Users/rever/Desktop/login2.jpg" />
						<div class="carousel-caption">
							<h4>
								Second Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="file://C:/Users/rever/Desktop/login3.jpg" />
						<div class="carousel-caption">
							<h4>
								Third Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-608999" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-608999" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
			<form class="form-horizontal" action="login/validate" role="form">
				<div class="form-group">
					 <label class="col-sm-2 control-label" for="inputEmail3">用户名</label>
					<div class="col-sm-10">
						<input class="form-control" id="UserAccount" type="text" name="UserAccount"/>
					</div>
				</div>
				<div class="form-group">
					 <label class="col-sm-2 control-label" for="inputPassword3">密码</label>
					<div class="col-sm-10">
						<input class="form-control" id="UserPassword" type="password" name="UserPassword"/>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 <label><input type="checkbox" />Remember me</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <button class="btn btn-default" type="submit">Sign in</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>