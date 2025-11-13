package com.pluralsight.model.drinks;

public class Latte extends Drink {
    private boolean dry,addShot,addMilk;
    private int numShots;

    public Latte(String item, String size, String base, String milk) {
        super(item,size,base,milk);
        this.numShots = 2;
        this.addShot = false;
    }

    //dry means extra foam, like a cappuccino
    public boolean isDry() {
        return dry;
    }

    public void setDry(boolean dry) {
        this.dry = dry;
    }

    public boolean isAddShot() {
        return addShot;
    }

    public void setAddShot(int numShots) {
        this.addShot = true;
        this.numShots += numShots;
        this.price += .5*numShots;
    }

    public boolean isAddMilk() {
        return addMilk;
    }

    public void setAddMilk(boolean addMilk) {
        this.addMilk = addMilk;
    }

    //keeping these in case customer wants to change their order
    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    @Override
    public String displayDrink() {
        StringBuilder drink = new StringBuilder(String.format("Drink: %s %s%n\t- %s%n\t- %s%n\t- %s",this.temp,this.item,this.size,this.base,this.milk));
        if (isDry()){
            drink.append(String.format("%n\t- Dry"));
        }
        if (isAddShot()){
            drink.append(String.format("%n\t- %d Extra Shots +$%.2f",this.numShots-2,(.5*(numShots-2))));
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
