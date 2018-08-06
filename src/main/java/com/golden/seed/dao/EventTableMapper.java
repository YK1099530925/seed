package com.golden.seed.dao;

import com.golden.seed.pojo.EventTable;
import com.golden.seed.pojo.EventTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventTableMapper {
    long countByExample(EventTableExample example);

    int deleteByExample(EventTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventTable record);

    int insertSelective(EventTable record);

    List<EventTable> selectByExample(EventTableExample example);

    EventTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventTable record, @Param("example") EventTableExample example);

    int updateByExample(@Param("record") EventTable record, @Param("example") EventTableExample example);

    int updateByPrimaryKeySelective(EventTable record);

    int updateByPrimaryKey(EventTable record);
}