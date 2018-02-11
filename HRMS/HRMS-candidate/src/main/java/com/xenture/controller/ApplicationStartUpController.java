package com.xenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xenture.util.ConstantURL;

@Controller

public class ApplicationStartUpController {
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String ShowMainPage(){
		System.out.println("In show page main method");
		return ConstantURL.APPLICATION_MAIN_PAGE;
	}

}
