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

<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<!-- 搭建显示页面 ,用柵格系統 -->
<div class="container">
     <!-- 标题 -->
     <div class="row">
       <div class="col-md-12">
         <h1>商城</h1>
       </div>
     </div>
     <div class="main">
		<div class="col-md-4 col-md-offset-8">
		<div class="right" id="curentuser">
			请 <a href="" onclick="">登录 </a>&nbsp;&nbsp;
			  <a href="">免费注册</a>&nbsp;&nbsp;
			  <a href="" onclick="">我的订单</a>
         </div>
         </div>
	  </div>
	<div class="header">
		<div class="main">
			<div class="logo">
			<!-- LOGO图片 -->
				  <a href=""><img src="" /></a>
			</div>
			<!-- search搜索 -->
			<div class="col-md-4 col-md-offset-4">
			<div class="search">
				<div class="cnt">
					<input name="" type="text" class="sh" onfocus="if(this.value == this.defaultValue) this.value = ''"  onblur="if(this.value == '') this.value = this.defaultValue" value="请输入搜索关键字" id="keyword" />
					<input name="" type="button" class="ss" value="" onclick="" />
				</div>
				<div class="hots">
					<span>热门搜索：</span>
					<a href="">手机</a>
					<a href="">新款连衣裙</a>
					<a href="">空调</a>
					<a href="">懒人沙发</a>
					<a href="">手表</a>
				</div>
			</div>
			</div>
			<div class="shopcart" id="scroll-cart">
				<div class="shopcart-a">  
				<a href="" class="members">会员中心</a>
					<a class="gw" href="" id="div_pro" onclick="">
						<span class="a"><img src="" width="29" height="26" /></span>
						<span class="b" id="tosettle">我的购物车</span>
						<span class="sj"><img src="" width="11" height="8" /></span>
					</a>  
				</div> 
			</div>
		</div>
</div>
<!-- 导航 -->
<div class="navbox" id="test">
<div class="newdh">
	<div class="menu">
      <ul> 
		<li class="sete"><a href="">首页</a></li>
      </ul>
    </div>
    <div id="nav">
    	<div class="mod_cate_hd">全部商品分类</div>
    	<ul class="tit">
    	    <li class="mod_cate mod_on">
            	<h2><i class="arrow_dot fr"></i><a href="">数码</a></h2>
                <p class="mod_cate_r"><a href="">手机</a></p>
                <p class="mod_cate_r"><a href="">电脑</a></p>
                <p class="mod_cate_r"><a href="">平板</a></p>
              </li>
    	    <li class="mod_cate mod_on">
            	<h2><i class="arrow_dot fr"></i><a href="">服装</a></h2>
                <p class="mod_cate_r"><a href="">女装</a></p>
                <p class="mod_cate_r"><a href="">男士</a></p>
                <p class="mod_cate_r"><a href="">童装</a></p>
              </li>
    	    <li class="mod_cate mod_on">
            	<h2><i class="arrow_dot fr"></i><a href="">家电</a></h2>
                <p class="mod_cate_r"><a href="">空调</a></p>
                <p class="mod_cate_r"><a href="">洗衣机</a></p>
                <p class="mod_cate_r"><a href="">电冰箱</a></p>
              </li>
    	    <li class="mod_cate mod_on">
            	<h2><i class="arrow_dot fr"></i><a href="">家居</a></h2>
                <p class="mod_cate_r"><a href="">沙发</a></p>
                <p class="mod_cate_r"><a href="">桌子</a></p>
                <p class="mod_cate_r"><a href="">衣柜</a></p>
              </li>
    	    <li class="mod_cate mod_on">
            	<h2><i class="arrow_dot fr"></i><a href="">母婴</a></h2>
                <p class="mod_cate_r"><a href="">奶粉</a></p>
                <p class="mod_cate_r"><a href="">尿不湿</a></p>
             </li>
        </ul>
    </div> 
