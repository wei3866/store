<%@page import="com.geruisi.bean.Commodity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商城</title>
<%
   pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 搭建显示页面 ,用柵格系統 -->
<div class="container">
     <!-- 标题 -->
     <div class="row">
       <div class="col-md-12">
         <h1>商城</h1>
       </div>
     </div>
     <div class="main">
		<div class="col-md-4 col-md-offset-8">
		<div class="right" id="curentuser">
			请 <a href="" onclick="">登录 </a>&nbsp;&nbsp;
			  <a href="">免费注册</a>&nbsp;&nbsp;
			  <a href="" onclick="">我的订单</a>&nbsp;&nbsp;
			  <a href="" onclick="">卖家中心</a>&nbsp;&nbsp;
			  <a href="">退出</a>
         </div>
         </div>
	  </div>
	<div class="header">
		<div class="main">
			<div class="logo">
			<!-- LOGO图片 -->
				<a href=""><img src="images/logo1.jpg" width="100" height="50"/></a>
			</div>
			<!-- search搜索 -->
			<div class="col-md-4 col-md-offset-4">
			<form action="index2" method="get">
					<input type="text" name="cName" id="input" onfocus="if(this.value == this.defaultValue) this.value = ''"  onblur="if(this.value == '') this.value = this.defaultValue" value="请输入宝贝名"/>
					<br>
					<input type="text" name="cTypeA" onfocus="if(this.value == this.defaultValue) this.value = ''"  onblur="if(this.value == '') this.value = this.defaultValue" value="请输入宝贝归类"/>
					<br>
					<input type="text" name="cTypeB" onfocus="if(this.value == this.defaultValue) this.value = ''"  onblur="if(this.value == '') this.value = this.defaultValue" value="请输入宝贝类型"/>
					<br>
					<input type="button" name="btn" id="btn" value="搜索" />
					<img src="images/shousuo.jpg" >
			</form>		
			</div>
			<div class="shopcart" id="scroll-cart">
				<div class="shopcart-a">  
				<span class="a"><img src="images/huiyuan.jpg" width="25" height="25" /></span>
				<a href="" class="members">会员中心</a>
					<a class="gw" href="" id="div_pro" onclick="">
						<span class="sj"><img src="images/gowuche.jpg" width="25" height="25" /></span>
						<span class="b" id="tosettle">我的购物车</span>
					</a>  
				</div> 
			</div>
		</div>
</div>
<!-- 导航 -->
<div class="navbox" id="test">
<div class="newdh">
	<div class="menu">
      <ul> 
		<li class="sete"><a href="${APP_PATH }/index.jsp">首页</a></li>
      </ul>
    </div>
<%
	List<Commodity> commodities = (List<Commodity>)request.getAttribute("commodities");
	if (commodities != null && commodities.size() > 0){
%>
      <div class="col-xs-8">
		<!-- 显示表格数据 -->
		<table class="table table-hover" id="commodity_table">
		   <thead>
			 <tr>
			    <th>商品店铺ID</th>
				<th>宝贝名</th>
				<th>宝贝归类</th>
				<th>宝贝类型</th>
				<th>宝贝价格</th>
				<th>详情</th>			
			 </tr>			
		  </thead>
<%
	for(Commodity commodity:commodities){
%>		  
          <tbody>
			<tr>
			  <td><%=commodity.getcMerchantId() %></td>
			  <td><%=commodity.getcName() %></td>
			  <td><%=commodity.getcTypeA() %></td>
			  <td><%=commodity.getcTypeB() %></td>
			  <td><%=commodity.getcPrice() %></td>
			</tr>
		  </tbody>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     	
<%
	}
%>
		</table>  
<%
	}
%>		
	 </div> 
  </div>
</div>
<script type="text/javascript">

$(function(){
	$("#btn").click(function(){
		//获取文本框输入
		var text = $("#input").val();
		if($.trim(text) != ""){
			$("#table tr:not('#theader')").hide().filter(":contains('"+text+"')").show();
		}
	});
});		
</script>
</body>
</html>