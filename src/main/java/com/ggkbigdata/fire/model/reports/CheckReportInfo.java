/*
 * File Name：CheckReportInfo.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月21日 下午4:16:53
 */
package com.ggkbigdata.fire.model.reports;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月21日 下午4:16:53
 */
public class CheckReportInfo {
    
    private String reportNum;
    private String projectName;
    private String projectAddress;
    private String agentName;
    private String qaName;
    private String qaAddress;
    private String contactTel;
    private String contactFax;
    private String contactPostCode;
    private String message;
    private String reportConclusion;
    
    public String getReportNum() {
        return reportNum;
    }
    public void setReportNum(String reportNum) {
        this.reportNum = reportNum;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectAddress() {
        return projectAddress;
    }
    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }
    public String getAgentName() {
        return agentName;
    }
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
    public String getQaName() {
        return qaName;
    }
    public void setQaName(String qaName) {
        this.qaName = qaName;
    }
    public String getQaAddress() {
        return qaAddress;
    }
    public void setQaAddress(String qaAddress) {
        this.qaAddress = qaAddress;
    }
    public String getContactTel() {
        return contactTel;
    }
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }
    public String getContactFax() {
        return contactFax;
    }
    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }
    public String getContactPostCode() {
        return contactPostCode;
    }
    public void setContactPostCode(String contactPostCode) {
        this.contactPostCode = contactPostCode;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getReportConclusion() {
        return reportConclusion;
    }
    public void setReportConclusion(String reportConclusion) {
        this.reportConclusion = reportConclusion;
    }
}

