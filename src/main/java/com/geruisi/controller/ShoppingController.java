package com.geruisi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.bean.Commodity;
import com.geruisi.service.ShoppingService;
import com.geruisi.until.CommodityStoreWebUtils;
import com.geruisi.until.ShoppingCart;

/**
 * 购物车逻辑
 * @author Administrator
 *
 */
@Controller
public class ShoppingController {
	
	@Autowired
	private ShoppingService shoppingService;
	
	/**
	 * 修改商品数量
	 * @param id
	 * @param quantity
	 * @return
	 */
	@RequestMapping("/updateShoop")
	@ResponseBody
	public Msg getupdateShoop(@RequestParam("id")Integer id,@RequestParam("quantity")int quantity,
			HttpServletRequest request, HttpServletResponse response){
		
		ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
		shoppingService.quantity(id,quantity,sc);
		return Msg.success();
	}
	
	/**
	 * 获取全部商品
	 * @return
	 */
	@RequestMapping("/commoditys")
	@ResponseBody
	public Msg getCommoditys(){
		List<Commodity> commodities = shoppingService.getAll();
		return Msg.success().add("commodities", commodities);
	}
	
	/**
	 * 将商品加入购物车
	 * @param id 商品id
	 * @param shoops 商品数量
	 * @param request
	 * @param response
	 * @return
	 
	@RequestMapping("/commodity")
	@ResponseBody
	public Msg getCommodity(@RequestParam("id")Integer id,@RequestParam("shoops")Integer shoops,
			HttpServletRequest request, HttpServletResponse response){
		
		if (id > 0 && shoops > 0) {
			//2. 获取购物车对象
			ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
			
			//3. 调用 BookService 的 addToCart() 方法把商品放到购物车中
			shoppingService.addCommodity(id,shoops	,sc);
			return Msg.success().add("shoop", "添加成功!");
		}
		
		return Msg.fail().add("shoop", "添加失败!");
	}*/
	
	@RequestMapping("/commodity")
	@ResponseBody
	public Msg getCommodity(@RequestParam("id")Integer id,
			HttpServletRequest request, HttpServletResponse response){
		int shoops = 2;
		if (id > 0 && shoops > 0) {
			//2. 获取购物车对象
			ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
			
			//3. 调用 BookService 的 addToCart() 方法把商品放到购物车中
			shoppingService.addCommodity(id,shoops	,sc);
			return Msg.success().add("shoop", "添加成功!");
		}
		
		return Msg.fail().add("shoop", "添加失败!");
	}
	
	/**
	 * 转想购物车页面
	 * @return
	 */
	@RequestMapping("/shooping")
	public String getShooping(){
		
		return "shopping";
	}
	
}
