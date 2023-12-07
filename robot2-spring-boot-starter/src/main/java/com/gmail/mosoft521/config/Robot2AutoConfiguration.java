package com.gmail.mosoft521.config;

import com.gmail.mosoft521.controller.Robot2Controller;
import com.gmail.mosoft521.properties.Robot2Properties;
import com.gmail.mosoft521.service.Robot2Service;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Robot2Controller.class, Robot2Service.class})
@EnableConfigurationProperties(Robot2Properties.class)
public class Robot2AutoConfiguration {
}