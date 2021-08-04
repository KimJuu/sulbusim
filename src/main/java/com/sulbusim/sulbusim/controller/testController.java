package com.sulbusim.sulbusim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/api/test")
    public String testString(){

        return "테스트입니다.";

    }
}
