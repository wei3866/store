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
<style type="text/css">
        *{ padding:0; margin:0; list-style:none; border:0;}
        .all{
            width:600px;
            height:300px;
            padding:6px;
            border:1px solid #ccc;
            margin:100px auto;
            position:relative;
        }
        .screen{
            width:600px;
            height:300px;
            overflow:hidden;
            position:relative;
        }
        .screen li{ width:600px; height:300px; overflow:hidden; float:left;}
        .screen ul{ position:absolute; left:0; top:0px; width:3000px;}
        .all ol{ position:absolute; right:10px; bottom:10px; line-height:20px; 
          text-align:center;}
        .all ol li{ float:left; width:20px; height:20px; background:#fff; 
          border:1px solid #ccc; margin-left:10px; cursor:pointer;}
        .all ol li.current{ background:yellow;}
 
        #arr {display: none;}
        #arr span{ width:40px; height:40px; position:absolute; 
         left:5px; top:50%; margin-top:-20px; background:#000; 
         cursor:pointer; line-height:40px; text-align:center; 
         font-weight:bold; font-family:'黑体'; font-size:30px; 
         color:#fff; opacity:0.3; border:1px solid #fff;}
        #arr #right{right:5px; left:auto;}
    </style>

<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>
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
			  <a href="" onclick="">我的订单</a>&nbsp;&nbsp;
			  <a href="" onclick="">卖家中心</a>&nbsp;&nbsp;
			  <a href="">退出</a>
         </div>
         </div>
	  </div>
	<div class="header">
		<div class="main">
			<div class="logo">
			<!-- LOGO图片 -->
				<a href=""><img src="images/logo1.jpg" width="100" height="50"/></a>
			</div>
			<!-- search搜索 -->
			<div class="col-md-4 col-md-offset-4">
		    <div class="search">
				<div class="cnt">
					<input name="" type="text" class="sh" onfocus="if(this.value == this.defaultValue) this.value = ''"  onblur="if(this.value == '') this.value = this.defaultValue" value="请输入搜索关键字" id="keyword" />
					<input name="" type="button" class="ss" value="搜索"  />
					<img alt="" src="images/shousuo.jpg" >
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
				<span class="a"><img src="images/huiyuan.jpg" width="25" height="25" /></span>
				<a href="" class="members">会员中心</a>
					<a class="gw" href="" id="div_pro" onclick="">
						<span class="sj"><img src="images/gowuche.jpg" width="25" height="25" /></span>
						<span class="b" id="tosettle">我的购物车</span>
						
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
    	<div class="col-md-3">
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
      <div class="col-xs-6">
		<div class="all" id='all'>
		    <div class="screen" id="screen">
		        <ul id="ul">
		            <li><img src="images/1.jpg" width="600" height="300" /></li>
		            <li><img src="images/2.jpg" width="600" height="300" /></li>
		            <li><img src="images/3.jpg" width="600" height="300" /></li>
		            <li><img src="images/4.jpg" width="600" height="300" /></li>
		            <li><img src="images/5.jpg" width="600" height="300" /></li>
		        </ul>
		        <ol>
		 
		        </ol>
		        <div id="arr">
		            <span id="left"><</span>
		            <span id="right">></span>
		        </div>
		    </div>
		</div>
		<table class="table">
		  <tr>
		    <td><a href="${APP_PATH }/commodity.jsp">小米6</a><br>归类:数码&nbsp;&nbsp;类型:手机</td>
		    <td>3000</td>
		    <td><a href="${APP_PATH }/commodity.jsp">华为p20</a><br>归类:数码&nbsp;&nbsp;类型:手机</td>
			<td>3500</td>
		  </tr>
		  <tr>
			 <td><a href="${APP_PATH }/commodity.jsp">夹克</a><br>归类:服装&nbsp;&nbsp;类型:上衣</td>
			 <td>100</td>
			 <td><a href="${APP_PATH }/commodity.jsp">安踏</a><br>归类:服装&nbsp;&nbsp;类型:鞋子</td>
			 <td>100</td>
		  </tr>
		  <tr>
			 <td><a href="${APP_PATH }/commodity.jsp">牛仔裤</a><br>归类:服装&nbsp;&nbsp;类型:裤子</td>
			 <td>200</td>
			 <td><a href="${APP_PATH }/commodity.jsp">联想</a><br>归类:数码&nbsp;&nbsp;类型:电脑</td>
			 <td>5000</td>
		  </tr>
		</table>
   </div>
	   <!-- 显示分页信息 -->
	   <div class="row">
	     <!-- 分页文字信息 -->
	     <div class="col-md-6" id="page_info_area"></div>
	     <!-- 分页条信息 -->
	     <div class="col-md-6" id="page_nav_area"></div>
	   </div>
</div>

</div>

</div>
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
 	


<script type="text/javascript">
window.onload = function () {
    //需求：无缝滚动。
    //思路：赋值第一张图片放到ul的最后，然后当图片切换到第五张的时候
    //     直接切换第六章，再次从第一张切换到第二张的时候先瞬间切换到
    //     第一张图片，然后滑动到第二张
    //步骤：
    //1.获取事件源及相关元素。（老三步）
    //2.复制第一张图片所在的li,添加到ul的最后面。
    //3.给ol中添加li，ul中的个数-1个，并点亮第一个按钮。
    //4.鼠标放到ol的li上切换图片
    //5.添加定时器
    //6.左右切换图片（鼠标放上去隐藏，移开显示）
    var screen = document.getElementById("screen");
    var ul = screen.children[0];
    var ol = screen.children[1];
    var div = screen.children[2];
    var imgWidth = screen.offsetWidth;

    //2
    var tempLi = ul.children[0].cloneNode(true);
    ul.appendChild(tempLi);
    //3
    for(var i = 0; i < ul.children.length - 1; i++) {
        var newOlLi = document.createElement("li");
        newOlLi.innerHTML = i + 1;
        ol.appendChild(newOlLi);
    }
    var olLiArr = ol.children;
    olLiArr[0].className = "current";
    //4
    for(var i = 0, len = olLiArr.length; i < len; i++) {
        olLiArr[i].index = i;
        olLiArr[i].onmouseover = function (ev) {
            for(var j = 0; j < len; j++) {
                olLiArr[j].className = "";
            }
            this.className = "current";
            key = square = this.index;
            animate(ul, -this.index * imgWidth);
        }
    }
    //5
    var key = 0;
    var square = 0;
    var timer = setInterval(autoPlay, 2000);
    screen.onmouseover = function (ev) {
        clearInterval(timer);
        div.style.display = "block";
    }
    screen.onmouseout = function (ev) {
        timer = setInterval(autoPlay, 2000);
        div.style.display = "none";
    }
    //6
    var divArr = div.children;
    divArr[0].onclick = function (ev) {
        key--;
        if(key < 0) {
            ul.style.left = -(ul.children.length-1) * imgWidth + "px";
            key = 4;
        }
        animate(ul, -key * imgWidth);
        square--;
        if(square < 0) {
            square = 4;
        }
        for(var k = 0; k < len; k++) {
            olLiArr[k].className = "";
        }
        olLiArr[square].className = "current";
    }
    divArr[1].onclick = autoPlay;
    function autoPlay() {
        key++;
        //当不满足下面的条件是时候，轮播图到了最后一个孩子，进入条件中后，瞬移到
        //第一张，继续滚动。
        if(key > ul.children.length - 1) {
            ul.style.left = 0;
            key = 1;
        }
        animate(ul, -key * imgWidth);
        square++;
        if(square > 4) {
            square = 0;
        }
        for(var k = 0; k < len; k++) {
            olLiArr[k].className = "";
        }
        olLiArr[square].className = "current";
    }
    function animate(ele,target){
            clearInterval(ele.timer);
            var speed = target>ele.offsetLeft?10:-10;
            ele.timer = setInterval(function () {
                var val = target - ele.offsetLeft;
                ele.style.left = ele.offsetLeft + speed + "px";
                if(Math.abs(val)<Math.abs(speed)){
                    ele.style.left = target + "px";
                    clearInterval(ele.timer);
                }
            },10)  
    }

}



var totalRecord, currentPage;
//1.页面加载完成后,直接去发送ajax请求,要到分页数据
$(function(){
	$(".ss").click(function(){
		//去首页
		search()
	 
	})
		


function to_page(pn){
	
	
	$.ajax({
		url:"${APP_PATH}/commodityes",
		data:"pn="+pn,
		type:"GET",
		success:function(result){
			search();
			//1.解析并显示商品数据
 			build_commodity_table(result);
 			//2.解析并显示分页信息
 			build_page_info(result);
 			//3.解析显示分页条数据
 			build_page_nav(result);
		}
	});
 }
		
		//搜索
		function search(){
			
		$.ajax({
			url:"${APP_PATH}/commodityes",
		    type: "GET",
		    success: function(result){
		    	
		    	$.each(result.extent.pageInfo,function(index,item){
		    		var cName = $("<td></td>").append(item.cName);
		    		var cTypeA = $("<td></td>").append(item.cTypeA);
		    		var cTypeB = $("<td></td>").append(item.cTypeB);
		    		var cPrice = $("<td></td>").append(item.cPrice);
		    		$("<tr></tr>").append(cName)
		    		              .append(cTypeA)
		    		              .append(cTypeB)
		    		              .append(cPrice)
		    		              .appendTo("#table");
		    		
		    	});
		    }
		});
		
		}

//显示商品数据
function build_commodity_table(){
	var commdity = result.extend.pageInfo.list;
	$.search(commdity,function(index,item){
		//alert(item,cName)
		var cName = $("<td></td>").append(item.cName);
		var cTypeA = $("<td></td>").append(item.cTypeA);
		var cTypeB = $("<td></td>").append(item.cTypeB);
		var cPrice = $("<td></td>").append(item.cPrice);
		$("<tr></tr>").append(cName)
		              .append(cTypeA)
		              .append(cTypeB)
		              .append(cPrice)
		              .appendTo("#table");
		
	});
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
	if(result.extend.pageInfo.hasPreviousPage == false){
		 firstPageLi.addClass("disabled");
		 prePageLi.addClass("disabled");
	 }else{
		//为元素添加翻页事件
   	 firstPageLi.click(function(){
   		 to_page(1);
   	 });
   	 prePageLi.click(function(){
   		 to_page(result.extend.pageInfo.pageNum - 1);
   	 });
	 }
	 
    var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	 var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
	 if(result.extend.pageInfo.hasNextPage == false){
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
});
</script>
	
</body>
</html>