package com.ssm.dao;

import com.ssm.pojo.UsedPwdExample;
import com.ssm.pojo.UsedPwdKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsedPwdMapper {
    long countByExample(UsedPwdExample example);

    int deleteByExample(UsedPwdExample example);

    int deleteByPrimaryKey(UsedPwdKey key);

    int insert(UsedPwdKey record);

    int insertSelective(UsedPwdKey record);

    List<UsedPwdKey> selectByExample(UsedPwdExample example);

    int updateByExampleSelective(@Param("record") UsedPwdKey record, @Param("example") UsedPwdExample example);

    int updateByExample(@Param("record") UsedPwdKey record, @Param("example") UsedPwdExample example);
}