package com.golden.seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golden.seed.dao.FarmerTableMapper;
import com.golden.seed.dao.MyFarmerMapper;
import com.golden.seed.pojo.FarmerTable;

@Service
public class FarmerLoginAndRegisterService {

	@Autowired
	FarmerTableMapper farmerTableMapper;
	
	@Autowired
	MyFarmerMapper myFarmerMapper;
	
	public void register(FarmerTable farmer) {
		farmerTableMapper.insert(farmer);
	}

	public FarmerTable selectByName(String farmersName) {
		return myFarmerMapper.selectByName(farmersName);
	}
	
}
