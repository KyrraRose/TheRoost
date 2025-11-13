package com.pluralsight.model.drinks;

public class Tea extends Drink {
    private boolean steamMilk,addTeaBag;
    private int teaBags;

    public Tea(String item, String size, String base, String milk) {
        super(item, size, base, milk);
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
    @Override
    public String displayDrink() {
        StringBuilder drink = new StringBuilder(String.format("Drink: %s Tea%n\t- %s%n\t- %s",this.temp,this.size,this.base));
        if (isSteamMilk()){
            drink.append(String.format("%n\t- Steamed %s",this.milk));
        }
        if (this.addTeaBag){
            drink.append(String.format("%n\t- %d Tea Bags",this.teaBags));
        }

        if (!this.syrup.isEmpty()){
            for(String s :this.syrup){
                drink.append(String.format("%n\t- %s",s));
            }
        }
        if (!this.toppings.isEmpty()){
            for(String t :this.toppings){
                drink.append(String.format("%n\t- %s",t));
            }
        }

        drink.append(String.format("%nDrink Total: $%.2f",this.price));
        return drink.toString();
    }
}
