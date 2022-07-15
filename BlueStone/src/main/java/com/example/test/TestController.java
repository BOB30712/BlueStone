package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String index(Model model) {
		return "test";
	}
	
	@RequestMapping("/home")
	public String index2(Model model) {
		return "index_4";
	}
	
	@RequestMapping("/about_4")
	public String index3(Model model) {
		return "about_4";
	}
	
	@RequestMapping("/single_services_2")
	public String index4(Model model) {
		return "single_services_2";
	}
	
	@RequestMapping("/contact")
	public String index5(Model model) {
		return "contact";
	}
	
	@RequestMapping("/branches")
	public String index6(Model model) {
		return "branches";
	}
	
	//白标租赁
	@RequestMapping("/single_services_3")
	public String index7(Model model) {
		return "single_services_3";
	}
	
	//CRM系统
	@RequestMapping("/single_services_4")
	public String index8(Model model) {
		return "single_services_4";
	}
	
	//传统交易系统
	@RequestMapping("/single_services_5")
	public String index9(Model model) {
		return "single_services_5";
	}
	
	//二元期权交易系统
	@RequestMapping("/single_services_6")
	public String index10(Model model) {
		return "single_services_6";
	}
	
	//移动端交易系统
	@RequestMapping("/single_services_7")
	public String index11(Model model) {
		return "single_services_7";
	}

}
