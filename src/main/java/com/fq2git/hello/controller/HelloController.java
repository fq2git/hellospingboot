package com.fq2git.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * github 20190114
     * @return
     */
    @RequestMapping("/hello")
    public String HelloSpringBoot(){
        return "Hello SpringBoot!!";
    }
}
