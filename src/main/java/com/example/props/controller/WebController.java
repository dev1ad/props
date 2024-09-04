package com.example.props.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Value("${props.name}")
    private String propName;

    @GetMapping("/")
    public String showOutput () {
        System.out.println(propName);

        ManualClass manualClass = new ManualClass();
        manualClass.printPropName();
        return "Hello World!";
    }

}
