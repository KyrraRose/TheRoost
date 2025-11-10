package com.pluralsight.model;

public class Food extends MenuItem{
    protected boolean isHeated,toGo;

    public Food(double price, String item, boolean isHeated, boolean toGo) {
        super(price, item);
        this.isHeated = isHeated;
        this.toGo = toGo;
    }

    public boolean isHeated() {
        return isHeated;
    }

    public void setHeated(boolean heated) {
        isHeated = heated;
    }

    public boolean isToGo() {
        return toGo;
    }

    public void setToGo(boolean toGo) {
        this.toGo = toGo;
    }

}