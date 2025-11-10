package com.pluralsight.model.drinks;

public class Tea extends Drink {
    private boolean steamMilk,addTeaBag;
    private int teaBags;

    public Tea(double price, String item, String size, String base, String milk) {
        super(price, item, size, base, milk);
        this.steamMilk = false;
        this.addTeaBag = false;
        this.teaBags = 1;
        if (this.size.equals("Large")){this.teaBags=2;}
    }

    public boolean isSteamMilk() {
        return steamMilk;
    }

    public void setSteamMilk() {
        this.steamMilk = true;
    }

    public int getTeaBags() {
        return teaBags;
    }

    public void setTeaBags(int teaBags) {
        this.teaBags = teaBags;
    }

    //maybe we want extra tea bags
    public boolean isAddTeaBag() {
        return addTeaBag;
    }

    public void setAddTeaBag() {
        this.addTeaBag = true;
        this.teaBags += 1;
    }
}
