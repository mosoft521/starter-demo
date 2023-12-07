package com.gmail.mosoft521.service;

import com.gmail.mosoft521.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {
    @Autowired
    private RobotProperties robotProperties;

    public String sayHello() {
        return "Hello " + robotProperties.getName();
    }
}