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
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		//获取文本框输入
		var text = $("#search").val();
		if($.trim(text) != ""){
			$.ajax({
				url:"${APP_PATH}/getCommodityType",
				type:"GET",
				data:"cName="+text,
				success:function(result){
						var commodity = result.extent.commocities
						$.each(commodity,function(index,item){
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
	                		              .appendTo("#tb");
						});
					
					
				}
              
			});
			$(".cidd").hide();
		}else{
			alert("请输入宝贝关键字!");
		}
	});
});		
</script>
<!-- 
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		alert("123");
		$("#commodity_table").remove();
			alert("111");
			$.ajax({
				url:"${APP_PATH}/getCommodityType",
				type:"GET",
				data:"search="+name,
				success:function(result){
				  alert("222");
				  var search = $("#search").val();	
				  alert("333");
                  var name = $("#cNameTd").val();
                  $("#tb").empty();
                  if(search == name){
                	  alert("444");
                	  var commodity = result.extent.search
                	  var name = result.extent.search.cName
                	  $.each(commodity,function(index,item){
                		  alert("555");
                    		alert(item.cName);
                    		var cMidTd = $("<td></td>").addClass("midd").append(item.cMerchantId);
                    		var cNameTd = $("<td></td>").append(item.cName);
                    		var cTypeATd = $("<td></td>").append(item.cTypeA);
                    		var cTypeBTd = $("<td></td>").append(item.cTypeB);
                    		var cPriceTd = $("<td></td>").append(item.cPrice);
                    		var selectBtn =$("<button></button>").addClass("btn btn-primary btn-sm select_btn")
                		        .append("查看详情页");
                    		var cId = $("<td></td>").addClass("cidd").append(item.cId);
                    		$("<tr></tr>").append(cMidTd)
                    		              .append(cNameTd)
                    		              .append(cTypeATd)
                    		              .append(cTypeBTd)
                    		              .append(cPriceTd)
                    		              .append(selectBtn)
                    		              .append(cId)
                    		              .appendTo("#tb");
                    	}); 
                  }else{
                	  alert("请输入宝贝名");
                  }
                 
				}
			});
	});
});
		
</script>
 -->
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
					<input type="text" name="search" id="search" onfocus="if(this.value == this.defaultValue) this.value = ''"  onblur="if(this.value == '') this.value = this.defaultValue" value="请输入宝贝名关键字"/>
					<input type="button" name="btn" id="btn" value="搜索" />
					<img src="images/shousuo.jpg" >
				<div class="hots">
					<span>热门搜索：</span>
					<a href="">手机</a>
					<a href="">新款连衣裙</a>
					<a href="">空调</a>
					<a href="">懒人沙发</a>
					<a href="">手表</a>
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


<!-- 查看该订单号的订单信息的模态框 -->
<div class="modal fade" id="CommodityInfoModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">我的选择</h4>
      </div>
      <div class="modal-body">
        <a href="${APP_PATH }/merchant?cMerchantId=1"><p id="name1"></p></a>
		<p id="name2" ></p>
		<p id="typeA"></p>
		<p id="typeB"></p>
		<p id="price"></p>
		<p id="time"></p>
		<p id="sales"></p>
		<p id="expressage"></p>
		<br><br> 
		
		<button class="gouwu_btn">继续购物</button>
		<button class="edit_btn">加入购物车</button>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>

<!-- 导航 -->
<div class="navbox" id="test">
<div class="newdh">
	<div class="menu">
      <ul> 
		<li class="sete"><a href="${APP_PATH }/index.jsp">首页</a></li>
      </ul>
    </div>
    <div id="nav">
    	<div class="mod_cate_hd">全部商品分类</div>
    	<div class="col-md-3">
    	<ul class="tit">
    	    <li class="mod_cate mod_on">
            	<h2><i class="arrow_dot fr"></i><a href="https://search.jd.com/Search?keyword=%E7%94%B5%E8%84%91%E6%95%B0%E7%A0%81&enc=utf-8&wq=%E7%94%B5%E8%84%91%E6%95%B0%E7%A0%81&pvid=ac4cbec14e71443791e1593667864580">数码</a></h2>
                <p class="mod_cate_r"><a href="https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&wq=%E6%89%8B%E6%9C%BA&pvid=26a0d39cb898434cab17be5ac8eff62b">手机</a></p>
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
      <div class="col-xs-8">
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
		<!-- 显示表格数据 -->
		<table class="table table-hover" id="commodity_table">
		   <thead>
			 <tr>
				<th>宝贝名</th>
				<th>宝贝归类</th>
				<th>宝贝类型</th>
				<th>宝贝价格</th>
				<th>详情</th>			
			 </tr>			
		  </thead>
		  <tbody id="tb">
			
		  </tbody>		    
		</table>  		 
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
        //当不满足下面的条件的时候，轮播图到了最后一个图片，进入条件中后，瞬移到
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
    //点击进行搜索
    
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
   	    $("#commodity_table tbody").empty();
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
    		              .appendTo("#commodity_table tbody");
    	});
   	 	$(".cidd").hide();

   	 	$(".select_btn").click(function(){
    		var cid = $(this).next().text();
    		
    		//弹出模态框
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
    		    		$("#name1").addClass("name").text("店铺名: "+item.merchant.merName);
    		    		$("#mid").addClass("midd").text(item.cMerchantId);
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
    		$(".midd").hide();
    		$(".name").click(function(){
        		var mid = $(this).next().text();
    		});
    		
    		$(document).on("click",".edit_btn",function(){
    			var cid = $(this).attr("cid");
    			var name = $(this).parents("tr").find("td:eq(1)").text();
    			$.ajax({
    				url : "${APP_PATH}/commodity",
    				data : "id=" + cid,
    				type : "GET",
    				success : function(result) {

    				}
    			})
    				
    		})
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
    }
</script>
	
</body>
</html>