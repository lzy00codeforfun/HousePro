<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>SELF</title>
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
	<script src="../js/distpicker.min.js"></script>
	<script type="text/javascript">
		function updatephone(){
			window.location.href="updatephone?newphone=18800131394";
		}
		function updatepassword(){
			window.location.href="updatepassword?newpassword=123";
		}
		$(".dealbutton").on("click",function(){
			alert("click button");
			alert()
			alert($(this).attr(id));
		   /* if($(this).attr("var")=="btn1"){
		        //调用btn1参数和函数
		    }else if($(this).attr("var")=="btn2"){
		    //调用btn2参数和函数
		    }*/
		});
		function denydeal(){
			window.location.href="MakeDeal?contract_id="+"";
		}
		function makedeal(){
			window.location.href="DenyDeal?contract_id="+"";
		}
		function updatehouse(){
			window.location.href="../houseInfor/toupdateHouse?house_id=2";
		}
		
	</script>
		<script type="text/javascript">
		function exit(){
			window.location.href="exit";
		}
		
	</script>
    <!-- //web-fonts -->
</head>

<body>
    <!-- banner -->
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
											<li><a href="../houseInfor/toinsertHouse?username=${cuser}">房源</a></li>
											<li><a href="../wantedInfor/toinsertWanted?username=${cuser}">求租</a></li>
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

    <section class="mtop information-page" id="information">
        <div class="row col-xs-2 nav-left">
            <ul class="nav-pills nav nav-stacked nav-self">
                <li role="presentation" value="self-info" class="nav-left-self">
                    <a href="../user/getBeingAsked?username=${cuser}">最新申请</a>
                </li>
                <li role="presentation" value="self-info" class="nav-left-self">
                    <a href="../user/getSelfAsk?username=${cuser}">我的请求</a>
                </li>
                <li role="presentation" value="self-info" class="nav-left-self">
                    <a href="../user/getSelfDoneDeal?username=${cuser}">完成订单</a>
                </li>
                <li role="presentation" value="self-info" class="nav-left-self">
                    <a href="../wantedInfor/getCuserHouse?username=${cuser}">我的求租</a>
                </li>
                <li role="presentation" value="self-info" class="nav-left-self">
                    <a href="../houseInfor/getCuserHouse?username=${cuser}">我的出租</a>
                </li>
                <li role="presentation" value="self-info" class="nav-left-self">
                    <a href="../user/getSelfInfor?username=${cuser}">个人信息</a>
                </li>
            </ul>
        </div>

        <div class="container col-xs-9">
            <c:if test="${mode==1}">
            <div class="row self-new">

                <div class="row search-show col-xs-11">
                    <div class="col-md-11 col-lg-10 show-h col-xs-offset-1">
                        <h1 style="text-align:left">最新申请</h1>
                        <hr width="100%">
                    </div>
                    
                    <ul class="col-md-10 col-lg-10 show-h-list col-xs-offset-1">
                        <c:forEach var="dl" items="${deallist}">
	                        <li class="show-h-ind row col-xs-10">
	                        	<div class="show-box-img col-md-12 col-sm-12">
	                                
	                                <div class="col-md-12 col-sm-12 text-box">
	                                    <div class="col-xs-12 area-line">
	                                    	<div class="col-xs-8">
			                                   <a href="../houseInfor/getHouseDetail?house_id=${dl.house_id}">
			                                       <h5 style="font-size:20px;">
			                                          <l>房屋编号：</l>
			                                          <l>${dl.house_id }</l>
			                                       </h5>
			                                   </a>
		                                  	</div>
	                                 	</div>	
	                                   <div class="col-xs-12 area-line">
	                                        <div class="col-xs-5">
		                                       <a href="../user/getUserDetail?getuser=${hdl.tenant_username}">
			                                        <h5>
			                                           <l>求租人id：</l>
			                                           <l>${dl.tenant_username }</l>
			                                         </h5>
		                                  		</a>
	                                   		 </div>
	                                   		 <div class="col-xs-7">
		                                        <h5 class="col-xs-12">
		                                        	<l>提交时间: </l>
		                                            <l>${dl.modification_time }</l>
		                                        </h5>
	                                    	</div>
	                                    </div>
	                                    
	                                    <div class="area-line col-xs-12">
	                                    	<div class="col-xs-3">
	                               
	                                    	<h5>签约时限:</h5>
	                                    	</div>
	                                    	<div class="col-xs-4">
	                                    		<h5>${dl.start_date }</h5>
	                                    	</div> 
	                                    	<div class="col-xs-1" style="padding:0px 4px; ">
	                                        <h5>~</h5> </div>
	                                        <div class="col-xs-4">
	                                        	<h5>${dl.end_date }</h5>
	                                        </div>
	                                    </div>
	                                    
	                                    <div class="area-line col-xs-12">
	                                    	<div class="col-xs-6 col-md-6 ncol-sm-12">
	                                        	<l class="price-search-black">${dl.monthly_rent }</l>
	                                        	<l>元/月</l>
	                                       	</div>
	                                       	<div class="col-xs-6 col-btn-group col-md-6 col-sm-12">
	                                       		<button class="makedealbutton col-xs-5 col-xs-offset-1" id="MakeDeal?contract_id=${dl.contract_id }">同意</button>
	                                    		<button class="denydealbutton col-xs-5 col-xs-offset-1" id="DenyDeal?contract_id=${dl.contract_id }">拒绝</button>
	                                       	</div>
	                                    </div>
	                                    
	                                </div>
	                            </div>
	
	                        </li>       
                        </c:forEach> 


                    </ul>
                    <script type="text/javascript">
	                                    $(".makedealbutton").on("click",function(event){
	                                    	if(confirm("你确定要同意这笔交易吗？")==1){
	                                    		//alert("click make button");
		                            			//alert(event.target.id);
		                            		  	window.location.href=event.target.id;
	                                    	}
	                            			
	                            		});
	                                    $(".denydealbutton").on("click",function(event){
	                                    	if(confirm("你确定要拒绝这笔交易吗？")==1){
		                            			//alert("click deny button");
		                            			//alert(event.target.id);
		                            		  	window.location.href=event.target.id;
	                                    	}
	                            		});
                        </script>
                </div>
            </div>
            </c:if>
            <c:if test="${mode==2}">
            <div class="row self-req">

                <div class="row search-show col-xs-10">
                    <div class="col-md-12 col-lg-12 show-h col-xs-offset-1">
                        <h1 style="text-align:left">我的请求</h1>
                        <hr width="100%">
                    </div>
                    <ul class="col-md-11 col-lg-11 show-h-list col-xs-offset-1">
                      <c:forEach var="dl" items="${deallist }">
                        <li class="show-h-ind row col-xs-10">                      
                        	<div class="show-box-img col-md-12 col-sm-12">
	                                <div class="col-md-12 col-sm-12 text-box">
	                                    <div class="col-xs-12 area-line">
	                                    	<div class="col-xs-12">
			                                   <a href="../houseInfor/getHouseDetail?house_id=${dl.house_id}">
			                                       <h5 style="font-size:20px;">
			                                          <l>房屋编号：</l>
			                                          <l>${dl.house_id }</l>
			                                       </h5>
			                                   </a>
		                                  	</div>
		                                  	<div class="col-xs-4">
		                                  		<h5 style="font-size:20px; color:green;">等待同意</h5>
		                                  	</div>
	                                 	</div>	
	                                   <div class="col-xs-12 area-line">
	                                        <div class="col-xs-5">
		                                       <a href="../user/getUserDetail?getuser=${hdl.tenant_username}">
			                                        <h5>
			                                           <l>求租人id：</l>
			                                           <l>${dl.tenant_username }</l>
			                                         </h5>
		                                  		</a>
	                                   		 </div>
	                                   		 <div class="col-xs-7">
		                                        <h5 class="col-xs-12">
		                                        	<l>提交时间: </l>
		                                            <l>${dl.modification_time }</l>
		                                        </h5>
	                                    	</div>
	                                    </div>
	                                    
	                                    <div class="area-line col-xs-12">
	                                    	<div class="col-xs-3">
	                               
	                                    	<h5>签约时限:</h5>
	                                    	</div>
	                                    	<div class="col-xs-4">
	                                    		<h5>${dl.start_date }</h5>
	                                    	</div> 
	                                    	<div class="col-xs-1" style="padding:0px 4px; ">
	                                        <h5>~</h5> </div>
	                                        <div class="col-xs-4">
	                                        	<h5>${dl.end_date }</h5>
	                                        </div>
	                                    </div>
	                                    
	                                    <div class="area-line col-xs-12">
	                                    	<div class="col-xs-12 col-md-12 ncol-sm-12">
	                                        	<l class="price-search-black">${dl.monthly_rent }</l>
	                                        	<l>元/月</l>
	                                       	</div>
	                                       	
	                                    </div>
	                                    
	                                </div>
	                            </div>
	
	                        </li> 
						</c:forEach>


                    </ul>
                </div>
            </div>
           </c:if>
           <c:if test="${mode==3}">
            <div class="row self-finish">

                <div class="row search-show col-xs-10">
                    <div class="col-md-11 col-lg-11 show-h col-xs-offset-1">
                        <h1 style="text-align:left">完成出租订单</h1>
                        <hr width="100%">
                    </div>
                    <ul class="col-md-11 col-lg-11 show-h-list col-xs-offset-1">
           
                       <c:forEach var="hdl" items="${housedeallist}">
                        <li class="show-h-ind row col-xs-10">
                            <div class="show-box-img col-md-12 col-sm-12">
                                <div class="col-md-12 col-sm-12 text-box">
                                    <div class="col-xs-12 area-line">
                                    	<div class="col-xs-8">
		                                   <a href="../houseInfor/getHouseDetail?house_id=${hdl.house_id}">
		                                       <h5 style="font-size:20px;">
		                                          <l>房屋编号：</l>
		                                          <l>${hdl.house_id }</l>
		                                       </h5>
		                                   </a>
	                                  	</div>
			                         <c:if test="${hdl.state==1 }">
											<div class="col-xs-4">
		                                        <h5 style="font-size:20px; color:green;">已同意</h5>
		                             		</div>
		                             </c:if>
		                           	<c:if test="${hdl.state==-1 }">
										<div class="col-xs-4">
									        <h5 style="font-size:20px; color:red;">已拒绝</h5>
			                            </div>
			                       	</c:if>
                                 	</div>	
                                   <div class="col-xs-12 area-line">
                                        <div class="col-xs-5">
	                                       <a href="../user/getUserDetail?getuser=${hdl.tenant_username}">
		                                        <h5>
		                                           <l>求租人id：</l>
		                                           <l>${hdl.tenant_username }</l>
		                                         </h5>
	                                  		</a>
                                   		 </div>
                                   		 <div class="col-xs-7">
	                                        <h5 class="col-xs-12">
	                                        	<l>提交时间: </l>
	                                            <l>${hdl.modification_time }</l>
	                                        </h5>
                                    	</div>
                                    </div>
                                    
                                    <div class="area-line col-xs-12">
                                    	<div class="col-xs-3">
                               
                                    	<h5>签约时限:</h5>
                                    	</div>
                                    	<div class="col-xs-4">
                                    		<h5>${hdl.start_date }</h5>
                                    	</div> 
                                    	<div class="col-xs-1" style="padding:0px 4px; ">
                                        <h5>~</h5> </div>
                                        <div class="col-xs-4">
                                        	<h5>${hdl.end_date }</h5>
                                        </div>
                                    </div>
                                    
                                    <div class="area-line col-xs-12">
                                    	<div class="col-xs-12">
                                        	<l class="price-search-black">${hdl.monthly_rent }</l>
                                        	<l>元/月</l>
                                       	</div>
                                    </div>
                                </div>
                            </div>

                        </li>
                        </c:forEach> 

                       


                    </ul>
               
                    <div class="col-md-11 col-lg-11 show-h col-xs-offset-1">
                        <h1 style="text-align:left">完成请求订单</h1>
                        <hr width="100%">
                    </div>
                    <ul class="col-md-10 col-lg-10 show-h-list col-xs-offset-1">
           
                        <c:forEach var="wdl" items="${wantdeallist}">
                        <li class="show-h-ind row col-xs-10">
                        	<div class="show-box-img col-md-12 col-sm-12">
                               
                                <div class="col-md-12 col-sm-12 text-box">
                                    <div class="col-xs-12 area-line">
                                    	<div class="col-xs-8">
		                                   <a href="../houseInfor/getHouseDetail?house_id=${wdl.house_id}">
		                                       <h5 style="font-size:20px;">
		                                          <l>房屋编号：</l>
		                                          <l>${wdl.house_id }</l>
		                                       </h5>
		                                   </a>
	                                  	</div>
			                         <c:if test="${wdl.state==1 }">
											<div class="col-xs-4">
		                                        <h5 style="font-size:20px; color:green;">已同意</h5>
		                             		</div>
		                             </c:if>
		                           	<c:if test="${wdl.state==-1 }">
										<div class="col-xs-4">
									        <h5 style="font-size:20px; color:red;">已拒绝</h5>
			                            </div>
			                       	</c:if>
                                 	</div>	
                                   <div class="col-xs-12 area-line">
                                        <div class="col-xs-5">
	                                       <a href="../user/getUserDetail?getuser=${wdl.tenant_username}">
		                                        <h5>
		                                           <l>求租人id：</l>
		                                           <l>${wdl.tenant_username }</l>
		                                         </h5>
	                                  		</a>
                                   		 </div>
                                   		 <div class="col-xs-7">
	                                        <h5 class="col-xs-12">
	                                        	<l>提交时间: </l>
	                                            <l>${wdl.modification_time }</l>
	                                        </h5>
                                    	</div>
                                    </div>
                                    
                                    <div class="area-line col-xs-12">
                                    	<div class="col-xs-3">
                               
                                    	<h5>签约时限:</h5>
                                    	</div>
                                    	<div class="col-xs-4">
                                    		<h5>${wdl.start_date }</h5>
                                    	</div> 
                                    	<div class="col-xs-1" style="padding:0px 4px; ">
                                        <h5>~</h5> </div>
                                        <div class="col-xs-4">
                                        	<h5>${wdl.end_date }</h5>
                                        </div>
                                    </div>
                                    
                                    <div class="area-line col-xs-12">
                                    	<div class="col-xs-12">
                                        	<l class="price-search-show">${wdl.monthly_rent }</l>
                                        	<l>元/月</l>
                                       	</div>
                                    </div>
                                </div>
                            </div>

                        </li>
                        	
                        
                        
                        
                        
                        
	                             
             
                        </c:forEach> 



                    </ul>
                </div>
                
                
            </div>
            </c:if>
            <c:if test="${mode==4}">
            <div class="row self-seek">
                <div class="row search-show col-xs-10">
                    <div class="col-md-12 col-lg-12">
                        <h1 style="text-align:left" padding-left:>我的求租</h1>
                        <hr width="100%">
                    </div>
                    <ul class="col-md-12 col-lg-12 show-h-list">
                    <c:forEach var="hl" items="${houselist }">
                        <li class="show-h-ind row">
                            <div class="show-box-img col-md-12 col-sm-12">
                                <div class="col-md-12 col-sm-12 text-box">
                                    <a href="../wantedInfor/getHouseDetail?house_id=${hl.house_id }">
                                        <h3>${hl.title }</h3>
                                    </a>
                                    <div class="area-line">
                                        <l class="show-h-area">${hl.area_lb }</l>
                                        <l class="m2"> m<sup>2</sup></l>
                                        <l class="show-h-area"> ~ </l>
                                        <l class="show-h-area">${hl.area_ub }</l>
                                        <l class="m2"> m<sup>2</sup></l>
                                    </div>
                                    <h4>${hl.description }</h4>

                                    <div class="rent-show-box">
                                        <l class="price-search-show">${hl.rent_lb }</l>
                                        <l>元/月</l>
                                        <l class="price-search-show" style="color:black;"> ~ </l>
                                        <l class="price-search-show">${hl.rent_ub }</l>
                                        <l>元/月</l>
                                    </div>
                                </div>
                            </div>

                        </li>
					</c:forEach>

                    </ul>
                </div>


                
            </div>
           </c:if>
           <c:if test="${mode==5}">
            <div class="row self-house">

                <div class="row search-show col-xs-10">
                    <div class="col-md-12 col-lg-12 show-h">
                        <h1 style="text-align:left">我的出租</h1>
                        <hr width="100%">
                    </div>
                    <ul class="col-md-12 col-lg-12 show-h-list">
                    <c:forEach var="hl" items="${houselist }">
                        <li class="show-h-ind row">
                            <div class="show-box-img col-md-12 col-sm-12">
                                <div class="col-md-4 col-sm-12 img-box">
                                    <a href="#"><img class="search-show-img" src=${hl.cover }></a>
                                </div>
                                <div class="col-md-8 col-sm-12 text-box">
                                    <a href="../houseInfor/getHouseDetail?house_id=${hl.house_id }">
                                        <h3>
                                            <l>${hl.city }</l>
                                            <l>${hl.district }</l>
                                            <l>${hl.community }</l>
                                            <l>${hl.building }</l>
                                            <l>号楼</l>
                                            <l>${hl.unit }</l>
                                            <l>单元</l>
                                            <l>${hl.no }</l>
                                        </h3>
                                    </a>
                                    <div class="area-line">
                                        <l class="show-h-area">${hl.area }</l>
                                        <l class="m2"> m<sup>2</sup></l>
                                    </div>
                                    <div class="col-xs-6">
                                        <h4>
                                        	<c:if test="${hl.state==1 }">
                                           		 已租出
                                           	</c:if>
                                           	<c:if test="${hl.state==0 }">
                                           		 未租出
                                           	</c:if>
                                        </h4>
                                    </div>
                                 
                                   	<div class="col-xs-6 col-btn-group col-md-6 col-sm-12">
                                       		<button class="updatehousebutton col-xs-5 col-xs-offset-1" id="../houseInfor/toupdateHouse?house_id=${hl.house_id }" >修改</button>
                                    		<button class="deletehousebutton col-xs-5 col-xs-offset-1" id="../houseInfor/deleteHouse?house_id=${hl.house_id }" >删除</button>
                                    </div>
		                             
                                    <div class="rent-show-box">
                                        <l class="price-search-show">${hl.rent}</l>
                                        <l>元/月</l>
                                    </div>
                                </div>
                            </div>

                        </li>
						</c:forEach>
						 <script type="text/javascript">
				                          	$(".deletehousebutton").click(function(event){
				                            	if(window.confirm("你确定要删除这个房屋么吗？")==true){
				                        			alert(event.target.id);
				                        		  	window.location.href=event.target.id;
				                            	}
				                    		});
				                          	$(".updatehousebutton").click(function(event){
				                            	if(window.confirm("你确定要修改这栋房屋吗？")==true){
				                        			alert(event.target.id);
				                        		  	window.location.href=event.target.id;
				                            	}
				                    		});
		                              </script>
                    </ul>
                </div>
            </div>
            </c:if>
            <c:if test="${mode==6}">
            <div class="row self-info col-xs-5 col-xs-offset-3">
                <div class="logo-login col-sm-12 ">
                    <a href="index.html" class="logo_text" style="font-size:40px">
                        个人信息
                    </a>
                </div>
                <form id="sign-up" name="sign_up" autocomplete="off" role="form">

                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <input type="text" name="user_id" id="user_id" class="form-control col-md-12" maxlength="32"
                            value="用户名:${user.username }" required readonly>
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
                    <div class="checkbox">
                        <!-- <label for="news_subscription"><input type="checkbox" id="news_subscription" name="news_subscription" value="yes" checked="checked">News Subscribe Data</label> -->
                    </div>
                    <div class="col-md-12 col-lg-12 text-box" style="font-size:16px; ">
                            <div class="col-lg-6 col-md-6">
                                <p class="text-black">房客会员：<l>${user.renter_lv }</l></p> 
                            </div>
                            <div class="col-lg-6 col-md-6">
                                 <p class="text-black">收费等级：<l>${rl }</l>%</p> 
                             </div>
                        </div>
                        <div class="col-md-12 col-lg-12 text-box" style="font-size:16px; ">
                             <div class="col-lg-6 col-md-6">
                                 <p class="text-black">租客会员：<l>${user.landlord_lv }</l></p> 
                             </div>
                             <div class="col-lg-6 col-md-6">
                                  <p class="text-black">收费等级：<l>${ll}</l>%</p> 
                              </div>
                         </div>
                         <div class="col-md-12 col-lg-12 text-box" style="font-size:16px; text-align: center;">
                                 <p class="text-black">注册日期：<l>${user.registration_time }</l></p>
                         </div>
                </form>
                <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center ">
                 <button id="log_out" class="btn btn-gray col-md-8 col-xs-offset-2" onclick="exit()">注销</button>
                    <button id="change_phone" class="btn btn-blue btn-chg col-md-5 col-sm-5 col-xs-5" data-target="#change_phone_mod"
                        data-toggle="modal" >
                        		修改电话
                       </button>
                    <button id="change_password" class="btn btn-blue btn-chg col-md-5 col-sm-5 col-xs-5" data-target="#change_password_mod"
                        data-toggle="modal" >
                        		修改密码
                       </button>
                        
                </div>
                
            </div>
            </c:if>
        </div>
    </section>




    <div class="modal bnr-modal fade" id="change_password_mod" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                </div>
                <div class="modal-body modal-spa">
                    <form class="change_password_form" role="form" action="updatepassword">
                        <div class="form-group">
                            <input type="password" id="user_old_password" name="oldpassword" class="form-control" required placeholder="原密码"
                                maxlength="32">
                        </div>
                        <div class="form-group">
                            <input type="password" id="user_new_password" name="newpassword" class="form-control" required placeholder="新密码"
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
                    <form class="change_password_form" role="form" action="updatephone">
                        <div class="form-group">
                            <input type="text" id="user_old_phone" name="oldphone" class="form-control" required placeholder="原手机"
                                maxlength="32">
                        </div>
                        <div class="form-group">
                            <input type="text" id="user_new_phone" name="newphone" class="form-control" required placeholder="新手机"
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
    <script src="../js/menu.js"></script> <!-- Resource jQuery -->
    <!-- //menu-js -->
    <!-- Kick off Filterizr -->

    <script src="../js/controls.js"></script>
    <script type="text/javascript">
        $(function () {
            //Initialize filterizr with default options
            $('.filtr-container').filterizr();
        });
    </script>
    <!-- swipe box js -->
    <!-- //swipe box js -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../js/bootstrap.js"></script>
</body>

</html>