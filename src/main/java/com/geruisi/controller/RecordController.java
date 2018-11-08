package com.geruisi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.bean.Record;
import com.geruisi.service.RecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class RecordController {
	@Autowired
	RecordService recordService;
	
	
	//获取订单并分页
	@RequestMapping("/records")
	public String getRecordAll(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model){
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 8);
		// startPage后面紧跟的这个查询就是一个分页查询
		
		List<Record> records = recordService.getAll("17890364829");
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(records, 5);
		model.addAttribute("pageInfo", page);
		return "record";
	}
	@ResponseBody
	@RequestMapping("/getOneRecord")
	public Msg getRecordOne(@RequestParam("id")String str){
		 List<Record> list = recordService.getOneRecord(str);
		
		return Msg.success().add("record", list);
	}
	

}
