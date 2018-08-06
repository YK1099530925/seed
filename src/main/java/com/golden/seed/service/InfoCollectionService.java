package com.golden.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golden.seed.dao.EventTableMapper;
import com.golden.seed.dao.FarmerTableMapper;
import com.golden.seed.dao.LandTableMapper;
import com.golden.seed.dao.MyEventTableMapper;
import com.golden.seed.dao.MyEventTypeTableMapper;
import com.golden.seed.dao.MyFarmerMapper;
import com.golden.seed.dao.MyLandTableMapper;
import com.golden.seed.dao.MySeedTableMapper;
import com.golden.seed.dao.SeedTableMapper;
import com.golden.seed.pojo.EventTable;
import com.golden.seed.pojo.EventTypeTable;
import com.golden.seed.pojo.FarmerTable;
import com.golden.seed.pojo.LandTable;
import com.golden.seed.pojo.SeedTable;

@Service
public class InfoCollectionService {
	
	@Autowired
	FarmerTableMapper farmerTableMapper;

	@Autowired
	LandTableMapper landTableMapper;
	
	@Autowired
	SeedTableMapper seedTableMapper;
	
	@Autowired
	EventTableMapper eventTableMapper;
	
	@Autowired
	MyLandTableMapper myLandTableMapper;
	
	@Autowired
	MyEventTableMapper myEventTableMapper;
	
	@Autowired
	MySeedTableMapper mySeedTableMapper;
	
	@Autowired
	MyFarmerMapper myFarmerMapper;
	
	@Autowired
	MyEventTypeTableMapper myEventTypeTableMapper;
	
	public void landInfoAll(LandTable land) {
		landTableMapper.insert(land);
	}
	
	public void seedCollection(SeedTable seed) {
		seedTableMapper.insert(seed);
	}
	
	public void seedGrow(EventTable event) {
		eventTableMapper.insert(event);
	}
	
	public List<LandTable> getLandByFarmerId(String farmerId){
		return myLandTableMapper.selectByFarmerId(farmerId);
	}
	
	public EventTable getSeedInfoByLandId(String landId, String farmerId){
		return myEventTableMapper.getSeedInfoByLandId(landId, farmerId);
	}
	
	public List<SeedTable> getSeedByFarmerId(String farmerId) {
		return mySeedTableMapper.getSeedByFarmerId(farmerId);
	}

	public List<EventTable> getseedGrowInfoByFarmerIdAndSeedName(String farmerId, String seedName) {
		return myEventTableMapper.getseedGrowInfoByFarmerIdAndSeedName(farmerId, seedName);
	}

	public FarmerTable getfarmerInfo(String farmersId) {
		return myFarmerMapper.getfarmerInfo(farmersId);
	}

	public FarmerTable passwordIsTrue(String farmersId, String password) {
		return myFarmerMapper.passwordIsTrue(farmersId, password);
	}

	public FarmerTable selectFarmerByFarmersId(String farmersId) {
		return myFarmerMapper.getfarmerInfo(farmersId);
	}

	public void updateFamerInfo(FarmerTable farmer) {
		farmerTableMapper.updateByPrimaryKeySelective(farmer);
	}

	public void harvest(String farmersId, String seedName, String landId) {
		myEventTableMapper.updateLandId(farmersId, seedName, landId);
	}

	public List<EventTypeTable> getEventType(String farmerId) {
		return myEventTypeTableMapper.getEventType(farmerId);
	}

}
