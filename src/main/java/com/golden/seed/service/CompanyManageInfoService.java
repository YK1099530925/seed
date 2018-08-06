package com.golden.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golden.seed.dao.CompanyTableMapper;
import com.golden.seed.dao.MyCompanyTableMapper;
import com.golden.seed.dao.MyEventTableMapper;
import com.golden.seed.dao.MyFarmerMapper;
import com.golden.seed.dao.MySeedTableMapper;
import com.golden.seed.pojo.CompanyTable;
import com.golden.seed.pojo.EventTable;
import com.golden.seed.pojo.FarmerTable;
import com.golden.seed.pojo.SeedTable;

@Service
public class CompanyManageInfoService {
	
	@Autowired
	MyFarmerMapper myFarmerMapper;
	
	@Autowired
	MySeedTableMapper mySeedTableMapper;
	
	@Autowired
	MyEventTableMapper myEventTableMapper;
	
	@Autowired
	MyCompanyTableMapper myCompanyTableMapper;
	
	@Autowired
	CompanyTableMapper companyTableMapper;
	
	public List<FarmerTable> getFarmerInfo(){
		return myFarmerMapper.getFarmerAllInfo();
	}

	public List<SeedTable> getseedInfoByFarmersId(String farmersId) {
		return mySeedTableMapper.getSeedByFarmerId(farmersId);
	}

	public List<EventTable> getseedGrowInfoByFarmerIdAndSeedName(String farmerId, String seedName) {
		return myEventTableMapper.getseedGrowInfoByFarmerIdAndSeedName(farmerId, seedName);
	}

	public CompanyTable getCompanyInfo(String companyId) {
		return myCompanyTableMapper.getCompanyInfo(companyId);
	}

	public CompanyTable getCompanyByCompanyIdAndPssword(String companyId, String password) {
		return myCompanyTableMapper.getCompanyByCompanyIdAndPssword(companyId, password);
	}

	public void updatePassword(CompanyTable company) {
		companyTableMapper.updateByPrimaryKeySelective(company);
	}
}
