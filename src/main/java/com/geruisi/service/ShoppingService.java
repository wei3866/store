package com.geruisi.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.Money;
import com.geruisi.bean.Record;
import com.geruisi.dao.CommodityMapper;
import com.geruisi.dao.MoneyMapper;
import com.geruisi.dao.RecordMapper;
import com.geruisi.until.Get16Number;
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
	private MoneyMapper moneyMapper;
	
	@Autowired
	private Get16Number get16Number;
	
	@Autowired
	private RecordMapper recordMapper;
	
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

	/**
	 * 结算
	 * @param sc
	 * @param name
	 * @param number
	 * @param str
	 * @param ids
	 * @param moneys
	 * @param request 
	 * @return
	 */
	public boolean allStives(ShoppingCart sc, String name, String number, String str, List<Integer> ids, int moneys,
			HttpServletRequest request) {
		
		//HttpSession session = request.getSession();
		//String strNmnber = (String) session.getAttribute("userLogin");
		String strNmnber = "18463903746";
		//查询用户余额
		Money money = moneyMapper.selectByKey(strNmnber);
		int mon = money.getmMoney();
		int monId = money.getmId();
		int i = mon-moneys;
		
		if (i>0) {
			for (Integer id : ids) {
				
				Commodity commodity = commodityMapper.selectByPrimaryKey(id);
				//商品id
				Integer merchantId = commodity.getcMerchantId();
				//商品价格
				Integer price = commodity.getcPrice();
				
				//订单号
				String rOrderId = get16Number.getUUID();
				//时间
				String dateToStr = get16Number.DateToStr(new Date());
				
				//商品件数
				int commodityNumber = sc.getCommodityNumber();
				
				//修改库存
				Integer inventory = commodity.getcInventory();
				Integer sales = commodity.getcSales();
				if (inventory > commodityNumber) {
					Integer inven = inventory-commodityNumber;
					Integer sale = sales+commodityNumber;
					Commodity commodity2 = new Commodity(id, null, null, null, null, null, null, inven, sale, null);
					commodityMapper.updateByPrimaryKey(commodity2);
				}else {
					return false;
				}
				
				
				//添加订单
				Record record = new Record(null, rOrderId, strNmnber, id, merchantId, price, dateToStr, null, 1, str, name, number);
				recordMapper.insertSelective(record);
				
				sc.removeItem(id);
			}
			
			//修改余额
			Money money2 = new Money(monId, strNmnber, i);
			moneyMapper.updateByPrimaryKey(money2);
			
			return true;
		}
		
		return false;
	}

	public boolean allStive(ShoppingCart sc, String name, String number, String str, int id, int moneys,
			HttpServletRequest request) {
		
		//HttpSession session = request.getSession();
		//String strNmnber = (String) session.getAttribute("userLogin");
		String strNmnber = "18463903746";
		//查询用户余额
		Money money = moneyMapper.selectByKey(strNmnber);
		int mon = money.getmMoney();
		int monId = money.getmId();
		int i = mon-moneys;
		
		if (i>0) {
			
			Commodity commodity = commodityMapper.selectByPrimaryKey(id);
			Integer merchantId = commodity.getcMerchantId();
			Integer price = commodity.getcPrice();
			
			String rOrderId = get16Number.getUUID();
			String dateToStr = get16Number.DateToStr(new Date());
			
			//添加订单
			Record record = new Record(null, rOrderId, strNmnber, id, merchantId, price, dateToStr, null, 1, str, name, number);
			recordMapper.insertSelective(record);
			
			//修改余额
			Money money2 = new Money(monId, strNmnber, i);
			moneyMapper.updateByPrimaryKey(money2);
			
			//商品件数
			int commodityNumber = sc.getCommodityNumber();
			
			//修改库存
			Integer inventory = commodity.getcInventory();
			Integer sales = commodity.getcSales();
			if (inventory > commodityNumber) {
				Integer inven = inventory-commodityNumber;
				Integer sale = sales+commodityNumber;
				Commodity commodity2 = new Commodity(id, null, null, null, null, null, null, inven, sale, null);
				commodityMapper.updateByPrimaryKey(commodity2);
			}else {
				return false;
			}
			
			sc.removeItem(id);
			
			return true;
		}
				
		return false;
	}


	
}
