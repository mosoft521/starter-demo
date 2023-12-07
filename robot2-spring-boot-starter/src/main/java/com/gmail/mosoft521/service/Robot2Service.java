package com.gmail.mosoft521.service;

import com.gmail.mosoft521.properties.Robot2Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Robot2Service {
    @Autowired
    private Robot2Properties robot2Properties;

    public String sayHello() {
        return "Hello2 " + robot2Properties.getName();
    }
}