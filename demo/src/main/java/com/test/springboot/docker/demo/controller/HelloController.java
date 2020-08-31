package com.test.springboot.docker.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Walker Wang
 * @date 08/31/20 15:40
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello walkerw";
    }
}
