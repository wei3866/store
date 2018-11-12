<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宝贝详情页</title>
<%
   pageContext.setAttribute("APP_PATH",request.getContextPath());
%>

<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
		$.ajax({
			url:"${APP_PATH }/getcommodityInfo",
			type:"GET",
			success:function(result){
				var commodity = result.extent.commodityInfo;
				$.each(commodity,function(index,item){
		    		$("#name1").text("店铺名: "+item.merchant.merName);
		    		$("#name2").text("宝贝名: "+item.cName);
		    		$("#typeA").text("宝贝归类: "+item.cTypeA);
		    		$("#typeB").text("宝贝类型: "+item.cTypeB);
		    		$("#price").text("宝贝价格: "+item.cPrice);
		    		$("#time").text("上架时间: "+item.cPutaway);
		    		$("#sales").text("销量: "+item.cSales);
		    		$("#expressage").text("是否包邮: "+item.cExpressage);
		    	});
			}
		});
		return false;
});
</script>
</head>
<body>
<center>

        <h3>我的选择</h3>
		<p id="name1"></p>
		<p id="name2"></p>
		<p id="typeA"></p>
		<p id="typeB"></p>
		<p id="price"></p>
		<p id="time"></p>
		<p id="sales"></p>
		<p id="expressage"></p>
		<br><br> 
		
		<a href="">继续购物</a>
		<a href="">加入购物车</a>
		<a href="${APP_PATH }/index.jsp">返回首页</a>
	</center>
</body>
</html>