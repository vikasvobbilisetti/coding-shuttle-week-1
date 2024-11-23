package com.vikassprintbootpractice.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")//to create a multiple instances for bean
    Apple apple() {
        return new Apple();
    }
}
