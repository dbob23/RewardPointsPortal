package com.SegallDennis.RewardPointsPortal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "hello")
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
