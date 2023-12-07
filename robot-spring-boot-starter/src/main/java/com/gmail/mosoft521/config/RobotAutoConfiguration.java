package com.gmail.mosoft521.config;

import com.gmail.mosoft521.controller.RobotController;
import com.gmail.mosoft521.properties.RobotProperties;
import com.gmail.mosoft521.service.RobotService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RobotController.class, RobotService.class})
@EnableConfigurationProperties(RobotProperties.class)
public class RobotAutoConfiguration {
}