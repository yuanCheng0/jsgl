package com.ibeifeng.ssm.pojo;

public class ClassTranaction {
    private Integer clatraId;

    private String clatraTitle;

    private String clatraDescribe;

    private Integer clatraClassid;

    private String clatraHoldtime;

    public Integer getClatraId() {
        return clatraId;
    }

    public void setClatraId(Integer clatraId) {
        this.clatraId = clatraId;
    }

    public String getClatraTitle() {
        return clatraTitle;
    }

    public void setClatraTitle(String clatraTitle) {
        this.clatraTitle = clatraTitle == null ? null : clatraTitle.trim();
    }

    public String getClatraDescribe() {
        return clatraDescribe;
    }

    public void setClatraDescribe(String clatraDescribe) {
        this.clatraDescribe = clatraDescribe == null ? null : clatraDescribe.trim();
    }

    public Integer getClatraClassid() {
        return clatraClassid;
    }

    public void setClatraClassid(Integer clatraClassid) {
        this.clatraClassid = clatraClassid;
    }

    public String getClatraHoldtime() {
        return clatraHoldtime;
    }

    public void setClatraHoldtime(String clatraHoldtime) {
        this.clatraHoldtime = clatraHoldtime == null ? null : clatraHoldtime.trim();
    }
}