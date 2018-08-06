package com.golden.seed.dao;

import com.golden.seed.pojo.CompanyTable;
import com.golden.seed.pojo.CompanyTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyTableMapper {
    long countByExample(CompanyTableExample example);

    int deleteByExample(CompanyTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyTable record);

    int insertSelective(CompanyTable record);

    List<CompanyTable> selectByExample(CompanyTableExample example);

    CompanyTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyTable record, @Param("example") CompanyTableExample example);

    int updateByExample(@Param("record") CompanyTable record, @Param("example") CompanyTableExample example);

    int updateByPrimaryKeySelective(CompanyTable record);

    int updateByPrimaryKey(CompanyTable record);
}