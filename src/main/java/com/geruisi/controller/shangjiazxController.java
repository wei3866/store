package com.geruisi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.User;
import com.geruisi.service.ShjiazxService;
import com.geruisi.until.Get16Number;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;

@Controller
public class shangjiazxController {
	@Autowired
	ShjiazxService  shjiazxService; 
	
	@RequestMapping("/sjzxs")
	public String getSjZx(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,
			HttpServletRequest request, HttpServletResponse response,Map<String , Object> map){
		
		HttpSession session = request.getSession();
		String inputNumber = (String) session.getAttribute("userLogin");
		
		User user = shjiazxService.getAllSJId(inputNumber);
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
		Get16Number dates = new Get16Number(); 
		
		String  cPutaways = dates.DateToStr(new Date());
		
		map.put("cPutaways",cPutaways );
		map.put("mid", sid);
		return "shangjiazx";
		
	}
	//上架
	@RequestMapping(value="/shangjia",method=RequestMethod.POST)
	public Msg shangjia( Commodity commods ){
		
		shjiazxService.shangjias(commods);
		return Msg.success();
	}
	//下架
	@RequestMapping(value="/xiajia/{ids}",method=RequestMethod.DELETE)
	public Msg shangchuById(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id的集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			shjiazxService.deleteByIds(del_ids);
		}else{
			Integer id = Integer.parseInt(ids);
			shjiazxService.deletebyId(id);
		}
		return Msg.success();
	}
	/**
	 * 根据id查询商品
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/updatesp/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getshangpinByID(@PathVariable("id")Integer id){
		
		Commodity commodity = shjiazxService.getShangPin(id);
		return Msg.success().add("comm", commodity);
	}
	
	//根究id修改商品信息
	@RequestMapping(value="/updatesp/{sid}",method=RequestMethod.PUT)
	@ResponseBody
	public  Msg updateByid(Commodity commodity){
		shjiazxService.updateById(commodity);
		return Msg.success();
	}
}
