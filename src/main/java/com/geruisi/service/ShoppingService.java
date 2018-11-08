package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Commodity;
import com.geruisi.dao.CommodityMapper;
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
			
			sc.addCommodity(commodity,shoops);
			return true;
		}
		
		return false;
	}

	/**
	 * 修改商品数量
	 * @param id
	 * @param quantity
	 * @param sc 
	 */
	public void quantity(Integer id,int quantity, ShoppingCart sc) {
		sc.updateItemQuantity(id, quantity);
	}

	/**
	 * 商品数量+1
	 * @param id
	 * @param sc
	 */
	public void plusShoop(Integer id, ShoppingCart sc) {
		sc.plusQuantity(id);
	}

	/**
	 * 商品-1
	 * @param id
	 * @param sc
	 */
	public void minusShoop(Integer id, ShoppingCart sc) {
		sc.minusQuantity(id);
	}

	/**
	 * 删除多个商品
	 * @param ids
	 * @param sc
	 */
	public void deleteShoops(List<Integer> ids, ShoppingCart sc) {
		for (Integer id : ids) {
			sc.removeItem(id);
		}
		
	}

	/**
	 * 删除单个商品
	 * @param id
	 * @param sc
	 */
	public void deleteShoop(int id, ShoppingCart sc) {
		sc.removeItem(id);
	}


	
}
