package com.ibeifeng.ssm.mapper;

import com.ibeifeng.ssm.pojo.Classes;

public interface ClassesMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}