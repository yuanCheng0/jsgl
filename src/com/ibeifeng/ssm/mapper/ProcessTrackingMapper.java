package com.ibeifeng.ssm.mapper;

import com.ibeifeng.ssm.pojo.ProcessTracking;

public interface ProcessTrackingMapper {
    int deleteByPrimaryKey(Integer proId);

    int insert(ProcessTracking record);

    int insertSelective(ProcessTracking record);

    ProcessTracking selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(ProcessTracking record);

    int updateByPrimaryKey(ProcessTracking record);
}