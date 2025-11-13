package com.pluralsight.model;

public abstract class MenuItem {
    protected double price,upCharge;
    protected String item;

    public MenuItem(String item) {
        this.price = 0;
        this.upCharge = 0;
        this.item = item;
    }

    public  double calculateTotal(){
        return this.price;
    }
}
