package com.my_codes.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // tells spring it's an MVC Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
