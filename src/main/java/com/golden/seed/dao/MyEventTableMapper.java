package com.golden.seed.dao;

import com.golden.seed.pojo.EventTable;
import com.golden.seed.pojo.EventTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyEventTableMapper {
    EventTable getSeedInfoByLandId(@Param("landId") String landId, @Param("farmerId") String farmerId);

	List<EventTable> getseedGrowInfoByFarmerIdAndSeedName(@Param("farmerId") String farmerId, @Param("seedName")  String seedName);

	void updateLandId(@Param("farmersId") String farmersId, @Param("seedName") String seedName, @Param("landId") String landId);
}