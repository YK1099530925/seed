package com.golden.seed.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.golden.seed.pojo.EventTable;
import com.golden.seed.pojo.EventTypeTable;
import com.golden.seed.pojo.FarmerTable;
import com.golden.seed.pojo.LandTable;
import com.golden.seed.pojo.SeedTable;
import com.golden.seed.service.InfoCollectionService;

@Controller
public class InfoCollectionController {
	
	@Autowired
	InfoCollectionService infoCollectionService;

	/**
	 * 再添加前，需要判断是否已经存在此土地
	 * @param landAllMember
	 * @param landAddress
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/landInfoAll", method=RequestMethod.POST)
	@ResponseBody
	public String landInfoAll(@PathParam("landAllMember")String landAllMember, @PathParam("landAddress")String landAddress, HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		LandTable land = new LandTable();
		
		for(int i = 1; i <= Integer.parseInt(landAllMember); i++) {
			land.setLandId(i + "");
			land.setFarmerId(farmerId);
			land.setLandAddress(landAddress);
			infoCollectionService.landInfoAll(land);
		}
		return "true";
	}
	/**
	 * 再添加前，需要判断是否已经存在此土地
	 * @param land
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/landInfo", method=RequestMethod.POST)
	@ResponseBody
	public String landInfo(LandTable land, HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return "false";
		}
		land.setFarmerId(farmerId);
		infoCollectionService.landInfoAll(land);
		return "true";
	}
	
	@RequestMapping(value="/seedCollection", method=RequestMethod.POST)
	@ResponseBody
	public String seedCollection(SeedTable seed, HttpServletRequest request) {
		if(seed.getFarmerId() == null || seed.getFarmerId().equals("")) {
			String farmerId = getFarmerId(request);
			if(farmerId .equals("")) {
				return "false";
			}
			seed.setFarmerId(farmerId);
		}
		seed.setStorageTime(new Date());
		infoCollectionService.seedCollection(seed);
		return "true";
	}
	
	@RequestMapping(value="/seedGrow", method=RequestMethod.POST)
	@ResponseBody
	public String seedGrow(EventTable event, HttpServletRequest request) {
		if(event.getFarmersId() == null || event.getFarmersId().equals("")) {
			String farmerId = getFarmerId(request);
			if(farmerId .equals("")) {
				return "false";
			}
			event.setFarmersId(farmerId);
		}
		event.setEventTime(new Date());
		infoCollectionService.seedGrow(event);
		return "true";
	}
	
	@RequestMapping(value="/getLandId", method=RequestMethod.GET)
	@ResponseBody
	public List<LandTable> getLandByFarmerId(HttpServletRequest request){
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		return infoCollectionService.getLandByFarmerId(farmerId);
	}
	
	/**
	 * 通过土地编号和农民编号去事件表中查找种子的信息
	 * @param landId
	 * @return
	 */
	@RequestMapping(value="/getSeedInfoByLandId/{landId}", method=RequestMethod.GET)
	@ResponseBody
	public EventTable getSeedInfoByLandId(@PathVariable("landId")String landId, HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		return infoCollectionService.getSeedInfoByLandId(landId, farmerId);
	}
	
	@RequestMapping(value="/getEventType", method=RequestMethod.GET)
	@ResponseBody
	public List<EventTypeTable> getEventType(HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		List<EventTypeTable> list = infoCollectionService.getEventType(farmerId);
		
		for(int i = 0; i < list.size(); ) {
			EventTypeTable eventTypeTable = list.get(i);
			if(eventTypeTable.getEventType().equals("播种") || eventTypeTable.getEventType().equals("收获")) {
				list.remove(i);
				i--;
			}else {
				i++;
			}
		}
		return list;
	}
	
	@RequestMapping(value="/getSeedName", method=RequestMethod.GET)
	@ResponseBody
	public List<SeedTable> getSeedByFarmerId(HttpServletRequest request) {
		String farmerId = getFarmerId(request);
		if(farmerId.equals("")) {
			return null;
		}
		return infoCollectionService.getSeedByFarmerId(farmerId);
	}
	
	@RequestMapping(value="/harvest", method=RequestMethod.POST)
	@ResponseBody
	public String harvest(EventTable event, HttpServletRequest request) {
		if(event.getFarmersId() == null || event.getFarmersId().equals("")) {
			String farmerId = getFarmerId(request);
			if(farmerId.equals("")) {
				return null;
			}
			event.setFarmersId(farmerId);
		}
		infoCollectionService.harvest(event.getFarmersId(), event.getSeedName(), event.getLandId());
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
