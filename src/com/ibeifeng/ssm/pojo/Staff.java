package com.ibeifeng.ssm.pojo;

public class Staff {
    private Integer staffId;

    private String staffName;

    private String staffSex;

    private String staffMobilephone;

    private Integer staffRoleid;

    private String staffEmail;

    private String staffEntrytime;

    private String staffUsername;

    private String staffPassowrd;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffMobilephone() {
        return staffMobilephone;
    }

    public void setStaffMobilephone(String staffMobilephone) {
        this.staffMobilephone = staffMobilephone == null ? null : staffMobilephone.trim();
    }

    public Integer getStaffRoleid() {
        return staffRoleid;
    }

    public void setStaffRoleid(Integer staffRoleid) {
        this.staffRoleid = staffRoleid;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail == null ? null : staffEmail.trim();
    }

    public String getStaffEntrytime() {
        return staffEntrytime;
    }

    public void setStaffEntrytime(String staffEntrytime) {
        this.staffEntrytime = staffEntrytime == null ? null : staffEntrytime.trim();
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername == null ? null : staffUsername.trim();
    }

    public String getStaffPassowrd() {
        return staffPassowrd;
    }

    public void setStaffPassowrd(String staffPassowrd) {
        this.staffPassowrd = staffPassowrd == null ? null : staffPassowrd.trim();
    }
}