package com.example.teamproject2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public @ResponseBody String hello(){
        return "HELLO (●'◡'●)";
    }

}
