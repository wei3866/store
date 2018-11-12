package com.geruisi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.bean.Commodity;
import com.geruisi.service.ShoppingService;
import com.geruisi.until.CommodityStoreWebUtils;
import com.geruisi.until.EncodingTool;
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
	 * 结算
	 * @return
	 */
	@RequestMapping("/allStive")
	@ResponseBody
	public Msg getallStive(@RequestParam("name")String names,@RequestParam("number")String number,
			@RequestParam("str")String str,@RequestParam("ids")String idString,
			@RequestParam("moneys")String strmoneys,HttpServletRequest request, HttpServletResponse response){
		String strs = EncodingTool.encodeStr(str);
		String name = EncodingTool.encodeStr(names);
		if (idString.contains(",")) {
			List<Integer> ids = new ArrayList<>();
			String[] strids = idString.split(",");
			for (String id : strids) {
				ids.add(Integer.parseInt(id));
			}
			int moneys = Integer.parseInt(strmoneys);
			
			ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
			boolean b = shoppingService.allStives(sc,name,number,strs,ids,moneys,request);
			
			if (b == false) {
				return Msg.fail().add("fail", "余额不足,请充值!");
			}
		}else {
			int id = Integer.parseInt(idString);
			int moneys = Integer.parseInt(strmoneys);
			ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
			boolean b = shoppingService.allStive(sc,name,number,strs,id,moneys,request);
			
			if (b == false) {
				return Msg.fail().add("fail", "余额不足,请充值!");
			}
		}
		
		return Msg.success();
	}
	
	
	/**
	 * 验证是否登录
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/loginUser")
	@ResponseBody
	public Msg getlogin(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		Object attribute = session.getAttribute("userLogin");
		if (attribute == null) {
			return Msg.fail().add("login", "您还未登录,请先登录!");
		}else {
			return Msg.success();
		}
	}
	
	/**
	 * 转向登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String getlogin(){
		return "login";
	}
	
	/**
	 * 删除商品
	 * @param idString
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/deleteShoops")
	@ResponseBody
	public Msg getdeleteShoops(@RequestParam("ids")String idString,
			HttpServletRequest request, HttpServletResponse response){
		
		if (idString.contains(",")) {
			List<Integer> ids = new ArrayList<>();
			String[] str = idString.split(",");
			for (String id : str) {
				ids.add(Integer.parseInt(id));
			}
			
			ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
			shoppingService.deleteShoops(ids,sc);
		}else {
			int id = Integer.parseInt(idString);
			ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
			shoppingService.deleteShoop(id,sc);
		}
		
		return Msg.success().add("deleteShoops", "已删除商品");
	}
	
	
	/**
	 * 商品-1
	 * @param id
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/minusShoop")
	@ResponseBody
	public Msg getminusShoop(@RequestParam("id")Integer id,
			HttpServletRequest request, HttpServletResponse response){
		ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
		shoppingService.minusShoop(id,sc);
		
		return null;
	}
	
	
	/**
	 * 商品+1
	 * @param id
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/plusShoop")
	@ResponseBody
	public Msg getPlusShoop(@RequestParam("id")Integer id,
			HttpServletRequest request, HttpServletResponse response){
		ShoppingCart sc = CommodityStoreWebUtils.getShoppingCart(request);
		shoppingService.plusShoop(id,sc);
		
		return Msg.success();
	}
	
	
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
	@RequestMapping("/commod")
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
