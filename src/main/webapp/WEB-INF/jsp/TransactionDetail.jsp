<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<script src="//cdn.bootcss.com/jquery/2.1.4/jquery.min.js"></script>
		<link href="assets/css/bootstrap.css" rel="stylesheet">
	    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
	    <link href="assets/css/tablecloth.css" rel="stylesheet">
	    <link href="assets/css/prettify.css" rel="stylesheet"> 
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<title> 地区详情 </title>
		<!-- AmCharts includes -->
		<script src="amcharts/amcharts.js"></script>
		<script src="amcharts/xy.js"></script>
		<script src="amcharts/serial.js"></script>

		<!-- Export plugin includes and styles -->
		<script src="amcharts/plugins/export/export.js"></script>
		<link type="text/css" href="amcharts/plugins/export/export.css" rel="stylesheet">
	
	
		<script src="amcharts/themes/light.js"></script>
		<style>
			body, html {
				padding: 0;
				margin: 0;
				font-size: 11px;
				font-family: Verdana;
			}
			#chartdiv {
				width: 100%;
				height: 90%;
			}
		</style>

		
	</head>
	<body>
		<div>
				<p> 
							<l>折线图显示的起止时间：</l>
							<l id="stime">${startTime }</l>
							<l> - </l>
							<l id="etime">${endTime }</l>
							<l>      地点：  </l>
							<l id="province">${province }</l>
					</p>
		</div>
		<script type="text/javascript">
		alert("begin to get graph data");
		var chartData = [{'month':'2018-01','value':'62'},{'month':'2018-02','value':'77'},{'month':'2018-03','value':'124'}];
		var url="getGraphData"+"?"+"startTime="+$("#stime").text()+"&endTime="+$("#etime").text()+"&province="+$("#province").text()
		$.ajax({
            type:"post",
            url:"getGraphData"+"?"+"startTime="+$("#stime").text()+"&endTime="+$("#etime").text()+"&province="+$("#province").text(),
            data:"",
            async:false,
            dataType: "text",
            success: function (result) {
         		var jsobj=$.parseJSON(result);
         		chartData=jsobj;
            },
            error:function(data, XMLHttpRequest, textStatus, errorThrown){  
            	alert("error"); 
            	  }
        });
			/**
			 * Create the chart
			 */
			var chart = AmCharts.makeChart("chartdiv", {
			  "type": "serial",
			  "theme": "light",
			  "autoMarginOffset": 20,
			  "mouseWheelZoomEnabled": false,
			  "dataDateFormat": "YYYY-MM",
			  "valueAxes": [{
			    "axisAlpha": 0,
			    "position": "left",
			    "ignoreAxisWidth": true
			  }],
			  "graphs": [{
			    "id": "g1",
			    "bullet": "round",
			    "bulletBorderAlpha": 1,
			    "bulletColor": "#FFFFFF",
			    "bulletSize": 5,
			    "hideBulletsCount": 50,
			    "lineThickness": 2,
			    "title": "red line",
			    "useLineColorForBulletBorder": true,
			    "valueField": "value",
			    "balloonText": "<span style='font-size:18px;'>[[value]]</span>"
			  }],
			  "chartScrollbar": {
			    "graph": "g1",
			    "oppositeAxis": false,
			    "offset": 30,
			    "scrollbarHeight": 80,
			    "backgroundAlpha": 0,
			    "selectedBackgroundAlpha": 0.1,
			    "selectedBackgroundColor": "#888888",
			    "graphFillAlpha": 0,
			    "graphLineAlpha": 0.5,
			    "selectedGraphFillAlpha": 0,
			    "selectedGraphLineAlpha": 1,
			    "autoGridCount": true,
			    "color": "#AAAAAA"
			  },
			  "chartCursor": {
			    "pan": true,
			    "valueLineEnabled": true,
			    "valueLineBalloonEnabled": true,
			    "cursorAlpha": 1,
			    "cursorColor": "#258cbb",
			    "valueLineAlpha": 0.2,
			    "valueZoomable": true,
			    "categoryBalloonDateFormat":"YYYY-MM"
			  },
			  "valueScrollbar": {
			    "oppositeAxis": false,
			    "offset": 50,
			    "scrollbarHeight": 10
			  },
			  "categoryField": "month",
			  "categoryAxis": {
				"minPeriod" : "MM",
			    "parseDates": true,
			    "dashLength": 1,
			    "minorGridEnabled": true
			  },
			  "export": {
			    "enabled": true
			  },
			  "listeners": [{
			    "event": "rendered",
			    "method": function(e) {
			      e.chart.valueAxes[0].zoomToValues(30, 70);
			    }
			  }],
			  "dataProvider": chartData
			});
		</script>
		
		<div id="chartdiv"></div>
		
		
		    <div class="container">
      <div class="row">
        <div class="span12" style="padding:10px 0;">
        
          <table cellspacing="1" cellpadding="3" class="tablehead" style="background:#CCC;">
          <caption>
            <h3>       房屋交易明细</h3>
          </caption>
          <thead>  
            <tr class="stathead">
              <th class="{sorter: false}" colspan="3">2011 Game Log</th>
              <th class="{sorter: false}" colspan="3">Passing</th>
              <th class="{sorter: false}" colspan="4">Rushing</th>
            </tr>

            <tr class="colhead">
              <th class="{sorter: false}">完成时间</th>
              <th class="{sorter: false}">房主</th>
              <th class="{sorter: false}">租客</th>
              <th title="Interceptions thrown" align="right">house</th>
              <th title="starttime" align="right">合同开始时间</th>
              <th title="endtime" align="right">合同结束时间</th>
              <th title="rentmoney/month" align="right">月租金</th>
              <th title="total" align="right">总租金</th>
              <th title="middle_host" align="right">房主中介费</th>
              <th title="middle_quest" align="right">租客中介费</th>
            </tr>
          </thead>
          <tbody>
 		<c:forEach var="dl" items="${deallist }">
          <tr class="evenrow">
          <td>${dl.modification_time }</td>
          <td><a href="admin/getUserInfor?username=${dl.landlord_username }">${dl.landlord_username }</a></td>
          <td><span >@</span> <a href="admin/getUserInfor?username=${dl.tenant_username }">${dl.tenant_username }</a>
	          </td><td align="right">${dl.house_id}</td>
	          <td align="right">${dl.start_date }</td>
	          <td align="right">${dl.end_date }</td>
	          <td align="right">${dl.monthly_rent }</td>
	          <td align="right">${dl.tot_rent }</td>
	          <td align="right">${dl.landlord_agency_fee }</td>
	          <td align="right">${dl.tenant_agency_fee }</td>
          </tr>
        </c:forEach>
          
          
          </tbody>
          
          </table>
          
         
          
        </div>
      </div>
    </div>
  
    <script src="assets/js/jquery-1.7.2.min.js"></script>
    <script src="assets/js/bootstrap.js"></script>
    <script src="assets/js/jquery.metadata.js"></script>
    <script src="assets/js/jquery.tablesorter.min.js"></script>
    <script src="assets/js/jquery.tablecloth.js"></script>
    
    <script type="text/javascript" charset="utf-8">
      $(document).ready(function() {
        $("table").tablecloth({
          theme: "paper",
          striped: true,
          sortable: true,
          condensed: true
        });
      });
    </script>
		
	</body>
</html>