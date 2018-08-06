package com.golden.seed.controller;

import java.util.Map;
import java.util.Random;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.golden.seed.pojo.CompanyTable;
import com.golden.seed.service.CompanyLoginAndRegisterService;

@SessionAttributes(value = {"company"})
@RestController
public class CompanyLoginAndRegisterController {
	
	@Autowired
	CompanyLoginAndRegisterService companyLoginAndRegisterService;
	
	@PostMapping(value = "/companyRegister")
	public String companyRegister(CompanyTable company) {
		String companyId = "SC";
		String num[] = {"0","1","2","3","4","5","6","7","8","9"};
		Random random = new Random();
		for(int i = 0; i < 6; i++) {
			companyId += num[random.nextInt(10)];
		}
		company.setCompanyId(companyId);
		companyLoginAndRegisterService.companyRegister(company);
		return "true";
	}
	
	@GetMapping(value = "/companyLogin")
	public String companyLogin(@PathParam("name") String name, @PathParam("password") String password, Map<String, Object> map){
		CompanyTable company = companyLoginAndRegisterService.selectCompanyByCompanyName(name);
		if(company == null) {
			return "false";
		}
		if(company.getPassword().equals(password)) {
			company.setPassword(null);
			map.put("company", company);
			return "success";
		}else {
			return "false";
		}
	}
}
