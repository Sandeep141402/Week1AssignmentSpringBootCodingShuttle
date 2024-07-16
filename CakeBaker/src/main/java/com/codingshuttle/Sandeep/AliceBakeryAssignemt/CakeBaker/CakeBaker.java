package com.codingshuttle.Sandeep.AliceBakeryAssignemt.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Syrup syrup;

    @Autowired
    Frosting frosting;

    public void cakeBaker(){
        System.out.println("Cake has started baking with frosting "+frosting.getFrostingType() +" syrup on it is "+syrup.getSyrupType());
    }
}
