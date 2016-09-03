package com.yxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yangxiaochen on 16/9/3.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/index2" ,method = RequestMethod.GET)
    public String index() {
        return "index2";
    }
}
