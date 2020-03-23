package com.example.demo.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * DemoController
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "/index";
    }

}