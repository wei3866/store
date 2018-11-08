<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户--订单</title>
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
	//点击查看此订单详细信息
	$(".record_get_model_btn").click(function(){
		var id = $(this).parent().parent().find("th:eq(0)").text();
		
		getOneRecord(id);
		$("#recordGetModel").modal({
			backdrop:"static"
		});
	});
	//查出一条详细信息
	function getOneRecord(id){
		
		$.ajax({
			url:"${APP_PATH }/getOneRecord",
			type:"GET",
			data:"id="+id,
			success:function(result){
			//{"code":100,"msg":"处理成功!",
			//"extent":{"oneRecord":[{"rId":104,"rOrderId":"4000000156781207","rUNumber":"17890364829",
			//"rCId":1,"rMerId":2,"rMonery":10000,"rDeliver":"2018-11-08",
			//"rReceiving":null,"rState":"2",
			//"status":{"sId":null,"sRState":"待收货"},
			//"commodity":{"cId":null,"cMerchantId":null,"cName":"小米6","cTypeA":"数码","cTypeB":"手机",
			//"cPrice":null,"cPutaway":null,"cInventory":null,"cSales":null,"cExpressage":null},
			//"user":{"uNumber":null,"uId":null,"uName":"drbjrc","uGender":null,"uPassword":null,"uEmail":null,"uUserNumber":null,
			//"uBirthday":null,"uPassPus":null,"uMer":null},"rDel":"河南省郑州市管城回族区郑汴路与未来路交叉口绿都广场2504"}]}}
				$.each(result.extent.oneRecord,function(index,item){
					$("#dingdanhao").text("订单号 : "+item.rOrderId);
					$("#shangpinming").text("商品: "+item.commodity.cTypeA+" "+item.commodity.cTypeB+" "+item.commodity.cName);
					$("#shangpinjiage").text("价格: "+item.rMonery);
					$("#xiadan").text("下单时间: "+item.rDeliver);
					if(item.rReceiving==null){
						$("#shouhuo").text("收货时间: 未收货");
					}else{	
					$("#shouhuo").text("收货时间: "+item.rReceiving);
					}
					$("#zhuangtai").text("商品状态: "+item.status.sRState);
					$("#shouhuoren").text("买家信息: "+item.user.uName);
					$("#kdianhua").text("买家电话: " +item.rUNumber);
					$("#shouhuodizhi").text("收货地址: " +item.rDel);
					$("#sdianhua").text("商家电话: " +item.merchant.merUserNumber);
					
					
				
				
				});
			}
		});
	}
	return false;
})
</script>		
</head>
<body>

<!-- 查看该订单号的订单信息的模态框 -->
<div class="modal fade" id="recordGetModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">订单详情</h4>
      </div>
      <div class="modal-body">
        	<p id="dingdanhao"></p> 
        	<p id="shangpinming"></p>
        	<p id="shangpinjiage"></p>
        	<p id="xiadan"></p>
        	<p id="shouhuo"></p>
        	<p id="zhuangtai"></p>
        	<p id="shouhuoren"></p>
        	<p id="kdianhua"></p>
        	<p id="shouhuodizhi"></p>
        	<p id="sdianhua"></p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>

<br>
<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>我的订单</h1>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>订单号</th>
						<th>商品</th>
						<th>下单时间</th>
						<th>查看</th>
						
					</tr>
					<c:forEach items="${pageInfo.list }" var="reca">
						<tr>
							<th>${reca.rOrderId }</th>
							<th>${reca.commodity.cName }</th>
							<th>${reca.rDeliver }</th>
							
							<th>
								<button class="btn btn-primary record_get_model_btn btn-sm">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									查看
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
				<ul class="pagination">
					<li><a href="${APP_PATH }/records?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/records?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/records?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/records?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/records?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				</nav>
			</div>
		</div>
		
	</div>
	


</body>
</html>