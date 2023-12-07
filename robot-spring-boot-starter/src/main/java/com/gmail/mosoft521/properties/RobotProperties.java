package com.gmail.mosoft521.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "robot")
public class RobotProperties {
    private String name;
    private String email;
}