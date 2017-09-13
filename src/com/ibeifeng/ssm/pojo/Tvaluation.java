package com.ibeifeng.ssm.pojo;

public class Tvaluation {
    private Integer tvaluationId;

    private String tvaluationDate;

    private String tvaluationTitle;

    private String tvaluationContent;

    private Integer tvStaffid;

    private Integer studentId;

    public Integer getTvaluationId() {
        return tvaluationId;
    }

    public void setTvaluationId(Integer tvaluationId) {
        this.tvaluationId = tvaluationId;
    }

    public String getTvaluationDate() {
        return tvaluationDate;
    }

    public void setTvaluationDate(String tvaluationDate) {
        this.tvaluationDate = tvaluationDate == null ? null : tvaluationDate.trim();
    }

    public String getTvaluationTitle() {
        return tvaluationTitle;
    }

    public void setTvaluationTitle(String tvaluationTitle) {
        this.tvaluationTitle = tvaluationTitle == null ? null : tvaluationTitle.trim();
    }

    public String getTvaluationContent() {
        return tvaluationContent;
    }

    public void setTvaluationContent(String tvaluationContent) {
        this.tvaluationContent = tvaluationContent == null ? null : tvaluationContent.trim();
    }

    public Integer getTvStaffid() {
        return tvStaffid;
    }

    public void setTvStaffid(Integer tvStaffid) {
        this.tvStaffid = tvStaffid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}