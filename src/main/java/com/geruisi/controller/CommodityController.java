package com.geruisi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.geruisi.service.CommodityService;

@Controller
public class CommodityController {
	
	@Autowired
	CommodityService commodityService;

//	/**
//	 * 导入Jason包
//	 * 查询所有商品
//	 */
//	@RequestMapping("/commodity")
//	@ResponseBody
//	public Msg getAllCommodityJason(@RequestParam(value="pn",defaultValue="1")Integer pn){
//		//引入PageHelper分页插件
//		//在查询之前只需要调用,传入页码,以及每页大小
//		PageHelper.startPage(pn, 5);
//		//startPage后面紧跟的这个查询就是一个分页查询
//		List<Commodity> commodity = commodityService.getAll();
//		//使用pageInfo包装查询后的结果,只需将pageInfo交给页面
//		//封装了相详细的分页信息,包括查询出的数据,传入连续显示的页数
//		PageInfo page = new PageInfo(commodity,5);
//		return Msg.success().add("pageInfo", page);
//	}
}
