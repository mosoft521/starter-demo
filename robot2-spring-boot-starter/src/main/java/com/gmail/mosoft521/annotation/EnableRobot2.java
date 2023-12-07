package com.gmail.mosoft521.annotation;

import com.gmail.mosoft521.config.Robot2AutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(Robot2AutoConfiguration.class)
public @interface EnableRobot2 {
}