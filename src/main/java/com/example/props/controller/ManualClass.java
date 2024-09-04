package com.example.props.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManualClass {


    @Value("${props.name}")
    private String propName;

    public void printPropName () {
        System.out.println(propName);
    }

}
