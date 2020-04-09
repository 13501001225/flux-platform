package com.gw.website.flux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * gaowei
 * 2020-04-09 20:52
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public  String index(){
        return "index";
    }

    @RequestMapping("/a")
    public  String a(){
        return "a";
    }

    @RequestMapping("/b")
    public String b(){
        return "b";
    }
}