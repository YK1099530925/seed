package com.golden.seed.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.golden.seed.pojo.CompanyTable;
import com.golden.seed.pojo.EventTable;
import com.golden.seed.pojo.FarmerTable;
import com.golden.seed.pojo.SeedTable;
import com.golden.seed.service.CompanyManageInfoService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class CompanyManageInfoController {
	
	@Autowired
	CompanyManageInfoService companyManageInfoService;
	
	@GetMapping(value = "/getFarmerInfo/{pageNum}", produces="application/json;charset=utf-8")
	public String getFarmerInfo(@PathVariable("pageNum") Integer pageNum) {
		PageHelper.startPage(pageNum, 5);
		List<FarmerTable> farmer = companyManageInfoService.getFarmerInfo();
		PageInfo pageInfo = new PageInfo<>(farmer, 5);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("info", pageInfo);
		return jsonObject.toString();
	}
	
	@GetMapping(value = "/getFarmerInfoList", produces="application/json;charset=utf-8")
	public List<FarmerTable> getFarmerInfoList(){
		return companyManageInfoService.getFarmerInfo();
	}
	
	@GetMapping(value = "/getseedInfoByFarmersId/{farmersId}")
	public List<SeedTable> getseedInfoByFarmersId(@PathVariable("farmersId") String farmersId){
		return companyManageInfoService.getseedInfoByFarmersId(farmersId);
	}
	
	@GetMapping(value = "/getseedGrowInfoByFarmerIdAndSeedName/{farmerId}/{seedName}", produces="application/json;charset=utf-8")
	public String getseedGrowInfoByFarmerIdAndSeedName(@PathVariable("farmerId") String farmerId, @PathVariable("seedName") String seedName) {
		List<EventTable> seedGrow = companyManageInfoService.getseedGrowInfoByFarmerIdAndSeedName(farmerId, seedName);
		JSONArray jsonArray = JSONArray.fromObject(seedGrow);
		return jsonArray.toString(); 
	}
	
	@GetMapping(value = "/getCompanyInfo/{companyId}")
	public CompanyTable getCompanyInfo(@PathVariable String companyId) {
		return companyManageInfoService.getCompanyInfo(companyId);
	}
	
	@GetMapping(value = "/companyPasswordIsTrue/{companyId}/{password}", produces="application/json;charset=utf-8")
	public String companyPasswordIsTrue(@PathVariable String companyId, @PathVariable String password) {
		CompanyTable company = companyManageInfoService.getCompanyByCompanyIdAndPssword(companyId, password);
		if(company != null) {
			return "true";
		}else {
			return "false";
		}
	}
	
	@PostMapping(value = "/companyPasswordChange")
	public String companyPasswordChange(String newPassword, HttpServletRequest request) {
		String companyId = ((CompanyTable) request.getSession().getAttribute("company")).getCompanyId();
		CompanyTable company = companyManageInfoService.getCompanyInfo(companyId);
		company.setPassword(newPassword);
		companyManageInfoService.updatePassword(company);
		return "true";
	}
}
