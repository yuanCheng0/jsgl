package com.ibeifeng.ssm.mapper;

import com.ibeifeng.ssm.pojo.ClassTranaction;

public interface ClassTranactionMapper {
    int deleteByPrimaryKey(Integer clatraId);

    int insert(ClassTranaction record);

    int insertSelective(ClassTranaction record);

    ClassTranaction selectByPrimaryKey(Integer clatraId);

    int updateByPrimaryKeySelective(ClassTranaction record);

    int updateByPrimaryKey(ClassTranaction record);
}