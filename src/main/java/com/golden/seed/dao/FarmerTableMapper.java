package com.golden.seed.dao;

import com.golden.seed.pojo.FarmerTable;
import com.golden.seed.pojo.FarmerTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FarmerTableMapper {
    long countByExample(FarmerTableExample example);

    int deleteByExample(FarmerTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FarmerTable record);

    int insertSelective(FarmerTable record);

    List<FarmerTable> selectByExample(FarmerTableExample example);

    FarmerTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FarmerTable record, @Param("example") FarmerTableExample example);

    int updateByExample(@Param("record") FarmerTable record, @Param("example") FarmerTableExample example);

    int updateByPrimaryKeySelective(FarmerTable record);

    int updateByPrimaryKey(FarmerTable record);
}