package com.vikassprintbootpractice.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "flavour.env",havingValue = "strawberry")

public class StrawberryFrosting implements Frosting{

    @Override
    public String getFrosting() {
        return "Strawberry Frosting";
    }
}
