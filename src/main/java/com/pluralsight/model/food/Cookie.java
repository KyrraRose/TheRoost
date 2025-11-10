package com.pluralsight.model.food;

import com.pluralsight.model.Food;

public class Cookie extends Food {
    public Cookie(double price, String item, boolean isHeated, boolean toGo) {
        super(price, item, isHeated, toGo);
        this.isHeated = false;
        this.price = .5;
    }
}
