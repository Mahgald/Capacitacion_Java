package com.captton.mvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SharedController {

	@RequestMapping("/")
	public String Index(){
		return "Index";
	}
}