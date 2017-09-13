package com.ibeifeng.ssm.mapper;

import java.util.List;

import com.ibeifeng.ssm.pojo.SourceofStudents;

public interface SourceofStudentsMapper {
    int deleteByPrimaryKey(Integer sosId);

    int insert(SourceofStudents record);

    int insertSelective(SourceofStudents record);

    SourceofStudents selectByPrimaryKey(Integer sosId);

    int updateByPrimaryKeySelective(SourceofStudents record);

    int updateByPrimaryKey(SourceofStudents record);
    
    List<SourceofStudents> findAll();
    }