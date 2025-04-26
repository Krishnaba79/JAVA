package com.example.conroller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class DataController {
	

	

	    // Sample data, replace with actual database or data source
	    private List<Data> data = new ArrayList<>();

	    public DataController() {
	        // Initialize sample data
	        data.add(new Data(1, "John Doe", "john@example.com", "2022-01-01"));
	        data.add(new Data(2, "Jane Doe", "jane@example.com", "2022-01-15"));
	        data.add(new Data(3, "Bob Smith", "bob@example.com", "2022-02-01"));
	    }

	    @GetMapping("/showData")
	    public String showData(Model model) {
	        model.addAttribute("data", data);
	        return "showData"; // returns the JSP file
	    }

	    @GetMapping("/updateData/{id}")
	    public String updateData(@PathVariable int id, Model model) {
	        Data item = getDataById(id);
	        if (item!= null) {
	            model.addAttribute("item", item);
	            return "updateData"; // returns the update JSP file
	        } else {
	            return "error"; // returns an error page
	        }
	    }

	    @GetMapping("/deleteData/{id}")
	    public String deleteData(@PathVariable int id, Model model) {
	        Data item = getDataById(id);
	        if (item!= null) {
	            data.remove(item);
	            model.addAttribute("data", data);
	            return "showData"; // returns the showData JSP file
	        } else {
	            return "error"; // returns an error page
	        }
	    }

	    private Data getDataById(int id) {
	        for (Data item : data) {
	            if (item.getId() == id) {
	                return item;
	            }
	        }
	        return null;
	    }
	}

	class Data {
	    private int id;
	    private String customerName;
	    private String email;
	    private String orderDate;

	    public Data(int id, String customerName, String email, String orderDate) {
	        this.id = id;
	        this.customerName = customerName;
	        this.email = email;
	        this.orderDate = orderDate;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getOrderDate() {
	        return orderDate;
	    }
	}


