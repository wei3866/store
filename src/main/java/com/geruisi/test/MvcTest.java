package com.geruisi.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.geruisi.bean.Commodity;
import com.github.pagehelper.PageInfo;

/**
 * 使用Spring测试模块提供的测试请求功能，测试curd请求的正确性
 * Spring4测试的时候，需要servlet3.0的支持
 * @author lfy
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {
	//传入SpringMVC的ioc
	@Autowired
	WebApplicationContext context;
	
	//虚拟MVC请求,获取处理结果
	MockMvc mockMvc;
	
	@Before
	public void initMockMvc(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testPage() throws Exception{
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/commodityes").param("pn", "1"))
				.andReturn();
		//请求成功后,请求域中会有pageInfo;可以取出pageInfo进行验证
		MockHttpServletRequest request = result.getRequest();
		PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
		
		System.out.println("当前页码："+pi.getPageNum());
		System.out.println("总记录数："+pi.getTotal());
		System.out.println("每页的记录数："+pi.getPageSize());
		System.out.println("总页码："+pi.getPages());
		System.out.println("是否第一页："+pi.isIsFirstPage());
		System.out.println("连续显示的页码：");
		int[] nums = pi.getNavigatepageNums();
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		List<Commodity> list = pi.getList();
		
		for (Commodity commodity : list) {
			System.out.println("ID: "+commodity.getcId()+"====> 姓名: "+commodity.getcName());
		}
	}


}
