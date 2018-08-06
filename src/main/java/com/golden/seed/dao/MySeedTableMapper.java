package com.golden.seed.dao;

import com.golden.seed.pojo.SeedTable;
import com.golden.seed.pojo.SeedTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MySeedTableMapper {
    List<SeedTable> getSeedByFarmerId(@Param("farmerId")String farmerId);
}