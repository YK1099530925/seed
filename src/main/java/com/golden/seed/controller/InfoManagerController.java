package com.golden.seed.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.golden.seed.pojo.EventTable;
import com.golden.seed.pojo.FarmerTable;
import com.golden.seed.pojo.LandTable;
import com.golden.seed.pojo.SeedTable;
import com.golden.seed.service.InfoCollectionService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class InfoManagerController {
	
	@Autowired
	InfoCollectionService infoCollectionService;
	
	@GetMapping(value = "/getLandInfoByFarmerId/{pageNum}", produces="application/json;charset=utf-8")
	public String getLandInfoByFarmerId(@PathVariable("pageNum")Integer pageNum, HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		PageHelper.startPage(pageNum, 5);
		List<LandTable> land = infoCollectionService.getLandByFarmerId(farmerId);
		PageInfo pageInfo = new PageInfo<>(land, 5);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("info", pageInfo);
		return jsonObject.toString();
	}
	
	@GetMapping(value = "/getSeedInfoByFarmerId/{pageNum}", produces="application/json;charset=utf-8")
	public String getSeedInfoByFarmerId(@PathVariable("pageNum")Integer pageNum, HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		PageHelper.startPage(pageNum, 5);
		List<SeedTable> seed = infoCollectionService.getSeedByFarmerId(farmerId);
		PageInfo pageInfo = new PageInfo<>(seed, 5);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("info", pageInfo);
		return jsonObject.toString();
	}
	
	@GetMapping(value = "/getSeedInfoByFarmerId", produces="application/json;charset=utf-8")
	public List<SeedTable> getSeedInfoByFarmerId(HttpServletRequest request){
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		return infoCollectionService.getSeedByFarmerId(farmerId);
	}
	
	@GetMapping(value = "/getseedGrowInfoByFarmerIdAndSeedName/{seedName}", produces="application/json;charset=utf-8")
	public String getseedGrowInfoByFarmerIdAndSeedName(@PathVariable("seedName") String seedName, HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		List<EventTable> seedGrow = infoCollectionService.getseedGrowInfoByFarmerIdAndSeedName(farmerId, seedName);
		JSONArray jsonArray = JSONArray.fromObject(seedGrow);
		return jsonArray.toString(); 
	}
	
	@GetMapping(value = "/getfarmerInfo/{farmersId}", produces="application/json;charset=utf-8")
	public FarmerTable getfarmerInfo(@PathVariable("farmersId") String farmersId) {
		return infoCollectionService.getfarmerInfo(farmersId);
	}
	
	@PostMapping(value = "/updateFarmerInfo")
	public String updateFarmerInfo(FarmerTable farmer) {
		return "success";
	}
	
	@GetMapping(value = "/passwordIsTrue/{farmersId}/{password}", produces="application/json;charset=utf-8")
	public String passwordIsTrue(@PathVariable("farmersId") String farmersId, @PathVariable("password") String password) {
		FarmerTable farmer = infoCollectionService.passwordIsTrue(farmersId, password);
		if(farmer != null) {
			return "true";
		}else {
			return "false";
		}
	}
	
	@PostMapping(value = "/farmerPasswordChange")
	public String farmerPasswordChange(String newPassword, HttpServletRequest request) {
		String farmersId = getFarmerId(request);
		if(farmersId.equals("")) {
			return null;
		}
		FarmerTable farmer = infoCollectionService.selectFarmerByFarmersId(farmersId);
		farmer.setPassword(newPassword);
		infoCollectionService.updateFamerInfo(farmer);
		return "true";
	}
	
	
	public String getFarmerId(HttpServletRequest request) {
		HttpSession session = request.getSession();
		FarmerTable farmer = (FarmerTable) session.getAttribute("farmer");
		if(farmer == null) {
			return "";
		}
		return farmer.getFarmersId();
	}
}
