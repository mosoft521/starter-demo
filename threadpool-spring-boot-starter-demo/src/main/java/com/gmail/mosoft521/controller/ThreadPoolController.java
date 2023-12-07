package com.gmail.mosoft521.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("/threadPool")
public class ThreadPoolController {

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    @GetMapping("/corePoolSize")
    public String sayHello() {
        return "corePoolSize: " + threadPoolExecutor.getCorePoolSize();
    }
}
