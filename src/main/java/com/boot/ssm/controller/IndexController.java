package com.boot.ssm.controller;

import com.boot.ssm.model.Customer;
import com.boot.ssm.service.CustomerService;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	private static Logger log = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	public CustomerService customerService;

	@RequestMapping("/customer")
	public ModelAndView getCustomerPage() {
		log.info("getCustomerPage begin...");
		Page<Customer> page = new Page<Customer>();
		page.setPageNum(1);
		page.setPageSize(20);
		page = customerService.getAll(page);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("customers",page.getResult());
		return mv;
	}

	@RequestMapping("/customer/{id}")
	@ResponseBody
	public Customer getCustomer(@PathVariable("id") Long id) {
		log.debug("getCustomer begin. id -->{}",id);
		return customerService.get(id);
	}

	@RequestMapping("/index.html")
	public ModelAndView index(){
		log.error("index...");
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}
