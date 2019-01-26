package com.ssm.dao;

import com.ssm.pojo.Earning;
import com.ssm.pojo.EarningExample;
import com.ssm.pojo.EarningKey;
import com.ssm.pojo.Tran;
import com.ssm.pojo.Trans;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EarningMapper {
    long countByExample(EarningExample example);

    int deleteByExample(EarningExample example);

    int deleteByPrimaryKey(EarningKey key);

    int insert(Earning record);

    int insertSelective(Earning record);

    List<Earning> selectByExample(EarningExample example);

    Earning selectByPrimaryKey(EarningKey key);

    int updateByExampleSelective(@Param("record") Earning record, @Param("example") EarningExample example);

    int updateByExample(@Param("record") Earning record, @Param("example") EarningExample example);

    int updateByPrimaryKeySelective(Earning record);

    int updateByPrimaryKey(Earning record);
    List<Trans> selectByMonth(Date from,Date to,String province);
    List<Tran> selectSortNo(Date from,Date to);
    List<Tran> selectSortFee(Date from,Date to);
}