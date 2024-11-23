package com.vikassprintbootpractice.practice;
import com.vikassprintbootpractice.practice.ChocolateSyrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBake
{
    @Autowired
    private Frosting frosting;

    @Autowired
    private Syrup syrup;


    public void bakecake(){
        System.out.println("Cake Bake");
        System.out.println("Baking cake with "+frosting.getFrosting()+" and "+syrup.getSyrup());
    }
}
