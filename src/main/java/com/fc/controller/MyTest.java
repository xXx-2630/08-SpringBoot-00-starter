package com.fc.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@EnableAutoConfiguration
public class MyTest {
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        SpringApplication.run(MyTest.class,args);
    }
}
