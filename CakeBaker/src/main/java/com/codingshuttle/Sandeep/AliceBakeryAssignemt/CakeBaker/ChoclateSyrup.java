package com.codingshuttle.Sandeep.AliceBakeryAssignemt.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrupFlavour.env", havingValue = "chocolate")
public class ChoclateSyrup  implements Syrup {
    @Override
    public String getSyrupType() {
        return "Choclate";
    }
}
