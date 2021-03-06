package com.newcapec.wapcashdesk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @ClassName: com.newcapec.wapcashdesk.controller.IndexController.java
 * @Description:
 *
 * @Copyright 2016-2018 新开普 - Powered By 研发中心
 * @author: 王延飞
 * @date:  2018-07-23 10:10
 * @version V1.0
 */
@Api(value = "收银台", description = "接口说明&测试")
@Controller
public class IndexController {

    /**
     * @param
     * @return java.lang.String
     * @Title: 首页
     * @methodName: html
     * @Description:
     * @author: 王延飞
     * @date: 2018-07-20 17:14
     */
    @ApiOperation(value = "欢迎页", notes = "收银台-欢迎页")
    @GetMapping("/")
    public String index() {

        return "/index.html";
    }
}
