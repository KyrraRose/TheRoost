package com.pluralsight.model.drinks;

import java.util.ArrayList;

public class SiphonCoffee extends Drink {
    private boolean roomForCream,addShot;
    private int numShots;

    public SiphonCoffee(String item, String size, String base, String milk) {
        super(item, size, base, milk);
        this.roomForCream = false;
        this.addShot = false;
        this.numShots = 0;
    }

    public boolean isAddShot() {
        return addShot;
    }

    public void setAddShot(int numShots) {
        this.addShot = true;
        this.price += .5*numShots;
    }

    public void setRoomForCream(){
        this.roomForCream = true;
        this.milk = "None";
    }

    public boolean isRoomForCream() {
        return roomForCream;
    }

    @Override
    public String displayDrink() {
        StringBuilder drink = new StringBuilder(String.format("Drink: %s %s%n\t- %s%n\t- %s%n\t- %s",this.temp,this.item,this.size,this.base,this.milk));
        if (isRoomForCream()){
            drink.append(String.format("%n\t- Room for Cream"));
        }
        if (isAddShot()){
            drink.append(String.format("%n\t- %d Extra Shots +$%.2f",this.numShots,(.5*numShots)));
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
