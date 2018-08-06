package com.golden.seed.dao;

import com.golden.seed.pojo.LandTable;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyLandTableMapper {
    List<LandTable> selectByFarmerId(@Param("farmerId")String farmerId);
}