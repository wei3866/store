package com.geruisi.until;

import org.springframework.beans.factory.annotation.Autowired;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.Merchant;

/**
 * 封装了购物车中的商品, 包含对商品的引用以及购物车中该商品的数量
 */
public class ShoppingCartItem {
	
	//商品的引用
	@Autowired
	private Commodity commodity;
	//该商品的数量
	private int quantity;

	public ShoppingCartItem(Commodity commodity,Integer shoops) {
		super();
		this.commodity = commodity;
		this.quantity = shoops;
	}

	public Commodity getCommodity() {
		return commodity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * 使商品数量 + 1
	 */
	public void increment(){
		quantity++;
	}
	
}
