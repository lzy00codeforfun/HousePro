<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html>
<head>
			
		<!-- 引入css文件 -->
		
		<link rel="stylesheet" type="text/css" href="../css/fileinput.min.css"/>
		
		<!-- 引入js文件 -->
		<script src="../js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="../js/fileinput.min.js"></script>
		
		<script type="text/javascript" src="../js/zh.js"></script>
		
		 
				<script type="text/javascript">

		    //初始化fileinput
	
		    var FileInput = function () {	
		        var oFile = new Object();
		     //   alert("object");
		        //初始化fileinput控件（第一次初始化）
		        oFile.Init = function(ctrlName, uploadUrl) {
		      //  	alert("init begin");
		            var control = $("#reportFile");
		            //初始化上传控件的样式
		     //       alert("get done");
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
					alert("ajax done");
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
	<h3>这是个上传网址</h3>
	<div>
		<!--  img src="http://localhost:8080/housepro/localimg/2018-2019校历.jpg" alt="this is paojie" title="our pic"-->
	</div>
	  <form class="modal-body" action="uploadpic" enctype="multipart/form-data" method="post">
		
		    <a href="" class="form-control" style="border:none;">下载模板</a>
		
		    <input type="file" name="reportFile" id="reportFile" multiple class="file-loading"  enctype="multipart/form-data"/>
		
		</form>
		<script type="text/javascript">

		    //初始化fileinput
			alert("abc");
		    var oFileInput = new FileInput();
		    //参数1:控件id、参数2:上传地址
	
		    oFileInput.Init("/uploadpic"); 
		    
			alert("init over");
		</script>

</body>
</html>