package com.geruisi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.bean.Commodity;
import com.geruisi.service.CommodityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class CommodityController {
	
	@Autowired
	CommodityService commodityService;

	/**
	 *  根据商品名搜索商品
	 * @param 
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/getCommodityType")
	@ResponseBody
	public Msg getCommodityType(@RequestParam("cName")String cName){
		List<Commodity> commodities = commodityService.getCommodityType(cName);
		return Msg.success().add("commocities", commodities);
		//return "getCommodityType";
	}
	
//	@RequestMapping("/index2")
//	public String getCommodityType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		String cName = request.getParameter("cName");
//		String cTypeA = request.getParameter("cTypeA");
//		String cTypeB = request.getParameter("cTypeB");
//		
//		CriteriaCommodity cc = new CriteriaCommodity(cName, cTypeA, cTypeB);
//		
//		List<Commodity> commodities = commodityService.getCommodityType(cc);		
//		
//		//1.把commodities 集合放入request中
//		request.setAttribute("commodities", commodities);
//		//2.转发页面到index.jsp(不能使用重定向)
//		//request.getRequestDispatcher("/index2").forward(request, response);
//		return "index2";		
//	}
	
	/**
	 * 查找商品
	 * @param pn
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/commodityes")
	public Msg getCommodityJson(@RequestParam(value="pn",defaultValue="1")Integer pn){
		//引入PageHelper分页插件
		//在查询之前只需要调用,传入页码,以及每页大小
		PageHelper.startPage(pn, 3);
		//startPage后面紧跟的这个查询就是一个分页查询
		List<Commodity> commodities = commodityService.getCommodityAll();
		
		//使用pageInfo包装查询后的结果,只需将pageInfo交给页面
		//封装了详细的分页信息,包括查询出的数据,传入连续显示的页数
		PageInfo page = new PageInfo(commodities,2);
		return Msg.success().add("pageInfo", page);
	}
	
	/**
	 * 显示店铺商品
	 * @param pn
	 * @return
	 */
	@RequestMapping("/merchant")
	public String getCmerchant(@RequestParam("cMerchantId")Integer cMerchantId){
		commodityService.getCmerchant(cMerchantId);
		return "merchant";
	}
	
//	@ResponseBody
//	@RequestMapping("/merchant")
//	public Msg getCmerchant(@RequestParam(value="pn",defaultValue="1")Integer pn,
//			@RequestParam("id")Integer integer){
//		PageHelper.startPage(pn, 6);
//		List<Commodity> commodities = commodityService.getCmerchant(integer);
//		
//		PageInfo page = new PageInfo(commodities,5);
//		return Msg.success().add("pageInfo", page);
//	}
	
	/**
	 * 查询商品详细信息,用于宝贝详情页
	 * @param integer
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getcommodityInfo")
	public Msg getCommodityInfo(@RequestParam("id")Integer integer){
		List<Commodity> commodity = commodityService.getCommodityInfo(integer);
		return Msg.success().add("commodityInfo", commodity);
	}
}
