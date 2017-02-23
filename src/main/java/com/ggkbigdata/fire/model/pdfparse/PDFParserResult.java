/*
 * File Name：PDFParserResult.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月21日 下午2:42:18
 */
package com.ggkbigdata.fire.model.pdfparse;

import java.util.List;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月21日 下午2:42:18
 */
public class PDFParserResult {
    private Cover cover = null;
    private List<Result> firstPart = null;
    private String secondPart = null;
    private List<Result> thirdPart = null;
    private List<ListResult> forthPart = null;
    private List<ListResult> fifthPart = null;
    private String reportNum = null;
    
    public Cover getCover() {
        return cover;
    }
    public void setCover(Cover cover) {
        this.cover = cover;
    }
    public List<Result> getFirstPart() {
        return firstPart;
    }
    public void setFirstPart(List<Result> firstPart) {
        this.firstPart = firstPart;
    }
    public String getSecondPart() {
        return secondPart;
    }
    public void setSecondPart(String secondPart) {
        this.secondPart = secondPart;
    }
    public List<Result> getThirdPart() {
        return thirdPart;
    }
    public void setThirdPart(List<Result> thirdPart) {
        this.thirdPart = thirdPart;
    }
    public List<ListResult> getForthPart() {
        return forthPart;
    }
    public void setForthPart(List<ListResult> forthPart) {
        this.forthPart = forthPart;
    }
    public List<ListResult> getFifthPart() {
        return fifthPart;
    }
    public void setFifthPart(List<ListResult> fifthPart) {
        this.fifthPart = fifthPart;
    }
    public String getReportNum() {
        return reportNum;
    }
    public void setReportNum(String reportNum) {
        this.reportNum = reportNum;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("PDFParserResult");
        s.append("\n0.{").append(this.cover).append("}>, ");
        s.append("\n1.{").append(firstPart==null?-1:firstPart.size()).append("}>, ").append(this.firstPart);
        s.append("\n2.{").append(secondPart).append("}>, ");
        s.append("\n3.{").append(thirdPart==null?-1:thirdPart.size()).append("}>, ").append(this.thirdPart);
        s.append("\n4.{").append(forthPart==null?-1:forthPart.size()).append("}>, ").append(this.forthPart);
        s.append("\n5.{").append(fifthPart==null?-1:fifthPart.size()).append("}>, ").append(this.fifthPart);
        return s.toString();
    }
}

