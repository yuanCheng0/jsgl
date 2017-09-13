package com.ibeifeng.ssm.mapper;

import com.ibeifeng.ssm.pojo.StaffAttendance;

public interface StaffAttendanceMapper {
    int deleteByPrimaryKey(Integer staffAttendanceId);

    int insert(StaffAttendance record);

    int insertSelective(StaffAttendance record);

    StaffAttendance selectByPrimaryKey(Integer staffAttendanceId);

    int updateByPrimaryKeySelective(StaffAttendance record);

    int updateByPrimaryKey(StaffAttendance record);
}