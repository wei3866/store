package com.geruisi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.Record;
import com.geruisi.bean.User;
import com.geruisi.service.ShjiazxService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class shangjiazxController {
	@Autowired
	ShjiazxService  shjiazxService; 
	
	@RequestMapping("/sjzxs")
	public String getSjZx(
		@RequestParam(value = "pn", defaultValue = "1") Integer pn,
		Model model){
			
		User user = shjiazxService.getAllSJId("17890364829");
		int  sid = user.getuMer() ;
		
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Commodity> commods = shjiazxService.getSjxzs(sid);
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(commods, 5);
		model.addAttribute("pageInfo", page);
		return "shangjiazx";
	}
}
