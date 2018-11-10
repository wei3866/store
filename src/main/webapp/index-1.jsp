<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有商品</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.9.1.min.js"></script>
</head>
<body>

		<center>
			<table cellpadding="10">
				<thead>
					<tr>
						<th>ID</th>
						<th>商品名</th>
						<th>价格</th>
						<th>库存</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>
		</center>
		<a href="${APP_PATH }/shooping">进入购物车</a>
<script type="text/javascript">
	
		$(function() {
			$.ajax({
				url : "${APP_PATH }/commoditys",
				type : "get",
				success : function(result) {
					var commoditys = result.extent.commodities;
					
					$.each(commoditys,function(index, item) {
						var cId = $("<td></td>").append(item.cId);
						var cName = $("<td></td>").append(item.cName);
						var cPrice = $("<td></td>").append(item.cPrice);
						var cInventory = $("<td></td>").append(item.cInventory);
						
						var editBtn = $("<button></button>").addClass("delete_btn").append("加入购物车");
						editBtn.attr("c_Id",item.cId);
						
						$("<tr></tr>").append(cId)
									  .append(cName)
						              .append(cPrice)
								      .append(cInventory)
								      .append(editBtn)
								      .appendTo("tbody");
					})
				}
			})
		})
		
		$(document).on("click",".delete_btn",function(){
			var cid = $(this).attr("c_Id");
			var name = $(this).parents("tr").find("td:eq(1)").text();
			$.ajax({
				url : "${APP_PATH}/commodity",
				data : "id=" + cid,
				type : "get",
				success : function(result) {
					alert(result.extent.shoop);
				}
			})
				
		})
		
	
</script>
</body>
</html>