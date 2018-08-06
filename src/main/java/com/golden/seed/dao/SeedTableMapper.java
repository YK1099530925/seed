package com.golden.seed.dao;

import com.golden.seed.pojo.SeedTable;
import com.golden.seed.pojo.SeedTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeedTableMapper {
    long countByExample(SeedTableExample example);

    int deleteByExample(SeedTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeedTable record);

    int insertSelective(SeedTable record);

    List<SeedTable> selectByExample(SeedTableExample example);

    SeedTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeedTable record, @Param("example") SeedTableExample example);

    int updateByExample(@Param("record") SeedTable record, @Param("example") SeedTableExample example);

    int updateByPrimaryKeySelective(SeedTable record);

    int updateByPrimaryKey(SeedTable record);
}