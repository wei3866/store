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
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.9.1.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container-fluid">
		
		  <div class="row">
		  	<div class="col-md-12">
				<h1>商城</h1>
			</div>
		  </div>
		  
		  <div class="row">
		  	<div class="col-md-2 col-md-offset-10 user_test">${sessionScope.userLogin == null ? 游客 : sessionScope.userLogin }</div>
			<div class="col-md-2 col-md-offset-10">
				<a href="login">登录</a>&nbsp;&nbsp;<a href="" class="loin_user">个人中心</a>&nbsp;&nbsp;<a href="${APP_PATH }/shooping">购物车</a>&nbsp;&nbsp;<a href="" class="login_out">退出</a>
			</div>
		  </div>
		  
		  <div class="col-md-2 col-lg-6">
		    <div class="input-group">
		      <input type="text" class="form-control so_text" placeholder="请输入您要搜索的商品">
		      <span class="input-group-btn">
		        <button class="btn btn-default so_so" type="button">搜索</button>
		      </span>
		    </div>
		  </div>
		  
		  <div class="row ">
			  	<table class="table table-hover">
					<thead class="hide so_commodity">
						<tr> 
							<th>商品名</th>
							<th>单价</th>
							<th>已售</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						
					</tbody>
				</table>
		  </div>
		  
	</div>
<script type="text/javascript">
	
	$(function(){
		$(".so_so").click();
	})

	
	$(".so_so").click(function(){
		
		$(".table-hover tbody").empty();

		
		var soText = $.trim($(".so_text").val());
		
		$.ajax({
			url:"${APP_PATH}/commodityName",
			data: "soText="+soText,
			type:"GET",
			success:function(result){
				var code = result.code;
				
				if (code == 100) {
					$(".so_commodity").removeClass("hide");
					
					$.each(result.extent.commodities,function(index, item) {
					
						var NameTd = $("<td></td>").append(item.cName);
						var PriceTd = $("<td></td>").append(item.cPrice);
						var SalesTd = $("<td></td>").append(item.cSales);
						
						var editBtn = $("<button></button>").addClass("btn btn-info btn-sm edit_btn")
															.append($("<span></span>")
															.addClass("glyphicon glyphicon-pencil"))
															.append("进店");
						editBtn.attr("edit-id",item.cMerchantId);
						var delBtn = $("<button></button>").addClass("btn btn-primary btn-sm del_btn")
															.append($("<span></span>")
															.addClass("glyphicon glyphicon-pencil"))
															.append("详情");
						delBtn.attr("del-id",item.cId);
						var btnTd = $("<td></td>").append(delBtn);
						$("<tr></tr>").append(NameTd)
									  .append(PriceTd)
						              .append(SalesTd)
						              .append(btnTd)
								      .appendTo("tbody");
					})
				}
			}
		});
		
	})
	
	$(document).on("click",".del_btn",function(){
		var id = $(this).attr("del-id");
		location.href = "commodityInfo?id="+id;
	})
	
	$(".loin_user").click(function(){
		$.ajax({
			url:"${APP_PATH}/commodityUser",
			type:"GET",
			success:function(result){
				var code = result.code;
				if (code == 100) {
					var text = $(".user_test").text();
					location.href = "user?inputNumber="+text;
				}else{
					alert(result.extent.login);
				}
			}
		})
	})
	
	$(".login_out").click(function(){
		$.ajax({
			url:"${APP_PATH}/loginOut",
			type:"GET",
			success:function(result){
				var code = result.code;
				if (code == 100) {
					alert("已退出!")
				}
			}
		})
	})

</script>
</body>
</html>