package com.ssm.dao;

import com.ssm.pojo.RentHouse;
import com.ssm.pojo.RentHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentHouseMapper {
    long countByExample(RentHouseExample example);

    int deleteByExample(RentHouseExample example);

    int deleteByPrimaryKey(Integer house_id);

    int insert(RentHouse record);

    int insertSelective(RentHouse record);

    List<RentHouse> selectByExample(RentHouseExample example);

    RentHouse selectByPrimaryKey(Integer house_id);

    int updateByExampleSelective(@Param("record") RentHouse record, @Param("example") RentHouseExample example);

    int updateByExample(@Param("record") RentHouse record, @Param("example") RentHouseExample example);

    int updateByPrimaryKeySelective(RentHouse record);

    int updateByPrimaryKey(RentHouse record);
}