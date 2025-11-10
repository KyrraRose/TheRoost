package com.pluralsight.model.food;

import com.pluralsight.model.Food;

public class Bagel extends Food {
    private String portionType;

    public Bagel(double price, String item, boolean isHeated, boolean toGo, String portionType) {
        super(price, item, isHeated, toGo);
        this.portionType = portionType;
        switch(this.portionType){case "Plain"->this.price=1;case "Honey Buttered"->this.price=1.5;case "Sandwich"->this.price=4;}
    }

}
