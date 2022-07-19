package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "test success";
	}
	
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
	
	//加密货币交易系统
	@RequestMapping("/single_services_8")
	public String index12(Model model) {
		return "single_services_8";
	}
	
	//加密货币钱包和支付系统
	@RequestMapping("/single_services_9")
	public String index13(Model model) {
		return "single_services_9";
	}
	
	//服务体系
	@RequestMapping("/company_history")
	public String index14(Model model) {
		return "company_history";
	}
	
	//服务体系
	@RequestMapping("/company_history1")
	public String index15(Model model) {
		return "company_history1";
	}
	
	//个性化直播软件建设
	@RequestMapping("/company_history2")
	public String index16(Model model) {
		return "company_history2";
	}
	
	//SEM搜索引擎管理
	@RequestMapping("/company_history3")
	public String index17(Model model) {
		return "company_history3";
	}
	
	//跟单系统
	@RequestMapping("/company_history4")
	public String index18(Model model) {
		return "company_history4";
	}
	
	//量化策略优化
	@RequestMapping("/company_history5")
	public String index19(Model model) {
		return "company_history5";
	}
	
	//FIX清算对冲桥
	@RequestMapping("/company_history6")
	public String index20(Model model) {
		return "company_history6";
	}

	//风控插件定制
	@RequestMapping("/company_history7")
	public String index21(Model model) {
		return "company_history7";
	}
	
	//服务器运维
	@RequestMapping("/company_history8")
	public String index22(Model model) {
		return "company_history8";
	}
	
	//风险管理系统
	@RequestMapping("/company_history9")
	public String index23(Model model) {
		return "company_history9";
	}
	
	//NFT 程序
	@RequestMapping("/company_history10")
	public String index24(Model model) {
		return "company_history10";
	}
	
	//GameFi程序
	@RequestMapping("/company_history11")
	public String index25(Model model) {
		return "company_history11";
	}
	
	//区块链解决方案
	@RequestMapping("/company_history12")
	public String index26(Model model) {
		return "company_history12";
	}


}
