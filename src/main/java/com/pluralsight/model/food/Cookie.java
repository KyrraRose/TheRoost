package com.pluralsight.model.food;

import com.pluralsight.model.Food;

public class Cookie extends Food {
    public Cookie(String item, boolean toGo) {
        super(item, toGo);
        this.price = .75;
    }
}
