package com.my_codes.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	// controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() { // method name can be anything, doesn't matter
		return "helloworld-form";
	}
	
	// controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() { // method name can be anything, doesn't matter
		return "helloworld";
	}
	
	// new controller to read form data
	// add data to the model
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request, Model model) { 
		// read the request parameter from HTML form
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		String result = "Yo! " + name;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// binding request params
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(@RequestParam("studentName") String name, Model model) { 
		name = name.toUpperCase();
		String result = "Hey my friend from v3! " + name;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
