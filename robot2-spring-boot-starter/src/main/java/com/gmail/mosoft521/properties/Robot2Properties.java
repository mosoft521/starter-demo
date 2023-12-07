package com.gmail.mosoft521.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "robot2")
public class Robot2Properties {
    private String name;
    private String email;
}