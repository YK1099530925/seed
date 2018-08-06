package com.golden.seed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExitSeedController {
	
	@GetMapping(value = "/exitSeed", produces="application/json;charset=utf-8")
	public String exitSeed(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session.getAttribute("farmer") == null) {
			return "false";
		}
		//session.invalidate();//把session内的所有属性都清除
		session.removeAttribute("farmer");		
		return "true";
	}
}
