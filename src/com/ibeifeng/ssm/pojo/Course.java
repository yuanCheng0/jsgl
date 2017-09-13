package com.ibeifeng.ssm.pojo;

public class Course {
    private Integer courseId;

    private String classTime;

    private String classSyllabus;

    private Integer classId;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime == null ? null : classTime.trim();
    }

    public String getClassSyllabus() {
        return classSyllabus;
    }

    public void setClassSyllabus(String classSyllabus) {
        this.classSyllabus = classSyllabus == null ? null : classSyllabus.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}