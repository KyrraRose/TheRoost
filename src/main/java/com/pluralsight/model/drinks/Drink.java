package com.pluralsight.model.drinks;

import com.pluralsight.model.MenuItem;

import java.util.List;

public abstract class Drink extends MenuItem {
    protected String size,temp,base,milk;
    protected List<String> syrup,toppings;
    //some of these will have an assumed default, and we want the option for multiple syrups


    public Drink(String item, String size, String base, String milk) {
        super(item);
        this.size = size;
        this.base = base;
        this.syrup = null;
        this.toppings = null;
        this.temp = "Hot";
        this.milk = milk;
        switch(this.size){case "Small"->this.price=1;case "Medium"->this.price=1.5;case "Large"->this.price=2;}
        if (!this.base.equals("None")){
            switch(this.size){case "Small"->this.price+=.5;case "Medium"->this.price+=1;case "Large"->this.price+=1.5;}
        }
        if(!this.milk.equals("None")){
            switch(this.size){case "Small"->this.price+=.25;case "Medium"->this.price+=.5;case "Large"->this.price+=.75;}
        }
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }


    public List<String> getSyrup() {
        return syrup;
    }

    public void setSyrup(String syrup) {
        this.syrup.add(syrup) ;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings.add(toppings);
    }

    public String displayDrink(){
        StringBuilder drink = new StringBuilder(String.format("Drink: %s %s%n\t- %s%n\t- %s%n\t- %s",this.temp,this.item,this.size,this.base,this.milk));
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
