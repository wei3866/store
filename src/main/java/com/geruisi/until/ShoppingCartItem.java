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
	//商品的店铺
	private Merchant merchant;
	//购物车中的店铺
	private Integer merchantId;

	public ShoppingCartItem(Commodity commodity,Merchant merchant, Integer shoops) {
		super();
		this.commodity = commodity;
		this.quantity = shoops;
		this.merchant = merchant;
		this.merchantId = commodity.getcMerchantId();
	}

	
	
	public Integer getMerchantId() {
		return merchantId;
	}



	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}



	public Merchant getMerchant() {
		return merchant;
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
