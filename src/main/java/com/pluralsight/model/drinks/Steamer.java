package com.pluralsight.model.drinks;

public class Steamer extends Drink {
    private boolean kidsTemp;

    public Steamer(String item, String size, String base, String milk) {
        super(item, size, base, milk);
        this.kidsTemp = false;
    }

    public boolean isKidsTemp() {
        return kidsTemp;
    }

    public void setKidsTemp() {
        this.kidsTemp = true;
        this.temp="Hot";
    }

    @Override
    public void setTemp(String temp) {
        switch(temp){case"Iced"->this.item="Flavored Milk";case"Frozen"->this.item="Milkshake";}
    }

    @Override
    public String displayDrink() {
        StringBuilder drink = new StringBuilder(String.format("Drink: %s %s%n\t- %s%n\t- %s%n\t- %s",this.temp,this.item,this.size,this.base,this.milk));
        if (isKidsTemp()){
            drink.append(String.format("%n\t- Kid's Temperature (180 Degrees)"));
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
