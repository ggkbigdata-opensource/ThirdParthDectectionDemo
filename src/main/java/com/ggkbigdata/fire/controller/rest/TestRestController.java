/*
 * File Name：TestRestController.java
 *
 * Copyrighe：copyright@2017 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2017年2月20日 下午5:26:55
 */
package com.ggkbigdata.fire.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2017年2月20日 下午5:26:55
 */
@RestController
public class TestRestController {
    
    @RequestMapping(value = {"/test" }, method = RequestMethod.GET)
    public String updateHotWord(@RequestParam String test) {
        return "test:" + test;
    }
}

