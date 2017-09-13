package com.ibeifeng.ssm.pojo;

public class SourceofStudents {
    private Integer sosId;

    private String sosName;

    private String sosSex;

    private Integer sosAge;

    private String sosEmail;

    private String sosSchool;

    private Integer staffId;

    private String sosInterstates;

    private String sosPhone;

    public Integer getSosId() {
        return sosId;
    }

    public void setSosId(Integer sosId) {
        this.sosId = sosId;
    }

    public String getSosName() {
        return sosName;
    }

    public void setSosName(String sosName) {
        this.sosName = sosName == null ? null : sosName.trim();
    }

    public String getSosSex() {
        return sosSex;
    }

    public void setSosSex(String sosSex) {
        this.sosSex = sosSex == null ? null : sosSex.trim();
    }

    public Integer getSosAge() {
        return sosAge;
    }

    public void setSosAge(Integer sosAge) {
        this.sosAge = sosAge;
    }

    public String getSosEmail() {
        return sosEmail;
    }

    public void setSosEmail(String sosEmail) {
        this.sosEmail = sosEmail == null ? null : sosEmail.trim();
    }

    public String getSosSchool() {
        return sosSchool;
    }

    public void setSosSchool(String sosSchool) {
        this.sosSchool = sosSchool == null ? null : sosSchool.trim();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getSosInterstates() {
        return sosInterstates;
    }

    public void setSosInterstates(String sosInterstates) {
        this.sosInterstates = sosInterstates == null ? null : sosInterstates.trim();
    }

    public String getSosPhone() {
        return sosPhone;
    }

    public void setSosPhone(String sosPhone) {
        this.sosPhone = sosPhone == null ? null : sosPhone.trim();
    }
}