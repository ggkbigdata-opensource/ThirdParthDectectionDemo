/*
 * File Name：CheckReportMapper.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月21日 下午4:21:09
 */
package com.ggkbigdata.fire.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ggkbigdata.fire.model.reports.CheckItemDetail;
import com.ggkbigdata.fire.model.reports.CheckReportInfo;
import com.ggkbigdata.fire.model.reports.CheckReportResultStat;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月21日 下午4:21:09
 */
public interface CheckReportMapper {
    /**
     * @author lcc
     * @version 1.0
     * @function 保存检测报告封面 
     */
    public void saveCheckReportInfo(@Param("info") CheckReportInfo info);
    /**
     * @author lcc
     * @version 1.0
     * @function 批量保存单项评定结果Item
     */
    public void saveCheckReportResultStat(@Param("list") List<CheckReportResultStat> list);
    
    /**
     * @author lcc
     * @version 1.0
     * @function 删除指定检测报告的单项评定结果
     */
    public void deleteCheckReportResultStatByReportNum(@Param("reportNum") String reportNum);
    
    /**
     * @author lcc
     * @version 1.0
     * @function 批量保存检测情况统计表详细信息
     */
    public void saveCheckItemDetail(@Param("list")List<CheckItemDetail> list);
    
    /**
     * @author lcc
     * @version 1.0
     * @function 删除制定检测报告的检测情况统计信息
     */
    public void deleteCheckItemDetailByReportNum(@Param("reportNum") String reportNum);
    
}

