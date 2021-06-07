package com.company.helloAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseStatus(HttpStatus.OK)
    public String getHello(){
        String output = "Hello, Heroku";
        return output;
    }

    @RequestMapping(value = "/hello/{someName}")
    @ResponseStatus(HttpStatus.OK)
    public String getHelloName(@PathVariable String someName){
        String output = "What's happening, ";
        return output + someName;
    }
}
