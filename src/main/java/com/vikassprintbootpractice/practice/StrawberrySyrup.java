package com.vikassprintbootpractice.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "flavour.env",havingValue = "strawberry")

public class StrawberrySyrup implements Syrup{
    public String getSyrup(){
        return "Strawberry Syrup";
    }
}
