package com.codingshuttle.Sandeep.AliceBakeryAssignemt.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "frostingFlavour.env" , havingValue = "chocolate")
public class ChoclateFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate";
    }
}
