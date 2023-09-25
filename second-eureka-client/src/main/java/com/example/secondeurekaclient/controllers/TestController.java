package com.example.secondeurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test-2";
    }
}
