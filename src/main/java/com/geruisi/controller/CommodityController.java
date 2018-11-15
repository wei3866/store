package com.geruisi.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.bean.Commodity;
import com.geruisi.service.CommodityService;
import com.geruisi.until.EncodingTool;

@Controller
public class CommodityController {
	
	@Autowired
	CommodityService commodityService;

	@RequestMapping("/commodityUser")
	@ResponseBody
	public Msg getCommodityUser(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		Object attribute = session.getAttribute("userLogin");
		if (attribute == null) {
			return Msg.fail().add("login", "您还未登录,请先登录!");
		}else {
			return Msg.success();
		}
	}
	
	
	/**
	 * 模糊查询
	 * @param soText
	 * @return
	 */
	@RequestMapping("/commodityName")
	@ResponseBody
	public Msg getCommodityName(@RequestParam("soText")String soText){
		String strs = EncodingTool.encodeStr(soText);
		List<Commodity> commodities = commodityService.getCommodityName(strs);
		return Msg.success().add("commodities", commodities);
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
	
	/**
	 * 查询商品详细信息,用于宝贝详情页
	 * @param integer
	 * @return
	 */
	@RequestMapping("/commodityInfo")
	public String getCommodityInfo(@RequestParam("id")Integer integer,Map<String, Object> map){
		Commodity commodity = commodityService.getCommodityInfo(integer);
		map.put("commodity", commodity);
		return "commodity";
	}
}