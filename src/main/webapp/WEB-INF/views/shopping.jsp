<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.9.1.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
		
		$(function(){
			
			$("#shoop_text").change(function(){
				
			})
			
		})

</script>
</head>
<body>
		
	<div class="container-fluid">
		
		  <div class="row">
		  	<div class="col-md-12">
				<h1>购物车</h1>
			</div>
		  </div>
		  
		  <div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary" id="emp_add_modal_but">管理</button>
			</div>
		  </div>
		  
		  <div class="row">
		  		
			  	<table class="table table-hover">
					<thead>
						<tr> 
							<th>*</th>
							<th>商品名</th>
							<th>单格</th>
							<th>件数</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${sessionScope.ShoppingCart.items }" var="item">
							<tr>
								<th>
									<input type="checkbox" id="check_merchan"/>
								</th>
								<th>
									<a href="">${item.commodity.cName }</a>
								</th>
								<th>￥${item.commodity.cPrice }</th>
								<th>
									<button class="glyphicon glyphicon-plus"></button>
									<input type="text" value="${item.quantity }" size="1" id="shoop_text">
									<button class="glyphicon glyphicon-minus"></button>
								</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
		  </div>
		  
	  
		 <div class="row">
			<div class="col-md-4">
				<p class="lead">全选:<input type="checkbox" id="check_all"/></p>
			</div>
			
			<div class="col-md-4">
				<p class="lead">合计:￥</p>
			</div>
			
			<div class="col-md-4">
				<button type="button" class="btn btn-danger">结算</button>
			</div>
		</div>
	</div>

</body>
</html>