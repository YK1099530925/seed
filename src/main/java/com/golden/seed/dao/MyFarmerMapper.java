package com.golden.seed.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.golden.seed.pojo.FarmerTable;

public interface MyFarmerMapper {
	
	FarmerTable selectByName(@Param("farmersName") String farmersName);

	FarmerTable getfarmerInfo(@Param("farmersId") String farmersId);

	FarmerTable passwordIsTrue(@Param("farmersId") String farmersId, @Param("password") String password);

	List<FarmerTable> getFarmerAllInfo();
	
	

}
