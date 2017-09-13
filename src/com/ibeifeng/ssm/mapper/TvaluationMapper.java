package com.ibeifeng.ssm.mapper;

import com.ibeifeng.ssm.pojo.Tvaluation;

public interface TvaluationMapper {
    int deleteByPrimaryKey(Integer tvaluationId);

    int insert(Tvaluation record);

    int insertSelective(Tvaluation record);

    Tvaluation selectByPrimaryKey(Integer tvaluationId);

    int updateByPrimaryKeySelective(Tvaluation record);

    int updateByPrimaryKey(Tvaluation record);
}