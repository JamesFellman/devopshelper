package com.devopshelper.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by James Fellman on 8/31/2017
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
}
