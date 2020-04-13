package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloWorldController
{
    @RequestMapping("/")
    @ResponseBody
    public String home()
    {
        return "hello world spring boot";
    }
    
    @RequestMapping("/home")
    @ResponseBody
    public String home1()
    {
        return "hello world spring boot11111";
    }
}
