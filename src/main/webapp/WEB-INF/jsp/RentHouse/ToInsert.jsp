<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html lang="en">

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
    

    <link href="../css/style.css" type="text/css" rel="stylesheet" media="all">
    <link rel="stylesheet" href="../css/swipebox.css">
    <link rel="stylesheet" href="../css/flexslider.css" type="text/css" media="screen" />
    <!-- //Custom Theme files -->
    <!-- font-awesome icons -->
    <link href="../css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome icons -->
    <!-- //js -->
    <!-- web-fonts -->
    <link href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic"
        rel="stylesheet" type="text/css">
    <!-- //web-fonts -->






	<link rel="stylesheet" type="text/css" href="../css/fileinput.min.css"/>
		
		<!-- 引入js文件 -->
		<script src="../js/jquery-2.2.3.min.js"></script>
		<script src="../js/distpicker.min.js"></script>
		<script type="text/javascript" src="../js/fileinput.min.js"></script>
		
		<script type="text/javascript" src="../js/zh.js"></script>
		
		 
				<script type="text/javascript">

		    //初始化fileinput
	
		    var FileInput = function () {	
		        var oFile = new Object();
		        //初始化fileinput控件（第一次初始化）
		        oFile.Init = function(ctrlName, uploadUrl) {
		            var control = $("#reportFile");
		            //初始化上传控件的样式
		            control.fileinput({
		                language: 'zh',                                         //设置语言
		                uploadUrl: uploadUrl,                                   //上传的地址
		                allowedFileExtensions: ['jpg', 'gif', 'png', 'pdf','jpeg'],    //接收的文件后缀
		                showUpload: true,                                       //是否显示上传按钮
		                showCaption: false,                                     //是否显示标题
		                browseClass: "btn btn-primary",                         //按钮样式     
		                maxFileCount: 10,                                       //表示允许同时上传的最大文件个数
		                enctype: 'multipart/form-data',
		         //       validateInitialCount:true,
		                previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
		                msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
		                uploadExtraData:function (previewId, index) {           //传参
		            	    var data = {
		                        "reportGroupId": $('#lbl_groupId').html(),      //此处自定义传参
		                    };
		                    return data;
		                }
		            });
		            //导入文件上传完成之后的事件
	
		            $("#reportFile").on("fileuploaded", function (event, data, previewId, index) {
	
		                //报告table刷新
	
		                showDataGrid_report($('#lbl_groupId').html());
	
		            });
	
		        }
	
		        return oFile;
	
		    };

		</script>
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
		
    <section class="mtop publish" id="publish_house">

        <div class="container">
            <div class="row">
                <div class="logo-login col-sm-12 ">
                    <p href="#" class="logo_text" style="font-size:30px; color: #31708f">
                       				 发布房源
                    </p>
                </div>
                <form id="publish_h" name="publish_h" method="post" autocomplete="off" role="form" action="insertHouse" enctype="multipart/form-data" >
                    <div class="row pub">
                        <div class="form-group col-md-12">
                            <input type="text" name="title" id="h_title" class="form-control  " maxlength="32"
                                required placeholder="请输入标题，32字以内">
                        </div>

                    </div>

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
                    <div class="row pub form-group">
                        <div class="col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_commu" name="community" placeholder="小区名称"
                                maxlength="20" required>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_build" name="building" placeholder="楼栋号"
                                maxlength="10" required>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_unit" name="unit" placeholder="单元号"
                                maxlength="10" required>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <input type="text" class="form-control" id="h_num" name="no" placeholder="门牌号" maxlength="10"
                                required>
                        </div>
                    </div>
                    <div class="row pub form-group">
                        <div class=" col-md-3 col-sm-6">
                            <div class="input-group">
                                <input type="number" name="bedroom" id="h_bed" class="form-control  no-paste " max="10"
                                    value="2" required min="1">
                                <span class="input-group-addon">室</span>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <div class="input-group">
                                <input type="number" name="hall" id="h_hall" class="form-control  no-paste " max="5"
                                    min="0" value="1" required>
                                <span class="input-group-addon">厅</span>
                            </div>

                        </div>
                        <div class="col-md-3 col-sm-6">
                            <div class="input-group ">
                                <input type="number" name="bath" id="h_bath" class="form-control  no-paste " max="5"
                                    value="1" required>
                                <span class="input-group-addon">卫</span>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <div class="input-group" aria-required="true">
                                <input type="number" name="area" id="h_area" class="form-control  no-paste " value="80"
                                    required>
                                <span class="input-group-addon">m<sup>2</sup></span>
                            </div>
                        </div>

                    </div>
                    <div class="row pub form-group">
                        <div class=" col-md-6 col-sm-12">

                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">楼层：</span>
                                <input type="number" name="floor" id="h_floor" class="form-control  no-paste "
                                    required min="-2">
                                <span class="input-group-addon">层</span>
                            </div>

                        </div>
                        <div class="col-md-6 col-sm-12">
                            <div class="input-group">
                                <select name="elevator" id="h_elevator" class="form-control  no-paste " 
                                    required>
                                    <option value="1" selected>有</option>
                                    <option value="0">无</option>
                                </select>
                                <span class="input-group-addon">电梯</span>
                            </div>
                        </div>
                    </div>
                    <div class="row pub form-group">
                        <div class="col-md-12 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">预期租金：</span>
                                <input type="number" name="rent" id="rent" class="form-control  no-paste no-ud"
                                    required min="0">
                                <span class="input-group-addon">元/月</span>
                            </div>
                        </div>
                    </div>

                    <div class="row pub form-group">
                        <div class="col-md-6 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">押金：</span>
                                <input type="number" name="deposit" id="h_deposit" class="form-control  no-paste no-ud" min="0"
                                    required>
                                <span class="input-group-addon">元</span>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <div class="input-group">
                                <span class="input-group-addon input-group-addon-before">支付方式</span>
                                <select name="payment_of_rent" id="h_p_rent" class="form-control">
                                    <option selected>一月一付</option>
                                    <option>一季一付</option>
                                    <option>半年一付</option>
                                    <option>一年一付</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="row pub form-group">

                        <div class="col-md-12 col-sm-12">
                            <p style="text-align:left">描述一下您的房子，介绍一下家具装修以及周边环境情况吧。</p>
                            <textarea class="describe" rows="3" name="description" placeholder="请输入描述，不少于20个字，不多于140个字" maxlength="140"
                                minlength="20"></textarea>
                        </div>
                    </div>

                    <div class="row pub form-group">

                        <div class=" col-md-12 col-sm-12">

                            <p style="text-align: left">上传图片，吸引更多人关注吧！默认第一张为封面。</p>
                            <input type="file" name="reportFile" id="reportFile" multiple class="file-loading"  enctype="multipart/form-data"/>
							<script type="text/javascript">

								    //初始化fileinput
								//	alert("abc");
								    var oFileInput = new FileInput();
								    //参数1:控件id、参数2:上传地址
							
								    oFileInput.Init("/uploadpic"); 
								    
								//	alert("init over");
								</script>
                        </div>
                    </div>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12 text-center"><button id="register-btn" type="submit"
                            class="btn btn-blue col-md-12 col-sm-12 col-xs-12">同意协议并发布房源</button></div>
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