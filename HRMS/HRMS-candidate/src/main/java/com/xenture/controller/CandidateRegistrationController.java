package com.xenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xenture.util.ConstantURL;
/*
 * 
 */
@Controller
public class CandidateRegistrationController {
	
	@RequestMapping(value="candidateregistration" , method=RequestMethod.GET)
	public String viewRergisrationPage(){
		
		return ConstantURL.CANDIDATE_REGISTRATION_PAGE;
		
	}

}
