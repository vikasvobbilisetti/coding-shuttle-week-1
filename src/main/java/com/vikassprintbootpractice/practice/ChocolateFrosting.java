package com.vikassprintbootpractice.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "flavour.env",havingValue = "chocolate")

public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrosting() {
        return "Chocolate Frosting";
    }
}
