package com.zjwmybatis.mybatisplus.mysql.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {
@RequestMapping(value = {"","/index"})
    public String index(Model model){
        return "index";
    }

}
