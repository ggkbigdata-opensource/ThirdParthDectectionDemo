/*
 * File Name：CheckReportServiceImpl.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月21日 下午4:37:46
 */
package com.ggkbigdata.fire.servie.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ggkbigdata.fire.mapper.CheckReportMapper;
import com.ggkbigdata.fire.model.reports.CheckItemDetail;
import com.ggkbigdata.fire.model.reports.CheckReportInfo;
import com.ggkbigdata.fire.model.reports.CheckReportResultStat;
import com.ggkbigdata.fire.servie.CheckReportService;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月21日 下午4:37:46
 */
@Service
public class CheckReportServiceImpl implements CheckReportService{
    @Autowired
    private CheckReportMapper mapper;
    
    @Override
    public String saveCheckReportInfo(JSONObject info) {
        CheckReportInfo checkInfo = new CheckReportInfo();
        checkInfo.setAgentName(info.getString("agentName") != null ? 
                info.getString("agentName").trim() : null);
        checkInfo.setContactFax(info.getString("contactFax") != null ? 
                info.getString("contactFax").trim() : null);
        checkInfo.setContactPostCode(info.getString("contactPostcode") != null ?
                info.getString("contactPostcode").trim() :null);
        checkInfo.setContactTel(info.getString("contactTel") != null ? 
                info.getString("contactTel").trim() : null);
        checkInfo.setMessage(info.getString("message") != null ? 
                info.getString("message").trim() : null);
        checkInfo.setProjectAddress(info.getString("projectAddress") != null ? 
                info.getString("projectAddress").trim() : null);
        checkInfo.setProjectName(info.getString("projectName").trim() != null ?
                info.getString("projectName") : null);
        checkInfo.setQaAddress(info.getString("qaAddress") != null ? 
                info.getString("qaAddress").trim() : null);
        checkInfo.setQaName(info.getString("qaName") != null ? 
                info.getString("qaName").trim() : null);
        checkInfo.setReportNum(info.getString("reportNum") != null ? 
                info.getString("reportNum").trim() : null);
        checkInfo.setReportConclusion(info.getString("reportConclusion") != null ? 
                info.getString("reportConclusion").trim() : null);
        mapper.saveCheckReportInfo(checkInfo);
        return "success";
    }

    @Override
    public void saveCheckReportResultStat(JSONArray resultStatObj, 
            String reportNum) {
        mapper.deleteCheckReportResultStatByReportNum(reportNum);
        List<CheckReportResultStat> list = new ArrayList<CheckReportResultStat>();
        int size = resultStatObj.size();
        for(int index = 0; index < size; index++) {
            CheckReportResultStat stat = new CheckReportResultStat();
            JSONObject obj = resultStatObj.getJSONObject(index);
            stat.setCheckNum(obj.getString("value1") != null ? 
                    Integer.parseInt(obj.getString("value1")) : 0);
            stat.setItemCode(obj.getString("label") != null ?
                    obj.getString("label") : null);
            stat.setItemName(obj.getString("name") != null ?
                    obj.getString("name") : null);
            stat.setReportNum(reportNum);
            stat.setCheckLevel(obj.getString("level") != null ?
                    obj.getString("level") : null);
            stat.setUnqualifiedNum(obj.getString("value2") != null ?
                    Integer.parseInt(obj.getString("value2")) : 0);
            list.add(stat);
        }
        mapper.saveCheckReportResultStat(list);
    }

    @Override
    public void saveCheckItemDetail(JSONArray resultDetailObj, String reportNum) {
        mapper.deleteCheckItemDetailByReportNum(reportNum);
        List<CheckItemDetail> list = new ArrayList<CheckItemDetail>();
        int size = resultDetailObj.size();
        for(int index = 0; index < size; index++) {
            JSONObject obj = resultDetailObj.getJSONObject(index);
            CheckItemDetail detail = new CheckItemDetail();
            detail.setCheckLevel(obj.getString("level") != null ?
                    obj.getString("level").trim() : null);
            detail.setCheckNum((obj.getString("value1") != null 
                    && !"".equals(obj.getString("value1").trim())) ?
                    Integer.parseInt(obj.getString("value1").trim()) : null);
            detail.setItemCode(obj.getString("label") != null ?
                    obj.getString("label").trim() : null);
            detail.setReportNum(reportNum);
            detail.setUnqualifiedNum((obj.getString("value2") != null 
                    && !"".equals(obj.getString("value2").trim())) ?
                    Integer.parseInt(obj.getString("value2").trim()) : null);
            detail.setItemName(obj.getString("name") != null ?
                    obj.getString("name") : null);
            list.add(detail);
        }
        mapper.saveCheckItemDetail(list);
    }

}

