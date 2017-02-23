/*
 * File Name：ReportViewController.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月22日 下午2:00:35
 */
package com.ggkbigdata.fire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月22日 下午2:00:35
 */
@Controller
public class ReportViewController {
    @RequestMapping("/getReportPage")
    String getReport() {
        return "report/getReportPage";
    }
    
    @RequestMapping("/showAbstractReportPage")
    String reportAbstract() {
        return "report/showAbstractReportPage";
    }
    
    @RequestMapping("/showDetailReportPage")
    String frequentBusines() {
        return "report/showDetailReportPage";
    }
    
    @RequestMapping("/404")
    String pageNotFound() {
        return "report/404";
    }
    
    @RequestMapping("/505")
    String visitError() {
        return "report/505";
    }
}

