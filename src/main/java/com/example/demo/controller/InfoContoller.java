package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/InfoPage")
public class InfoContoller {
    @GetMapping("/info")
    public String getInfo(){
        return "info";
    }

}
