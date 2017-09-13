package com.ibeifeng.ssm.pojo;

public class ProcessTracking {
    private Integer proId;

    private String proTheme;

    private String proName;

    private String proContent;

    private String proIntentionalstates;

    private String proPrincipal;

    private String proDate;

    private String proNextdate;

    private Integer proSosid;

    private Integer proStaffid;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProTheme() {
        return proTheme;
    }

    public void setProTheme(String proTheme) {
        this.proTheme = proTheme == null ? null : proTheme.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProContent() {
        return proContent;
    }

    public void setProContent(String proContent) {
        this.proContent = proContent == null ? null : proContent.trim();
    }

    public String getProIntentionalstates() {
        return proIntentionalstates;
    }

    public void setProIntentionalstates(String proIntentionalstates) {
        this.proIntentionalstates = proIntentionalstates == null ? null : proIntentionalstates.trim();
    }

    public String getProPrincipal() {
        return proPrincipal;
    }

    public void setProPrincipal(String proPrincipal) {
        this.proPrincipal = proPrincipal == null ? null : proPrincipal.trim();
    }

    public String getProDate() {
        return proDate;
    }

    public void setProDate(String proDate) {
        this.proDate = proDate == null ? null : proDate.trim();
    }

    public String getProNextdate() {
        return proNextdate;
    }

    public void setProNextdate(String proNextdate) {
        this.proNextdate = proNextdate == null ? null : proNextdate.trim();
    }

    public Integer getProSosid() {
        return proSosid;
    }

    public void setProSosid(Integer proSosid) {
        this.proSosid = proSosid;
    }

    public Integer getProStaffid() {
        return proStaffid;
    }

    public void setProStaffid(Integer proStaffid) {
        this.proStaffid = proStaffid;
    }
}