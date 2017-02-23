/*
 * File Name：CheckItemDetail.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月22日 上午10:33:18
 */
package com.ggkbigdata.fire.model.reports;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月22日 上午10:33:18
 */
public class CheckItemDetail {
    
    private String reportNum;
    private String itemCode;
    private String checkLevel;
    private String itemName;
    private Integer checkNum;
    private Integer unqualifiedNum;
    
    
    public String getReportNum() {
        return reportNum;
    }
    public void setReportNum(String reportNum) {
        this.reportNum = reportNum;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public String getCheckLevel() {
        return checkLevel;
    }
    public void setCheckLevel(String checkLevel) {
        this.checkLevel = checkLevel;
    }
    public Integer getCheckNum() {
        return checkNum;
    }
    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }
    public Integer getUnqualifiedNum() {
        return unqualifiedNum;
    }
    public void setUnqualifiedNum(Integer unqualifiedNum) {
        this.unqualifiedNum = unqualifiedNum;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

