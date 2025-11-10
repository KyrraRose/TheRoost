package com.pluralsight.model.drinks;

public class Steamer extends Drink {
    private boolean kidsTemp;

    public Steamer(double price, String item, String size, String base, String milk) {
        super(price, item, size, base, milk);
        this.kidsTemp = false;
    }

    public boolean isKidsTemp() {
        return kidsTemp;
    }

    public void setKidsTemp() {
        this.kidsTemp = true;
    }
}
