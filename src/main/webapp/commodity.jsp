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
<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>我的宝贝</h1>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>店铺名</th>
						<th>宝贝名</th>
						<th>宝贝归类</th>
						<th>宝贝类型</th>
						<th>宝贝价格</th>
						<th>上架时间</th>
						<th>加入购物车</th>
						<th>继续购物</th>
					</tr>
					<c:forEach items="${pageInfo.list }" var="commodity">
						<tr>
							<th>${commodity.cMerchantId.merName }</th>
							<th>${commodity.cName }</th>
							<th>${commodity.cTypeA }</th>
							<th>${commodity.cTypeB }</th>
							<th>${commodity.cPrice }</th>
							<th>${commodity.cPutaway }</th>
							<th>
								<button class="btn btn-primary record_get_model_btn btn-sm">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									加入购物车
								</button>
							</th>
							<th>
								<button class="btn btn-primary record_get_model_btn btn-sm">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									继续购物
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
					<li><a href="${APP_PATH }/commodityes?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li>
						  <a href="${APP_PATH }/commodityes?pn=${pageInfo.pageNum-1}" aria-label="Previous"> 
							<span aria-hidden="true">&laquo;</span>
						  </a>
						</li>
					</c:if>
					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/commodityes?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/commodityes?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/commodityes?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				</nav>
			</div>
		</div>
		
	</div>
	

   
</body>
</html>