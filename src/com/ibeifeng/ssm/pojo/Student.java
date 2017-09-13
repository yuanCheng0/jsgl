package com.ibeifeng.ssm.pojo;

public class Student {
    private Integer stuId;

    private String stuName;

    private String stuAge;

    private String stuSex;

    private String stuMobile;

    private String stuUsername;

    private String stuPassword;

    private String stuDiplomas;

    private String stuSchoolTag;

    private String stuBirthday;

    private String stuEmail;

    private Integer classId;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge == null ? null : stuAge.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuMobile() {
        return stuMobile;
    }

    public void setStuMobile(String stuMobile) {
        this.stuMobile = stuMobile == null ? null : stuMobile.trim();
    }

    public String getStuUsername() {
        return stuUsername;
    }

    public void setStuUsername(String stuUsername) {
        this.stuUsername = stuUsername == null ? null : stuUsername.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public String getStuDiplomas() {
        return stuDiplomas;
    }

    public void setStuDiplomas(String stuDiplomas) {
        this.stuDiplomas = stuDiplomas == null ? null : stuDiplomas.trim();
    }

    public String getStuSchoolTag() {
        return stuSchoolTag;
    }

    public void setStuSchoolTag(String stuSchoolTag) {
        this.stuSchoolTag = stuSchoolTag == null ? null : stuSchoolTag.trim();
    }

    public String getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday == null ? null : stuBirthday.trim();
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}