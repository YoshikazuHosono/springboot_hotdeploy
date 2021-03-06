package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Sorry " + name + " ... I'm cold ...";
//        return "Hello " + name + " ! I'm hot !!!";
    }

}
