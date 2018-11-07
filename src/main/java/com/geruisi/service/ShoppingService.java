package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.Merchant;
import com.geruisi.dao.CommodityMapper;
import com.geruisi.dao.MerchantMapper;
import com.geruisi.until.ShoppingCart;

/**
 * 购物车业务层
 * @author Administrator
 *
 */
@Service
public class ShoppingService {

	@Autowired
	private CommodityMapper commodityMapper;
	
	@Autowired
	private MerchantMapper merchantMapper;
	
	public List<Commodity> getAll() {
		List<Commodity> example = commodityMapper.selectByExample(null);
		return example;
	}

	/**
	 * 向购物车中添加一件商品		
	 * @param shoops 
	 * @param book
	 */
	public boolean addCommodity(Integer id, Integer shoops, ShoppingCart sc) {
		Commodity commodity = commodityMapper.selectByPrimaryKey(id);
		
		if (commodity != null) {
			Merchant merchant = merchantMapper.selectByPrimaryKey(commodity.getcMerchantId());
			
			sc.addCommodity(commodity,merchant,shoops);
			return true;
		}
		
		return false;
	}


	
}