</div>
</div>
<table cellpadding="10">
  <c:forEach items="${CommodityPage.list }" var="Commodity">
	<tr>
	 <td>
	   <a href="">${Commodity.name }</a>
	   <br>${Commodity.type_a }
	   <br>${Commodity.type_b }
	 </td>
	 <td>${Commodity.price }</td>
	 <td><a href=" ">加入购物车</a></td>
	</tr>
  </c:forEach>
</table>


<div class="row">
<div class="col-xs-6 col-sm-3">
  <ul class="ul-c">
	<div class="title"><strong class="z14">购物指南</strong></div>
	<li><a href="" target="_blank" class="">免费注册</a></li>
  </ul>
</div>
<div class="col-xs-6 col-sm-3"> 
  <ul class="ul-c">
	<div class="title"><strong class="z14">支付方式</strong></div>
	<li><a href="" target="_blank" class="">微信支付</a></li>
	<li><a href="" target="_blank" class="">支付宝支付</a></li>
	<li><a href="" target="_blank" class="">银行卡支付</a></li>
  </ul>
</div>
<div class="col-xs-6 col-sm-3">  
  <ul class="ul-c">
	<div class="title"><strong>招商合作</strong></div>
	<li><a href="" target="_blank" class="">运营商门户</a></li>
	<li><a href="" target="_blank" class="">关于我们</a></li>
  </ul>
</div>
<div class="col-xs-6 col-sm-3">
  <ul class="ul-c">
	<div class="title"><strong class="z14">联系我们</strong></div>
	<li><a href="" target="_blank" class="">拨打电话</a></li>
	<li><a href="" target="_blank" class="">百度地图</a></li>
  </ul>
</div>
</div>
 				
</div>

</head>
<body>
<script type="text/javascript">
//1.页面加载完成后,直接去发送ajax请求,要到分页数据
$(function(){
	$.ajax({
		url:"${APP_PATH}/commodities",
		type:"GET",
		success:function(result){
			//1.解析并显示商品数据
 			build_commodities_table(result);
 			//2.解析并显示分页信息
 			build_page_info(result);
 			//3.解析显示分页条数据
 			build_page_nav(result);
		}
	});
});
//显示商品数据
function build_commodities_table(result){
	
}

//显示分页信息
function build_page_info(result){
	 $("#page_info_area").empty();
	 $("#page_info_area").append("当前第"+ result.extend.pageInfo.pageNum +"页,总"+ 
			 result.extend.pageInfo.pages +"页,总"+ result.extend.pageInfo.total +"条记录");
	 totalRecord=result.extend.pageInfo.total;
	 currentPage=result.extend.pageInfo.pageNum;
}
//导航条解析显示分页条,点击分页要能去下一页...
function build_page_nav(result){
	 $("#page_nav_area").empty();
	 //page_nav_area
	 var ul = $("<ul></ul>").addClass("pagination");
	 
	 //构建元素
	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
    var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
	if(result.extend.PageInfo.hasPreviousPage == false){
		 firstPageLi.addClass("disabled");
		 prePageLi.addClass("disabled");
	 }else{
		//为元素添加翻页事件
   	 firstPageLi.click(function(){
   		 to_page(1);
   	 });
   	 prePageLi.click(function(){
   		 to_page(result.extend.PageInfo.pageNum - 1);
   	 });
	 }
	 
    var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	 var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
	 if(result.extend.PageInfo.hasNextPage == false){
		 nextPageLi.addClass("disabled");
		 lastPageLi.addClass("disabled");
	 }else{
		 nextPageLi.click(function(){
   		 to_page(result.extend.pageInfo.pageNum + 1);
   	 });
   	 lastPageLi.click(function(){
   		 to_page(result.extend.pageInfo.pages);
   	 });
	 }
	
	 //添加首页和前一页的提示
	 ul.append(firstPageLi).append(prePageLi);
	 //1,2,3遍历给ul中添加页码提示
	 $.each(result.extend.pageInfo.navigatepageNums,function(index,item){
		 var numLi = $("<li></li>").append($("<a></a>").append(item));
		 if(result.extend.pageInfo.pageNum == item){
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