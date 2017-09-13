package com.ibeifeng.ssm.pojo;

public class MarketingActivities {
    private Integer actId;

    private String actName;

    private String actContent;

    private String actPrincipal;

    private String actStarttime;

    private String actEndtime;

    private String actStates;

    private Integer actStaffid;

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent == null ? null : actContent.trim();
    }

    public String getActPrincipal() {
        return actPrincipal;
    }

    public void setActPrincipal(String actPrincipal) {
        this.actPrincipal = actPrincipal == null ? null : actPrincipal.trim();
    }

    public String getActStarttime() {
        return actStarttime;
    }

    public void setActStarttime(String actStarttime) {
        this.actStarttime = actStarttime == null ? null : actStarttime.trim();
    }

    public String getActEndtime() {
        return actEndtime;
    }

    public void setActEndtime(String actEndtime) {
        this.actEndtime = actEndtime == null ? null : actEndtime.trim();
    }

    public String getActStates() {
        return actStates;
    }

    public void setActStates(String actStates) {
        this.actStates = actStates == null ? null : actStates.trim();
    }

    public Integer getActStaffid() {
        return actStaffid;
    }

    public void setActStaffid(Integer actStaffid) {
        this.actStaffid = actStaffid;
    }
}