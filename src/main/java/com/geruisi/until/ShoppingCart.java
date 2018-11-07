package com.geruisi.until;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.Merchant;

public class ShoppingCart {
	
	private Map<Integer, ShoppingCartItem> commoditys = new HashMap<>();
	
	private List<Integer> shoopId = new ArrayList<>();
	/**
	 * 修改指定购物项的数量
	 */
	public void updateItemQuantity(Integer id,int quantity){
		ShoppingCartItem sci = commoditys.get(id);
		if (sci != null) {
			sci.setQuantity(quantity);
		}
	}
	
	/**
	 * 移除指定的购物项
	 * @param id
	 */
	public void removeItem(Integer id){
		commoditys.remove(id);
	}
	
	/**
	 * 清空购物车
	 */
	public void clear(){
		commoditys.clear();
	}
	
	/**
	 * 返回购物车是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return commoditys.isEmpty();
	}
	
	/**
	 * 获取购物车中的所有的 ShoppingCartItem 组成的集合
	 * @return
	 */
	public Collection<ShoppingCartItem> getItems(){
		return commoditys.values();
	}
	
	private List<Integer> getShoop(){
		Collection<ShoppingCartItem> values = commoditys.values();
		for (ShoppingCartItem shoppingCartItem : values) {
			Integer id = shoppingCartItem.getMerchantId();
			for (Integer shopping : shoopId) {
				if (shopping != id) {
					shoopId.add(id);
				}
			}
		}
		return shoopId;
	}
	
	/**
	 * 返回购物车中商品的总数量
	 * @return
	 */
	public int getCommodityNumber(){
		int total = 0;
		
		for (ShoppingCartItem sci : commoditys.values()) {
			total += sci.getQuantity();
		}
		
		return total;
	}
	
	public Map<Integer, ShoppingCartItem> getCommoditys() {
		return commoditys;
	}
	
	/**
	 * 检验购物车中是否有 id 指定的商品		
	 * @param id
	 * @return
	 */
	public boolean hasCommodity(Integer id){
		return commoditys.containsKey(id);
	}
	
	/**
	 * 向购物车中添加一件商品		
	 * @param commodity
	 * @param shoops 
	 */
	public void addCommodity(Commodity commodity,Merchant merchant, Integer shoops){
		//1. 检查购物车中有没有该商品, 若有, 则使其数量 +1, 若没有, 
		//新创建其对应的 ShoppingCartItem, 并把其加入到 books 中
		ShoppingCartItem sci = commoditys.get(commodity.getcId());
		
		if(sci == null){
			sci = new ShoppingCartItem(commodity,merchant,shoops);
			commoditys.put(commodity.getcId(), sci);
		}else{
			sci.increment();
		}
	}
	
}
