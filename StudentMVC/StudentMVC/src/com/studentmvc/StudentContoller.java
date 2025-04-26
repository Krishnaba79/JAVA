package com.studentmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentContoller {
	
	@Autowired
	DBOperation operation;
	
	@RequestMapping("/add")
	public String addStudentPage(Model m){
		
		Student s=new Student();
		m.addAttribute("student",s);
		
		return "add-student";
		
	}
	
	@RequestMapping("/addData")
	public String addStudent(@ModelAttribute("student")Student s){
		int row=operation.saveStudent(s);
		if(row>0)
			return "redirect:/view";
		else
			return "error";
	}
	@RequestMapping("/view")
	public String viewStudent(Model m){
		List<Student> list=operation.getAllStudents();
		m.addAttribute("studentList",list);
		return "view";
	}
	
	@RequestMapping("/update/{rollno}")
	public String updateStudent(@PathVariable("rollno") int rollno,Model m){
		Student s=operation.getStudentByRoll(rollno);
		m.addAttribute("student",s);
		
		return "update-student";
	}
	
	@RequestMapping("/updateData")
	public String updateSttudentData(@ModelAttribute("student")Student s){
		int row=operation.updateStudent(s);
		if(row>0)
			return "redirect:/view";
		else
			return "error";
	}

}
