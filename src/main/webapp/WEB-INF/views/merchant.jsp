<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家店铺</title>
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
<div class="container">
     <!-- 标题 -->
     <div class="row">
       <div class="col-md-12">
         <h1>商家店铺</h1>
       </div>
     </div>
		<div class="col-xs-8 col-md-12">
			请 <a href="" onclick="">登录 </a>&nbsp;&nbsp;
			  <a href="">免费注册</a>&nbsp;&nbsp;
			  <a href="" onclick="">我的订单</a>&nbsp;&nbsp;
			  <a href="" onclick="">卖家中心</a>&nbsp;&nbsp;
			  <a href="" onclick="">联系客服</a>&nbsp;&nbsp;
			  <a href="">退出登录</a>&nbsp;&nbsp;
              <a href="${APP_PATH }/index.jsp">返回首页</a>			  
         </div>
	  <!-- 显示表格数据 -->
	  <div class="col-md-12">
		<table class="table table-hover" id="merchant_table">
		   <thead>
			 <tr>
				<th>宝贝名</th>
				<th>宝贝归类</th>
				<th>宝贝类型</th>
				<th>宝贝价格</th>
				<th>详情</th>			
			 </tr>			
		  </thead>
		  <tbody>
			
		  </tbody>	
		</table> 
	  </div>
	   <!-- 显示分页信息 -->
	   <div class="row">
	     <!-- 分页文字信息 -->
	     <div class="col-md-6" id="page_info_area"></div>
	     <!-- 分页条信息 -->
	     <div class="col-md-6" id="page_nav_area"></div>
	   </div>
	   <!-- 查看该订单号的订单信息的模态框 -->
<div class="modal fade" id="CommodityInfoModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">我的选择</h4>
      </div>
      <div class="modal-body">
        <p id="name1"></p>
		<p id="name2"></p>
		<p id="typeA"></p>
		<p id="typeB"></p>
		<p id="price"></p>
		<p id="time"></p>
		<p id="sales"></p>
		<p id="expressage"></p>
		<br><br> 
		
		<a href="">继续购物</a>
		<a href="">加入购物车</a>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">退出</button>
      </div>
    </div>
  </div>
</div>
	   
	   
 </div>
<script type="text/javascript">
var totalRecord, currentPage;
//1.页面加载完成后,直接去发送ajax请求,要到分页数据
$(function(){
	 //去首页
	 to_page(1);
});
function to_page(pn){
	$.ajax({
  		url:"${APP_PATH }/commodityes",
  		type:"GET",
  		data:"pn=1",
  		success:function(result){
  			console.log(result);
  			//1.解析并显示商品数据
   			build_commodity_table(result);
   			//2.解析并显示分页信息
   			build_page_info(result);
   			//3.解析显示分页条数据
   			build_page_nav(result);
  		}
  	});
}  
//显示商品数据
function build_commodity_table(result){
	 //清空table表格
	    $("#merchant_table tbody").empty();
	 //商品所有信息
	var commdity = result.extent.pageInfo.list;
	$.each(commdity,function(index,item){
		//alert(item.cName);
		var cNameTd = $("<td></td>").append(item.cName);
		var cTypeATd = $("<td></td>").append(item.cTypeA);
		var cTypeBTd = $("<td></td>").append(item.cTypeB);
		var cPriceTd = $("<td></td>").append(item.cPrice);
		var selectBtn =$("<button></button>").addClass("btn btn-primary btn-sm select_btn")
	        .append("查看详情页");
		var cId = $("<td></td>").addClass("cidd").append(item.cId);
		$("<tr></tr>").append(cNameTd)
		              .append(cTypeATd)
		              .append(cTypeBTd)
		              .append(cPriceTd)
		              .append(selectBtn)
		              .append(cId)
		              .appendTo("#merchant_table tbody");
	});
	 	$(".cidd").hide();
	 	
	$(".select_btn").click(function(){
		var cid = $(this).next().text();
		
		$("#CommodityInfoModel").modal({
			backdrop:"static"
		});
		
		$.ajax({
			url:"${APP_PATH }/getcommodityInfo",
			type:"GET",
			data:"id="+cid,
			success:function(result){
				var commodity = result.extent.commodityInfo;
				$.each(commodity,function(index,item){
		    		$("#name1").text("店铺名: "+item.merchant.merName);
		    		$("#name2").text("宝贝名: "+item.cName);
		    		$("#typeA").text("宝贝归类: "+item.cTypeA);
		    		$("#typeB").text("宝贝类型: "+item.cTypeB);
		    		$("#price").text("宝贝价格: "+item.cPrice);
		    		$("#time").text("上架时间: "+item.cPutaway);
		    		$("#sales").text("销量: "+item.cSales);
		    		$("#expressage").text("是否包邮: "+item.cExpressage);
		    	});
			}
		});
	});

}
//显示分页信息
function build_page_info(result){
	 $("#page_info_area").empty();
	 $("#page_info_area").append("当前第"+ result.extent.pageInfo.pageNum +"页,总"+ 
			 result.extent.pageInfo.pages +"页,总"+ result.extent.pageInfo.total +"条记录");
	 totalRecord=result.extent.pageInfo.total;
	 currentPage=result.extent.pageInfo.pageNum;
}
//导航条解析显示分页条,点击分页要能去下一页...
function build_page_nav(result){
	 $("#page_nav_area").empty();
	 var ul = $("<ul></ul>").addClass("pagination");
	 
	 //构建元素
	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
    var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
	if(result.extent.pageInfo.hasPreviousPage == false){
		 firstPageLi.addClass("disabled");
		 prePageLi.addClass("disabled");
	 }else{
		//为元素添加翻页事件
   	 firstPageLi.click(function(){
   		 to_page(1);
   	 });
   	 prePageLi.click(function(){
   		 to_page(result.extent.pageInfo.pageNum - 1);
   	 });
	 }
	 
    var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
	 if(result.extent.pageInfo.hasNextPage == false){
		 nextPageLi.addClass("disabled");
		 lastPageLi.addClass("disabled");
	 }else{
		 nextPageLi.click(function(){
   		 to_page(result.extent.pageInfo.pageNum + 1);
   	 });
   	 lastPageLi.click(function(){
   		 to_page(result.extent.pageInfo.pages);
   	 });
	 }
	
	 //添加首页和前一页的提示
	 ul.append(firstPageLi).append(prePageLi);
	 //1,2,3遍历给ul中添加页码提示
	 $.each(result.extent.pageInfo.navigatepageNums,function(index,item){
		 var numLi = $("<li></li>").append($("<a></a>").append(item));
		 if(result.extent.pageInfo.pageNum == item){
			 //激活,使用
			 numLi.addClass("active");
		 }
		 numLi.click(function(){
			 to_page(item);
		 });
		 ul.append(numLi);
	 });
	 //添加下一页和末页的提示
	 ul.append(nextPageLi).append(lastPageLi);
	 //把ul加入到nav
	 var navEle = $("<nav></nav>").append(ul);
	 navEle.appendTo("#page_nav_area");
  }

</script> 

</body>
</html>