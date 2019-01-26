package com.ssm.dao;

import com.ssm.pojo.WantedHouse;
import com.ssm.pojo.WantedHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WantedHouseMapper {
    long countByExample(WantedHouseExample example);

    int deleteByExample(WantedHouseExample example);

    int deleteByPrimaryKey(Integer house_id);

    int insert(WantedHouse record);

    int insertSelective(WantedHouse record);

    List<WantedHouse> selectByExample(WantedHouseExample example);

    WantedHouse selectByPrimaryKey(Integer house_id);

    int updateByExampleSelective(@Param("record") WantedHouse record, @Param("example") WantedHouseExample example);

    int updateByExample(@Param("record") WantedHouse record, @Param("example") WantedHouseExample example);

    int updateByPrimaryKeySelective(WantedHouse record);

    int updateByPrimaryKey(WantedHouse record);
}