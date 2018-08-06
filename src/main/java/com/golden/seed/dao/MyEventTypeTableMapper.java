package com.golden.seed.dao;

import com.golden.seed.pojo.EventTypeTable;
import com.golden.seed.pojo.EventTypeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyEventTypeTableMapper {

    List<EventTypeTable> getEventType(@Param("farmerId") String farmerId);
}