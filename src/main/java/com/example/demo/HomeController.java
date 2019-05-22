package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/2")
    public String aboutus() {
        return "aboutus";
    }

    @RequestMapping("/3")
    public String contactus() {
        return "contactus";


    }
}