package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstHtmlController  {
    @RequestMapping("/")
    public String toFirstHtml(){
        return "getUser";
    }
}