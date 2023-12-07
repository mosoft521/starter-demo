package com.gmail.mosoft521.controller;

import com.gmail.mosoft521.service.Robot2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/robot2")
public class Robot2Controller {
    @Autowired
    private Robot2Service robot2Service;

    @GetMapping("/saveHello2")
    public String sayHello() {
        return robot2Service.sayHello();
    }
}