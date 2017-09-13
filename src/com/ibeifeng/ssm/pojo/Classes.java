package com.ibeifeng.ssm.pojo;

public class Classes {
    private Integer classId;

    private String classroomName;

    private Integer classSubjectId;

    private String classStarttime;

    private String classEndtime;

    private Integer classStudentnum;

    private Integer classStaffId;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    public Integer getClassSubjectId() {
        return classSubjectId;
    }

    public void setClassSubjectId(Integer classSubjectId) {
        this.classSubjectId = classSubjectId;
    }

    public String getClassStarttime() {
        return classStarttime;
    }

    public void setClassStarttime(String classStarttime) {
        this.classStarttime = classStarttime == null ? null : classStarttime.trim();
    }

    public String getClassEndtime() {
        return classEndtime;
    }

    public void setClassEndtime(String classEndtime) {
        this.classEndtime = classEndtime == null ? null : classEndtime.trim();
    }

    public Integer getClassStudentnum() {
        return classStudentnum;
    }

    public void setClassStudentnum(Integer classStudentnum) {
        this.classStudentnum = classStudentnum;
    }

    public Integer getClassStaffId() {
        return classStaffId;
    }

    public void setClassStaffId(Integer classStaffId) {
        this.classStaffId = classStaffId;
    }
}