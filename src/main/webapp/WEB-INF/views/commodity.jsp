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

</head>
<body>
	<!-- 模态框 -->
	<div class="modal fade" id="commodityModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">加入购物车</h4>
	      </div>
	      <div class="modal-body">
	        
			  <div class="form-group">
			    <label class="col-sm-2 control-label">数量</label>
			    <div class="col-sm-10">
			    	<button class="glyphicon glyphicon-plus"></button>
			    	<input type="text" value="1" size="1" class="text" id="${commodity.cId }">
			        <button class="glyphicon glyphicon-minus"></button>
			    </div>
			  </div>
			  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="merchant_save_modal">完成</button>
	      </div>
	    </div>
	  </div>
	</div>
<center>
<br>
<br>
<br>
<br>
       <h3>商品名: ${commodity.cName }</h3>
	   <h3>单价: ${commodity.cPrice }</h3>
	   <h3>上架时间: ${commodity.cPutaway }</h3>
	   <h3>库存: ${commodity.cInventory }</h3>
	   <h3>是否包邮: ${commodity.cExpressage }</h3>
		<br><br> 
		<button type="button" class="btn btn-primary btn_shoop">加入购物车</button>
		<button type="button" class="btn btn-primary btn_gouwu">继续购物</button>
</center>	
<script type="text/javascript">
		
		$(".btn_shoop").click(function(){
			//打开模态框
			$("#commodityModal").modal({
				backdrop : "static"
			});
		})
		
		$(".glyphicon-plus").click(function(){
			var $input = $(this).parent().find("input");
			var val = $.trim($input.val());
			
			$input.attr("value",val*1+1);
		})
		
		$(".glyphicon-minus").click(function(){
			var $input = $(this).parent().find("input");
			var val = $.trim($input.val());
			if (val*1 > 1) {
				$input.attr("value",val*1-1);
			}
		})
		
		//验证修改的商品数量
		$(".text").change(function(){
			var quantityVal = $.trim(this.value);
			
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
				$(this).val($(this).attr("value",1));
				return;
			}
			
		})
		
		$("#merchant_save_modal").click(function(){
			
			var shoops = $.trim($(".text").val());
			var id = $.trim($(".text").attr("id"));
			
			if (shoops*1 < 1) {
				return			
			}
			
			$.ajax({
				url:"${APP_PATH}/commodity",
				data: "id="+id+"&shoops="+shoops,
				type:"GET",
				success:function(result){
					var code = result.code
					if (code == 100) {
						alert("已加入购物车!")
						$("#commodityModal").modal('hide');
					}
				}
			});
			
		})
		
		$(".btn_gouwu").click(function(){
			location.href = "${APP_PATH }/index.jsp";
		})
		
		
</script>
</body>
</html>