package com.golden.seed.dao;

import com.golden.seed.pojo.LandTable;
import com.golden.seed.pojo.LandTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandTableMapper {
    long countByExample(LandTableExample example);

    int deleteByExample(LandTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LandTable record);

    int insertSelective(LandTable record);

    List<LandTable> selectByExample(LandTableExample example);

    LandTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LandTable record, @Param("example") LandTableExample example);

    int updateByExample(@Param("record") LandTable record, @Param("example") LandTableExample example);

    int updateByPrimaryKeySelective(LandTable record);

    int updateByPrimaryKey(LandTable record);
}