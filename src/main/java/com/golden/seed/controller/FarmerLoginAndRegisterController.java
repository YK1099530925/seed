package com.golden.seed.controller;

import java.util.Map;
import java.util.Random;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.golden.seed.pojo.FarmerTable;
import com.golden.seed.service.FarmerLoginAndRegisterService;

@SessionAttributes(value = {"farmer"})
@Controller
public class FarmerLoginAndRegisterController {
	
	@Autowired
	FarmerLoginAndRegisterService farmerLoginAndRegisterService;
	
	@RequestMapping(value = "/farmerRegister", method = RequestMethod.POST)
	@ResponseBody
	public String register(FarmerTable farmer) {
		String farmersId = "SF";
		
		String num[] = {"0","1","2","3","4","5","6","7","8","9"};
		Random random = new Random();
		for(int i = 0; i < 6; i++) {
			farmersId += num[random.nextInt(10)];
		}
		farmer.setFarmersId(farmersId);
		
		farmerLoginAndRegisterService.register(farmer);
		return "success";
	}
	
	@RequestMapping(value = "/farmerLogin", method = RequestMethod.POST)
	@ResponseBody
	public String login(@PathParam("name") String name, @PathParam("password") String password, Map<String, Object> map) {
		//可根据编号或名字登陆
		FarmerTable farmer = farmerLoginAndRegisterService.selectByName(name);
		if(farmer == null) {
			return "false";
		}
		/*if(farmersName.substring(0, 2).equals("SF")) {
			FarmerTable farmer1 = farmerLoginAndRegisterService.selectByFarmersID(farmersName);
		}*/
		if(farmer.getPassword().equals(password)) {
			farmer.setPassword(null);
			map.put("farmer", farmer);
			return "success";
		}else {
			return "false";
		}
	}
	
}
