package com.geruisi.controller;

import java.util.List;

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
	 * 根据条件查找所有商品并分页
	 * @param cName
	 * @return
	 */
	@RequestMapping("/commodityes")
	@ResponseBody
	public Msg getCommodityJson(@RequestParam(value="pn",defaultValue="1")Integer pn){
		//引入PageHelper分页插件
		//在查询之前只需要调用,传入页码,以及每页大小
		PageHelper.startPage(pn, 5);
		//startPage后面紧跟的这个查询就是一个分页查询
		List<Commodity> commodities = commodityService.getCommodityByName();
		
		//使用pageInfo包装查询后的结果,只需将pageInfo交给页面
		//封装了相详细的分页信息,包括查询出的数据,传入连续显示的页数
		PageInfo page = new PageInfo(commodities,5);
		return Msg.success().add("pageInfo", page);
	}
}
