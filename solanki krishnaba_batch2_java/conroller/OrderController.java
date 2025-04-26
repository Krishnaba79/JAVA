package com.example.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {
@Autowired
private OrderService orderService;

@RequestMapping("/addOrder")
public String addOrder(@RequestParam("customerName") String customerName, @RequestParam("orderDate") Date orderDate) {
	        Order order = new Order(customerName, orderDate);
	        orderService.addOrder(order);
	        return "redirect:/showData";
	    }	
}
