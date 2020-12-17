package com.my_codes.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create a student object
		Student newStudent = new Student();
		
		// add student object to the model
		model.addAttribute("student", newStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute Student newStudent) {
		
		System.out.println("New Student: " + newStudent.getFirstName() + " " + newStudent.getLastName());
		return "student-confirmation";
	}
}
