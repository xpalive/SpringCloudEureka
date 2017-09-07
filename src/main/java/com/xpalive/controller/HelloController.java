package com.xpalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiongp on 2017/9/7.
 */
@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping("/world")
    public String world(){
        return "hello world 876";
    }
}
