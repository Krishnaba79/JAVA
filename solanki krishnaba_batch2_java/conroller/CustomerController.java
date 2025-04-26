package com.example.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
@Autowired
private CustomerService customerService;
	
@RequestMapping("/addCustomer")
public String addCustomer(@RequestParam("name") String name, @RequestParam("email") String email) {
	Customer customer = new Customer(name, email);
	customerService.addCustomer(customer);
	return "redirect:/showData";
		    }
}
