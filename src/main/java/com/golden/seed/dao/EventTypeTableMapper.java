package com.golden.seed.dao;

import com.golden.seed.pojo.EventTypeTable;
import com.golden.seed.pojo.EventTypeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventTypeTableMapper {
    long countByExample(EventTypeTableExample example);

    int deleteByExample(EventTypeTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventTypeTable record);

    int insertSelective(EventTypeTable record);

    List<EventTypeTable> selectByExample(EventTypeTableExample example);

    EventTypeTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventTypeTable record, @Param("example") EventTypeTableExample example);

    int updateByExample(@Param("record") EventTypeTable record, @Param("example") EventTypeTableExample example);

    int updateByPrimaryKeySelective(EventTypeTable record);

    int updateByPrimaryKey(EventTypeTable record);
}