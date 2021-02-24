package com.hyq.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanke
 * @date 2020/7/14 下午4:54
 */
@RestController
public class HealthController {

    @RequestMapping("/health")
    public Object health() {
        return "health";
    }


}
