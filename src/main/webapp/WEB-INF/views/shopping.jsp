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
		  
		  <div class="row hide">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary" id="emp_add_modal_but">完成</button>
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
							<tr class="${item.commodity.cId }">
								<td>
									<input type="checkbox" id="check_merchan"/>
								</td>
								<td>
									<a href="">${item.commodity.cName }</a>
								</td>
								<td>￥${item.commodity.cPrice }</td>
								<td>
									<button class="glyphicon glyphicon-plus"></button>
									<input type="text" value="${item.quantity }" size="1" class="${item.quantity }">
									<button class="glyphicon glyphicon-minus"></button>
								</td>
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
				<p class="lead">合计:￥0</p>
			</div>
			
			<div class="col-md-4">
				<button type="button" class="btn btn-danger">结算</button>
			</div>
			
			<div class="col-md-4 hide">
				<button type="button" class="btn btn-danger delete_shoop">删除</button>
			</div>
			
		</div>
	</div>

<script type="text/javascript">
			
		//验证修改的商品数量
		$(":text").change(function(){
			var quantityVal = $.trim(this.value);
			var $tr = $(this).parent().parent();
			var id = $tr.attr("class");
				
			var flag = false;
			
			var reg = /^\d+$/g;
			var quantity = -1;
			
			//正则法则验证格式
			if(reg.test(quantityVal)){
				quantity = parseInt(quantityVal);
				if(quantity >= 0){
					flag = true;
				}
			}
			
			if(!flag){
				alert("输入的数量不合法!");
				$(this).val($(this).attr("class"));
				return;
			}
			
			var $tr = $(this).parent().parent();
			var title = $.trim($tr.find("td:eq(1)").text());

			if(quantity == 0){
				var flag2 = confirm("确定要删除 【" + title + "】 吗?");
				if(flag2){
					
					return;
				}
			}
			
			var flag = confirm("确定要修改" + title + "的数量吗?");
			
			if(!flag){
				$(this).val($(this).attr("class"));
				return;
			}else{
				$.ajax({
					url:"${APP_PATH}/updateShoop",
					data : "quantity=" + quantityVal + "&id="+ id,
					type:"GET",
					success:function(result){
						
					}
				});
			}
		})
			
</script>

</body>
</html>