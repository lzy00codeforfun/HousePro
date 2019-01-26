package com.ssm.dao;

import com.ssm.pojo.Deal;
import com.ssm.pojo.DealExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealMapper {
    long countByExample(DealExample example);

    int deleteByExample(DealExample example);

    int deleteByPrimaryKey(Integer contract_id);

    int insert(Deal record);

    int insertSelective(Deal record);

    List<Deal> selectByExample(DealExample example);

    Deal selectByPrimaryKey(Integer contract_id);

    int updateByExampleSelective(@Param("record") Deal record, @Param("example") DealExample example);

    int updateByExample(@Param("record") Deal record, @Param("example") DealExample example);

    int updateByPrimaryKeySelective(Deal record);

    int updateByPrimaryKey(Deal record);
    List<Deal> selectByPlace(String province,Date from,Date to);
}