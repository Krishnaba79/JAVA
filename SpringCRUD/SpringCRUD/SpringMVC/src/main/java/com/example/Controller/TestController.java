package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Database.EmployeeDB;
import com.example.Model.Employee;

@Controller
public class TestController {
	@Autowired
	public EmployeeDB employeeDB;
@RequestMapping("/add")
public String addEmployee(Model model) {
	Employee employee = new Employee(); 
	model.addAttribute("employee",employee);
	return "addEmployee";
}
@RequestMapping("/insert")
public String insertedEmployee(@ModelAttribute("employee")Employee employee)
{
	int rows = employeeDB.insertData(employee);
	if(rows>0) {
		return "addedEmployee";
	} else {
		return "";
	}
}

@RequestMapping("/viewData")
public String viewData(Model model){
	List<Employee> list = employeeDB.getAll();
	model.addAttribute("list",list);
	if(!list.isEmpty()) {
	return "view";
	} else {
		return "viewError";
	}
}
@RequestMapping("/update/{id}")
public String update(@PathVariable("id")int id,Model model) {
	
	Employee emp = employeeDB.getOneEmployee(id);
	model.addAttribute("employee",emp);
	return "updateForm";

}

@RequestMapping("/update/updated")
public String updatedForm(@ModelAttribute("employee")Employee employee) {
	int rows = employeeDB.updateStu(employee);
	if(rows>0) {
		return "redirect:/viewData";
	}
	return "";
}

@RequestMapping("del/{id}")
public String deleteUser(@PathVariable("id")int id) {
	int rows = employeeDB.delEmployee(id);
	if(rows>0) {
		return "redirect:/viewData";
	} else {
		return "redirect:/add";
	}
}

}
