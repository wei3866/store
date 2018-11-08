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
		  
		  <div class="row manage_but">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary" id="manage_but">管理</button>
			</div>
		  </div>
		  
		  <div class="row hide ok_but">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-success" id="ok_but">完成</button>
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
							<th>总价</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${sessionScope.ShoppingCart.items }" var="item">
							<tr class="${item.commodity.cId }">
								<td>
									<input type="checkbox" class="check_merchan"/>
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
								<td>￥${item.commodity.cPrice * item.quantity }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
		  </div>
		  
	  
		 <div class="row">
			<div class="col-md-4">
				<p class="lead">全选:<input type="checkbox" id="check_all"/></p>
			</div>
			
			<div class="col-md-4 All_money">
				<p class="lead All_moneys">合计:￥0</p>
			</div>
			
			<div class="col-md-4 btn_danger">
				<button type="button" class="btn btn-danger">结算</button>
			</div>
			
			<div class="col-md-4 col-md-offset-4 hide delete_shoop">
				<button type="button" class="btn btn-danger delete_shoops">删除</button>
			</div>
			
		</div>
	</div>

<script type="text/javascript">
			
		//验证修改的商品数量
		$(":text").change(function(){
			var quantityVal = $.trim(this.value);
			var $tr = $(this).parent().parent();
			var id = $tr.attr("class");
			
			var val = $.trim($(this).val());
			var price = parseInt($tr.find("td:eq(2)").text().replace(/[^0-9]/ig,""));
			
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
					//删除商品
					delete_shoops(id);
					$tr.remove();
					return;
				}
			}
			
			var flag = confirm("确定要修改 【" + title + "】 的数量吗?");
			
			if(!flag){
				$(this).val($(this).attr("class"));
				return;
			}else{
				$.ajax({
					url:"${APP_PATH}/updateShoop",
					data : "quantity=" + quantityVal + "&id="+ id,
					type:"GET",
					success:function(result){
						var money = (val*1)*(price*1);
						$tr.find("td:eq(4)").text("￥"+money);
					}
				});
			}
		})
		
		//通过加号修改商品数量
		$(".glyphicon-plus").click(function(){
			var $input = $(this).parent().find("input");
			var val = $.trim($input.val());
			
			var $tr = $(this).parent().parent();
			var id = $tr.attr("class");
			
			var price = parseInt($tr.find("td:eq(2)").text().replace(/[^0-9]/ig,""));
			
			$.ajax({
				url:"${APP_PATH}/plusShoop",
				data : "id="+ id,
				type:"GET",
				success:function(result){
					 $input.attr("value",val*1+1);
					 var money = (val*1+1)*(price*1);
					 $tr.find("td:eq(4)").text("￥"+money);
				}
			});
		})
		
		//通过减号修改商品数量
		$(".glyphicon-minus").click(function(){
			var $input = $(this).parent().find("input");
			var val = $.trim($input.val());
			
			var $tr = $(this).parent().parent();
			var title = $.trim($tr.find("td:eq(1)").text());
			
			var $tr = $(this).parent().parent();
			var id = $tr.attr("class");
			
			var price = parseInt($tr.find("td:eq(2)").text().replace(/[^0-9]/ig,""));
			
			if(val == 1){
				var flag2 = confirm("确定要删除商品 【" + title + "】 吗?");
				if(flag2){
					//删除商品
					delete_shoops(id);
					$tr.remove();
					return;
				}else{
					$input.attr("value",1);
					return;
				}
			}
			
			$.ajax({
				url:"${APP_PATH}/minusShoop",
				data : "id="+ id,
				type:"GET",
				success:function(result){
					 $input.attr("value",val*1-1);
					 var money = (val*1-1)*(price*1);
					 $tr.find("td:eq(4)").text("￥"+money);
				}
			});
		})
		
		var moneys = 0;
		
		//根据选中的商品计算所需钱
		//全选/全不选
		$("#check_all").click(function(){
			$(".check_merchan").prop("checked",$(this).prop("checked"));
			
			moneys = 0;
			$.each($('input:checkbox:checked[id != check_all]'),function(){
				var $tr = $(this).parent().parent();
				var money = parseInt($tr.find("td:eq(4)").text().replace(/[^0-9]/ig,""))*1;
				moneys += money;
            });
			$(".All_moneys").text("");
			$(".All_moneys").text("合计:￥"+moneys);
			
		})
		
		//根据选中的商品计算所需钱
		$(".check_merchan").click(function(){
			var flag = $(".check_merchan:checked").length == $(".check_merchan").length;
			$("#check_all").prop("checked",flag);
			
			moneys = 0;
			$.each($('input:checkbox:checked[id != check_all]'),function(){
				var $tr = $(this).parent().parent();
				var money = parseInt($tr.find("td:eq(4)").text().replace(/[^0-9]/ig,""))*1;
				moneys += money;
            });
			$(".All_moneys").text("");
			$(".All_moneys").text("合计:￥"+moneys);
			
		})
		
		//管理
		$("#manage_but").click(function(){
			
			$(".manage_but").toggle();
			$(".ok_but").removeClass("hide");
			$(".All_money").toggle();
			$(".btn_danger").toggle();
			$(".delete_shoop").removeClass("hide");
			
		})
		
		//删除按钮
		$(".delete_shoops").click(function(){
			var ids = [];
			var names = [];
			$.each($('input:checkbox:checked[id != check_all]'),function(){
				var $tr = $(this).parent().parent();
				var id = $tr.attr("class");
				var name = $tr.find("td:eq(1)").text();
				id = $.trim(id);
				ids.push(id);
				name = $.trim(name);
				names.push(name);
            });
			names = $.trim(names);
			var flag = confirm("确定要删除商品 【" + names + "】 吗?");
			if(flag){
				delete_shoops(ids)
			}
			
		})
		
		//删除多个商品
		function delete_shoops(ids){
			
			$.ajax({
				url:"${APP_PATH}/deleteShoops",
				data : "ids="+ ids,
				type:"GET",
				success:function(result){
					$.each($('input:checkbox:checked[id != check_all]'),function(){
						var $tr = $(this).parent().parent();
						$tr.remove();
		            });
				}
			})
		}
		
		//完成
		$("#ok_but").click(function(){
			
			$(".manage_but").toggle();
			$(".ok_but").addClass("hide");
			$(".All_money").toggle();
			$(".btn_danger").toggle();
			$(".delete_shoop").addClass("hide");
			
		})
		
			
</script>

</body>
</html>