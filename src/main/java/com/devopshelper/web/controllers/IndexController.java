package com.devopshelper.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by James Fellman on 08/31/2017
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "index";

    }
}
