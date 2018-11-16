<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>卖家中心</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- web路径：
不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
		http://localhost:3306/crud
 -->
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
	
	$("#add_bao").click(function(){
		$(".form-control111").hide();
		$("#addshangpin").modal({
			backdrop:"static"
		});
		
	});
	
	$(".shangjia").click(function(){
	
		$.ajax({
			url:"${APP_PATH}/shangjia",
			type:"POST",
			data:$("#addshangpin form").serialize(),
			success:function(result){
				
				
			}
			
		});
		$("#addshangpin").modal("hide");
		alert("成功上架");
		 window.location.href="${APP_PATH }/sjzxs?pn=9999"; 
	});
	
	//完成全选/全不选功能
	$("#check_all").click(function(){
		//attr获取checked是undefined;
		//我们这些dom原生的属性；attr获取自定义属性的值；
		//prop修改和读取dom原生属性的值
		$(".check_one").prop("checked",$(this).prop("checked"));
	});
	$(document).on("click",".check_one",function(){
		//判断当前选择中的元素是否5个
		var flag = $(".check_one:checked").length==$(".check_one").length;
		$("#check_all").prop("checked",flag);
	});
	
	/*  单个下架*/
	$(document).on("click",".xiajia_one_btn",function(){
		var ccName = $(this).parents("tr").find("th:eq(2)").text();
		var ccid = $(this).parents("tr").find("th:eq(1)").text()
		if(confirm("确定下架【"+ccName+"】吗？")){
			$.ajax({
				url:"${APP_PATH}/xiajia/"+ccid,
				type:"DELETE",
				success:function(result){
				}
			});
			alert("完成下架");
			window.location.href="${APP_PATH }/sjzxs?pn=1"; 
			
		}
	});
	
	//批量下架
	$("#delete_bao").click(function(){
		var ciiid = "";
		$.each($(".check_one:checked"),function(){
			//组装商品id字符串
			ciiid += $(this).parents("tr").find("th:eq(1)").text()+"-";
		
		});
		//去除删除的id多余的-
		ciiid = ciiid.substring(0,ciiid.length-1);
		if(confirm("确认要批量下架选中的商品吗？")){
			$.ajax({
				url:"${APP_PATH}/xiajia/"+ciiid,
				type:"DELETE",
				success:function(result){
					
				}
			});
			alert("完成下架");
			window.location.href="${APP_PATH }/sjzxs?pn=1";
		}
	});
//修改商品
	$(".update_one_btn").click(function(){
		var id = $(this).parents("tr").find("th:eq(1)").text();
		$(".form-control33").hide();
		$(".xill").hide();
		$("#updateshangpin").modal({
			backdrop:"static"
		});
		
		$.ajax({
			url:"${APP_PATH }/updatesp/"+id,
			type:"GET",
			success:function(result){
				var sp = result.extent.comm;
				$("#cId_upd_input").val(sp.cId);
				$("#cMerchantId_upd_input").val(sp.cMerchantId);
				$("#cName_upd_input").val(sp.cName);
				$("#cTypeA_upd_input").val(sp.cTypeA);
				$("#cTypeB_upd_input").val(sp.cTypeB);
				$("#cPrice_upd_input").val(sp.cPrice);
				$("#cPutaway_upd_input").val(sp.cPutaway);
				$("#cInventory_upd_input").val(sp.cInventory);
				$("#updateshangpin input[name=cExpressage]").val([sp.cExpressage]);
			}
		});
	});
	//提交修改
	$(".tijiao").click(function(){
		
		var id = $(this).parent().prev().find("form").find("input:eq(0)").val();
	
		if(confirm("确认要修改该商品的信息吗？")){
			$.ajax({
				url:"${APP_PATH }/updatesp/"+id,
				type:"PUT",
				data:$("#updateshangpin form").serialize(),
				success:function(result){
					
				}
			});
			alert("修改成功");
			
			window.location.reload();
		}
	});
	$("#kandingdan").click(function(){
		window.location.href="${APP_PATH }/sjRecords"; 
	});
	return false;
})
</script>
</head>
<body>
<a href="${APP_PATH }/index.jsp">返回首页</a>

