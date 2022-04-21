package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
//开启自动装配
//@EnableAutoConfiguration
//其他类路径跳转
@SpringBootApplication
public class MyApplication {

/*
    @RequestMapping("/")
    String home(){
        return "Hello Word!";
    }
*/


    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        SpringApplication.run(MyApplication.class,args);
    }
}
