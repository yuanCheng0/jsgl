package com.ibeifeng.ssm.pojo;

import java.util.Date;

public class StaffAttendance {
    private Integer staffAttendanceId;

    private Integer stafId;

    private Date staffAttendanceTime;

    private Integer workHours;

    private Integer leaveHours;

    private Integer workOverhours;

    public Integer getStaffAttendanceId() {
        return staffAttendanceId;
    }

    public void setStaffAttendanceId(Integer staffAttendanceId) {
        this.staffAttendanceId = staffAttendanceId;
    }

    public Integer getStafId() {
        return stafId;
    }

    public void setStafId(Integer stafId) {
        this.stafId = stafId;
    }

    public Date getStaffAttendanceTime() {
        return staffAttendanceTime;
    }

    public void setStaffAttendanceTime(Date staffAttendanceTime) {
        this.staffAttendanceTime = staffAttendanceTime;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getLeaveHours() {
        return leaveHours;
    }

    public void setLeaveHours(Integer leaveHours) {
        this.leaveHours = leaveHours;
    }

    public Integer getWorkOverhours() {
        return workOverhours;
    }

    public void setWorkOverhours(Integer workOverhours) {
        this.workOverhours = workOverhours;
    }
}