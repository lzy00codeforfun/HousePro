<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>results with ChinaMap</title>
		<meta name="description" content="map created using amCharts pixel map generator" />
		
		<!--
			This map was created using Pixel Map Generator by amCharts and is licensed under the Creative Commons Attribution 4.0 International License.
			You may use this map the way you see fit as long as proper attribution to the name of amCharts is given in the form of link to https://pixelmap.amcharts.com/
			To view a copy of this license, visit http://creativecommons.org/licenses/by/4.0/

			If you would like to use this map without any attribution, you can acquire a commercial license for the JavaScript Maps - a tool that was used to produce this map.
			To do so, visit amCharts Online Store: https://www.amcharts.com/online-store/
		-->

		<!-- amCharts javascript sources -->
    	<script src="//cdn.bootcss.com/jquery/2.1.4/jquery.min.js"></script>
    	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="ammap/ammap.js"></script>
		<script type="text/javascript" src="ammap/maps/js/chinaLow.js"></script>
		<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
	    <link href="css/style.css" type="text/css" rel="stylesheet" media="all">
	    <link rel="stylesheet" href="css/swipebox.css">
	    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
	    <!-- //Custom Theme files -->
	    <!-- font-awesome icons -->
	    <link href="css/font-awesome.css" rel="stylesheet">
		<!-- amCharts javascript code -->

	</head>
	<body style="margin: 0;background-color: rgba(80,80,80,1);">
		<div class="serach-w3agile">
			<div class="container">
				<div class="place-grids">
					<form action="toProvinceMap" method="post">
						<div class="col-md-2 col-xs-4 place-grid">
							 <input type="text" class="form-control" id="startTime" name="startTime" placeholder="起始时间(xxxx/xx/xx)" maxlength="20" required>
						</div>
						<div class="col-md-2 col-xs-4 place-grid">
							<input type="text" class="form-control" id="endTime" name="endTime" placeholder="终止时间(xxxx/xx/xx)" maxlength="20" required>
						</div>
						<div class="col-md-2 col-xs-4 place-grid">
							<input type="submit" value="Search">
						</div>
						<div class="clearfix"></div>
					</form>
				</div>
			</div>
		</div>
		<div>
				<p> 
						<l>图标显示的起止时间：</l>
						<l id="stime">${donestartTime }</l>
						<l> - </l>
						<l id="etime">${doneendTime }</l>
				</p>
		</div>
				<script type="text/javascript">
			var colorlist={
					"1":"#FF0000",
					"2":"#FF4500",
					"3":"#FF5511",
					"4":"#FF7744",
					"5":"#EE7700",
					"6":"#FF7F50",
					"7":"#FA8072",
					"8":"#F08080",
					"9":"#F4A460",
					"10":"#FFDAB9",
					"11":"#F5DEB3",
					"12":"#FFDEAD",
					"13":"#FFE4B5",
					"14":"#FFE4C4",
					"15":"#FFEFD5",
					"16":"#FAEBD7",
					"17":"#FAF0E6",
					"18":"#FDF5E6",
					"19":"#FFF5EE",
					"20":"#FFFAF0",
					"21":"#FFFFF0",
					"22":"#4169E1",
					"23":"#6495ED",
					"24":"#1E90FF",
					"25":"#00BFFF",
					"26":"#87CEFA",
					"27":"#ADD8E6",
					"28":"#48D1CC",
					"29":"#40E0D0",
					"30":"#B0E0E6",
					"31":"#E0FFFF",
					"32":"#F0FFFF",
					"33":"#696969",
					"34":"#A9A9A9"
			}
			var chartdata={
					"map": "chinaLow",
					"getAreasFromMap": true,
					"images": [
						{
							"top": 40,
							"left": 60,
							"width": 80,
							"height": 40,
							"pixelMapperLogo": true,
							"url": "http://www.amcharts.com"
						}
					],
					"areas": [
						
						{
							"id": "CN-11",
							"title": "Beijing",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]] ",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-43",
							"title": "Hunan",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-34",
							"title": "Anhui",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-50",
							"title": "Chongqing",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-35",
							"title": "Fujian",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-44",
							"title": "Guangdong",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-62",
							"title": "Gansu",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-45",
							"title": "Guangxi",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-52",
							"title": "Guizhou",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-46",
							"title": "Hainan",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-13",
							"title": "Hebei",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-41",
							"title": "Henan",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-23",
							"title": "Heilongjiang",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						
						{
							"id": "CN-42",
							"title": "Hubei",
							"color": "rgba(175,174,174,1)",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail"
						},
						{
							"id": "CN-22",
							"title": "Jilin",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-32",
							"title": "Jiangsu",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-36",
							"title": "Jiangxi",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-21",
							"title": "Liaoning",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-15",
							"title": "Neimenggu",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-64",
							"title": "Ningxia",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-63",
							"title": "Qinghai",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-61",
							"title": "Shaanxi",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-51",
							"title": "Sichuan",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-37",
							"title": "Shandong",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-31",
							"title": "Shanghai",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-14",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"title": "Shanxi",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-12",
							"title": "Tianjin",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-71",
							"title": "Taiwan",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-65",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"title": "Xinjiang",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-54",
							"title": "Xizang",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-53",
							"title": "Yunnan",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"color": "rgba(175,174,174,1)"
						},
						{
							"id": "CN-33",
							"value": "0",
							"balloonText":"[[title]]\n 成交笔数[[value]]",
							"ajaxUrl":"getTransactionDetail",
							"title": "Zhejiang",
							"color": "rgba(175,174,174,1)"
						}
					]
				};
		//	alert("loading");
			var url="getProvinceData"+"?"+"startTime="+$("#stime").text()+"&endTime="+$("#etime").text();
		//	alert(url);
			$.ajax({
	            type:"post",
	            url:"getProvinceData"+"?"+"startTime="+$("#stime").text()+"&endTime="+$("#etime").text(),
	            data:"",
	            async:false,
	            dataType: "text",
	            success: function (result) {
	        //    	alert(result);
	            	var jsobj=$.parseJSON(result);
	         //	  	alert(jsobj);
	            	var i=0;
	            	var s=34;
	            //	alert(jsobj[0].length());
	            	for(i=0;i<s;i++){
	            		if(jsobj[0][chartdata.areas[i].title]!==undefined){
	            			//alert(i)
	            			chartdata.areas[i].value=jsobj[0][chartdata.areas[i].title]["value"];
		            		chartdata.areas[i].color="";
		            		chartdata.areas[i].color=colorlist[jsobj[0][chartdata.areas[i].title]["rank"]];
		         	  		//alert(chartdata.areas[i].title);
	            		}
	            		
	            	}
	          //  	alert(chartdata);
	            },
	            error:function(data, XMLHttpRequest, textStatus, errorThrown){  
	            	alert("error"); 
	            	  }
	        });
		//	alert("ajax over");
			AmCharts.makeChart("map",{
					"type": "map",
					"addClassNames": true,
					"fontSize": 15,
					"color": "#FFFFFF",
					"projection": "mercator",
					"backgroundAlpha": 1,
					"backgroundColor": "rgba(80,80,80,1)",
					"dataProvider": chartdata,
					"balloon": {
						"horizontalPadding": 15,
						"borderAlpha": 0,
						"borderThickness": 1,
						"verticalPadding": 15
					},
					"areasSettings": {
						"color": "rgba(130,130,130,1)",
						"outlineColor": "rgba(80,80,80,1)",
						"rollOverOutlineColor": "rgba(80,80,80,1)",
						"rollOverBrightness": 20,
						"selectedBrightness": 20,
						"selectable": true,
						"unlistedAreasAlpha": 0,
						"unlistedAreasOutlineAlpha": 0
					},
					"imagesSettings": {
						"alpha": 1,
						"color": "rgba(130,130,130,1)",
						"outlineAlpha": 0,
						"rollOverOutlineAlpha": 0,
						"outlineColor": "rgba(80,80,80,1)",
						"rollOverBrightness": 20,
						"selectedBrightness": 20,
						"selectable": true
					},
					"linesSettings": {
						"color": "rgba(130,130,130,1)",
						"selectable": true,
						"rollOverBrightness": 20,
						"selectedBrightness": 20
					},
					"zoomControl": {
						"zoomControlEnabled": true,
						"homeButtonEnabled": false,
						"panControlEnabled": false,
						"right": 38,
						"bottom": 30,
						"minZoomLevel": 0.25,
						"gridHeight": 100,
						"gridAlpha": 0.1,
						"gridBackgroundAlpha": 0,
						"gridColor": "#FFFFFF",
						"draggerAlpha": 1,
						"buttonCornerRadius": 2
					},
					"listeners": [ {
						"event": "clickMapObject",
						"method": function( e ) {
			//				alert("click");
			//				alert(e.mapObject.title);
						  // check if clicked map object contains "ajaxUrl" parameter
						  if ( e.mapObject.ajaxUrl !== undefined ) {
							// add "description" if it was empty
			//				alert($("#stime").text());
							window.location.href=e.mapObject.ajaxUrl+"?province="+e.mapObject.title+"&"+"startTime="+$("#stime").text()+"&"+"endTime="+$("#etime").text();
						  }
						}
					  } ]
				});
		</script>
		<div id="map" style="width: 100%; height: 614px;"></div>
	</body>
</html>