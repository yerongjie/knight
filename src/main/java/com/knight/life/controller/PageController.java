package com.knight.life.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String index(){
        int a = 10;
        return "main";
    }
}
