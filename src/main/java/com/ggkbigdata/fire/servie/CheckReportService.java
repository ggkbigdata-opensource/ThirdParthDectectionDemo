/*
 * File Name：CheckReportService.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月21日 下午4:37:13
 */
package com.ggkbigdata.fire.servie;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月21日 下午4:37:13
 */
public interface CheckReportService {
    
    /**
     * @author lcc
     * @version 1.0
     * @function 保存检测报告的meta信息(检测报告的封面基础信息)
     */
    public String saveCheckReportInfo(JSONObject info);
    /**
     * @author lcc
     * @version 1.0
     * @function 批量保存单项评定结果
     */
    public void saveCheckReportResultStat(JSONArray resultStatObj, String reportNum);
    
    /**
     * @author lcc
     * @version 1.0
     * @function 批量保存检测情况统计表
     */
    public void saveCheckItemDetail(JSONArray resultStatObj, String reportNum);
}

