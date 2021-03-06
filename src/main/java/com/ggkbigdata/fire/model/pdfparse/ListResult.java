/*
 * File Name：Result.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月21日 下午2:38:38
 */
package com.ggkbigdata.fire.model.pdfparse;

import java.util.List;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月21日 下午2:38:38
 */
public class ListResult {
    private String label;
    private List<String> nums;
    private List<String> strings;
    private String message;// 错误信息记录
    
    public ListResult(String label, List<String> nums, List<String> strings){
        this.label = label;
        this.nums = nums;
        this.strings = strings;
    }
    public ListResult(String label, List<String> strings){
        this.label = label;
        this.strings = strings;
    }
    public String getLabel() {
        return label;
    }
    public List<String> getStrings() {
        return this.strings;
    }
    public List<String> getNums(){
        return this.nums;
    }
    public String toString(){
        return "{label:'"+this.label+"', num:"+this.nums+", strings: "+this.strings+"}";
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
