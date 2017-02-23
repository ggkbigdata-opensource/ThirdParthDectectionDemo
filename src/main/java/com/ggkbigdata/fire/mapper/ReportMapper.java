/*
 * File Name：ReportMapper.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月21日 上午9:15:27
 */
package com.ggkbigdata.fire.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ggkbigdata.fire.model.ReportItem;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月21日 上午9:15:27
 */
public interface ReportMapper {
    public List<ReportItem> getReportItemById(@Param("reportNum") String reportNum) ;
    public void saveReportResult (@Param("reportNum") String reportNum, 
                                  @Param("score") double score, 
                                  @Param("reportLevel") String reportLevel);
    public List<String> getReportList();
}

