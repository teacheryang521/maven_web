package com.pro.controller;

import java.util.List;

import com.pro.serivce.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.pojo.Workorder;


@Controller
public class ProjectController {

	//service获取数据,通过注解进行对象注入
	
	@Autowired      //默认按照类型注入
	@Qualifier("workService")
	private WorkService ws;
	
	@RequestMapping("/aa")
	public String getList(Model model){
		
		List<Workorder> wks=ws.getList();
		
		model.addAttribute("wks", wks);
		return "show";
	}
}
