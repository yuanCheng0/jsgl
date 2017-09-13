package com.ibeifeng.ssm.mapper;

import java.util.List;

import com.ibeifeng.ssm.pojo.MarketingActivities;

public interface MarketingActivitiesMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(MarketingActivities record);

    int insertSelective(MarketingActivities record);

    MarketingActivities selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(MarketingActivities record);

    int updateByPrimaryKey(MarketingActivities record);
    
    List<MarketingActivities> selectMarketAll();
//    List<> findById()
}