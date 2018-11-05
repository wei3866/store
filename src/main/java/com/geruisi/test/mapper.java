package com.geruisi.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.geruisi.bean.Commodity;
import com.geruisi.dao.CommodityMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class mapper {
	
	@Autowired
	CommodityMapper commodityMapper;

	@Test
	public void test1(){
		List<Commodity> example = commodityMapper.selectByExample(null);
		for (Commodity commodity : example) {
			System.out.println(commodity);
		}
	}

}
