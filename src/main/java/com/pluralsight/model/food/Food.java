package com.pluralsight.model;

public class Food extends MenuItem{
    protected boolean toGo;

    public Food(String item, boolean toGo) {
        super(item);
        this.toGo = toGo;
    }

    public boolean isToGo() {
        return toGo;
    }

    public void setToGo(boolean toGo) {
        this.toGo = toGo;
    }
    public String displayFood(){
        return this.item;
    }

}