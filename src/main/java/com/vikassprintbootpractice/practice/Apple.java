package com.vikassprintbootpractice.practice;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


public class Apple {
    public void getAppleColour(String color) {
        System.out.println("Apple colour is " + color);
    }
    @PostConstruct
    public void methodbeforeappleused() {
        System.out.println("Apple colour is before");
    }
}
