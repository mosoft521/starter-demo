package com.gmail.mosoft521.controller;

import com.gmail.mosoft521.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/robot")
public class RobotController {
    @Autowired
    private RobotService robotService;

    @GetMapping("/saveHello")
    public String sayHello() {
        return robotService.sayHello();
    }
}