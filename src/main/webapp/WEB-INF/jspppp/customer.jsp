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
	
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li >
							 <a href="#">${ttt }</a>
						</li>
						<li>
							 <a href="#">房源信息管理</a>
						</li>
						<li>
							 <a href="#">个人信息管理</a>
						</li>
						
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input class="form-control" type="text" />
						</div> <button class="btn btn-default" type="submit">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="/userInfor">${username }</a>
						</li>
						<li class="dropdown">
							 <a class="dropdown-toggle" href="#" data-toggle="dropdown">登出<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="/logout">logout</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
			<div class="row clearfix">
				<div class="col-md-4 column">
					<dl>
						<dt>
							Description lists
						</dt>
						<dd>
							A description list is perfect for defining terms.
						</dd>
						<dt>
							Euismod
						</dt>
						<dd>
							Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
						</dd>
						<dd>
							Donec id elit non mi porta gravida at eget metus.
						</dd>
						<dt>
							Malesuada porta
						</dt>
						<dd>
							Etiam porta sem malesuada magna mollis euismod.
						</dd>
						<dt>
							Felis euismod semper eget lacinia
						</dt>
						<dd>
							Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
						</dd>
					</dl>
				</div>
				<div class="col-md-4 column">
					<table class="table">
						<thead>
							<tr>
								<th>
									编号
								</th>
								<th>
									产品
								</th>
								<th>
									交付时间
								</th>
								<th>
									状态
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									1
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									Default
								</td>
							</tr>
							<tr class="success">
								<td>
									1
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									Approved
								</td>
							</tr>
							<tr class="error">
								<td>
									2
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									02/04/2012
								</td>
								<td>
									Declined
								</td>
							</tr>
							<tr class="warning">
								<td>
									3
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									03/04/2012
								</td>
								<td>
									Pending
								</td>
							</tr>
							<tr class="info">
								<td>
									4
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									04/04/2012
								</td>
								<td>
									Call in to confirm
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-md-4 column">
					<img alt="140x140" src="file://C:/Users/rever/Desktop/advertise.jpg" />
				</div>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<p>
				 多访问一会儿！！！
			</p>
		</div>
	</div>
</div>
</body>
</html>