<!-- 修改商品的模态框 -->
<div class="modal fade" id="updateshangpin" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">修改商品</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		     
		      <input type="text" name="cId" class="form-control33" id="cId_upd_input" value="" />
		      <input type="text" name="cMerchantId" class="form-control33" id="cMerchantId_upd_input" value="" />		      

		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品标题</label>
		    <div class="col-sm-10">
		      <input type="text" name="cName" class="form-control" id="cName_upd_input" >
		    </div>
		    </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品类目</label>
		    <div class="col-sm-10">
		      <input type="text" name="cTypeA" class="form-control" id="cTypeA_upd_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品类型</label>
		    <div class="col-sm-10">
		      <input type="text" name="cTypeB" class="form-control" id="cTypeB_upd_input" >
		     
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品价格</label>
		    <div class="col-sm-10">
		      <input type="text" name="cPrice" class="form-control" id="cPrice_upd_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品库存</label>
		    <div class="col-sm-10">
		      <input type="text" name="cInventory" class="form-control" id="cInventory_upd_input" >
		    </div>
		  </div>
		  
		   <div class="form-group xill">
		    <label class="col-sm-2 control-label">上架时间</label>
		    <div class="col-sm-10">
		    <input type="text" name="cPutaway" class="form-control" id="cPutaway_upd_input" value="" />
		    </div>
		  </div>
		   <div class="form-group xill">
		    <label class="col-sm-2 control-label">商品销量</label>
		    <div class="col-sm-10">
		      <input type="text" name="cSales" class="form-control" id="cSales" value="" />
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">是否包邮</label>
		    <div class="col-sm-10">
		       <label class="radio-inline">
				  <input type="radio" name="cExpressage" id="gender1_add_input" value="是" checked="checked"> 是
				</label>
				<label class="radio-inline">
				  <input type="radio" name="cExpressage" id="gender2_add_input" value="否"> 否
				</label>
		    </div>
		  </div>
		  
		 </form>
       		
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary tijiao" >提交</button>
      </div>
    </div>
  </div>
</div>
<!-- 新增商品的模态框 -->
<div class="modal fade" id="addshangpin" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">添加商品</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		     
		      <input type="text" name="cMerchantId" class="form-control111" id="sssiidd" value="${requestScope.mid }" />
		      <input type="text" name="cPutaway" class="form-control111" id="sssiidd" value="${requestScope.cPutaways }" />
		      <input type="text" name="cSales" class="form-control111" id="sssiidd" value="0" />
		    
		    
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品标题</label>
		    <div class="col-sm-10">
		      <input type="text" name="cName" class="form-control" id="cName_add_input" >
		    </div>
		    </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品类目</label>
		    <div class="col-sm-10">
		      <input type="text" name="cTypeA" class="form-control" id="cTypeA_add_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品类型</label>
		    <div class="col-sm-10">
		      <input type="text" name="cTypeB" class="form-control" id="cTypeB_add_input" >
		     
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品价格</label>
		    <div class="col-sm-10">
		      <input type="text" name="cPrice" class="form-control" id="cPrice_add_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品库存</label>
		    <div class="col-sm-10">
		      <input type="text" name="cInventory" class="form-control" id="cInventory_add_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">是否包邮</label>
		    <div class="col-sm-10">
		       <label class="radio-inline">
				  <input type="radio" name="cExpressage" id="gender1_add_input" value="是" checked="checked"> 是
				</label>
				<label class="radio-inline">
				  <input type="radio" name="cExpressage" id="gender2_add_input" value="否"> 否
				</label>
		    </div>
		  </div>
		  
		 </form>
       		
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary shangjia" >上架</button>
      </div>
    </div>
  </div>
</div>
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>我的宝贝</h1>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
			
				<button class="btn btn-primary" id="kandingdan">查看订单</button>
				<button class="btn btn-primary" id="add_bao">新增</button>
				<button class="btn btn-danger" id="delete_bao">下架</button>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>
							<input type="checkbox" id="check_all"/>
						</th>
						<th class="iddddd">#</th>
						<th>宝贝标题</th>
						<th>类目</th>
						<th>类型</th>
						<th>价格</th>
						<th>上架时间</th>
						<th>库存</th>
						<th>销量</th>
						<th>是否包邮</th>
						<th>编辑</th>
						
					</tr>
					<c:forEach items="${pageInfo.list }" var="sjzx">
						<tr>
							<th>
								<input type="checkbox" class="check_one"/>
							</th>
							<th class="iddddd">${sjzx.cId }</th>
							<th>${sjzx.cName }</th>
							<th>${sjzx.cTypeA }</th>
							<th>${sjzx.cTypeB }</th>
							<th>${sjzx.cPrice }</th>
							<th>${sjzx.cPutaway }</th>
							<th>${sjzx.cInventory }</th>
							<th>${sjzx.cSales }</th>
							<th>${sjzx.cExpressage }</th>
							<th>
								<button class="btn btn-primary update_one_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								编辑
								</button>
								
								<button class="btn btn-danger xiajia_one_btn btn-sm">
								<span class="glyphicon glyphicon-tags" aria-hidden="true"></span>
								下架
								</button>
							</th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		<!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
				页,总 ${pageInfo.total } 条记录</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination  kehuhu">
					<li><a href="${APP_PATH }/sjzxs?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/sjzxs?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/sjzxs?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/sjzxs?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/sjzxs?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				</nav>
			</div>
		</div>
		
	</div>

<script type="text/javascript">
	$(function(){
		$(".iddddd").hide();
	})
</script>
</body>
</html>