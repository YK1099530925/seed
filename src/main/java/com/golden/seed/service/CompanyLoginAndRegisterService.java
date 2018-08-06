package com.golden.seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golden.seed.dao.CompanyTableMapper;
import com.golden.seed.dao.MyCompanyTableMapper;
import com.golden.seed.pojo.CompanyTable;

@Service
public class CompanyLoginAndRegisterService {
	
	@Autowired
	MyCompanyTableMapper myCompanyTableMapper;
	
	@Autowired
	CompanyTableMapper companyTableMapper;

	public CompanyTable selectCompanyByCompanyName(String name) {
		return myCompanyTableMapper.selectCompanyByCompanyName(name);
	}
	
	public void companyRegister(CompanyTable company) {
		companyTableMapper.insert(company);		
	}
}
