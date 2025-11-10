package com.pluralsight;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    protected HashMap<String,ArrayList<String>> inventory;
    protected ArrayList<String> cafTypes,milks,syrups,toppings,tempTypes,drinkTypes;

    public Inventory() {
        inventory = new HashMap<>();
        cafTypes = new ArrayList<>(List.of("Espresso","Decaf","House Blend","French Roast","Matcha","Chai"));
        milks = new ArrayList<>(List.of("2% Milk","Whole Milk","Oat Milk","Pigeon Milk"));
        syrups = new ArrayList<>(List.of("Chocolate","Vanilla","Caramel","Toffeenut","Cherry","Hazelnut","Pumpkin Spice","Peppermint","Maple Pecan"));
        toppings = new ArrayList<>(List.of("Whipped Cream","Toffee Sprinkles","Chocolate Shavings","Cinnamon Streusel","Cookie Crumbles"));
        tempTypes = new ArrayList<>(List.of("Hot","Iced","Frozen"));
        drinkTypes = new ArrayList<>(List.of("Latte","Drip Coffee","Tea","Steamer"));
        inventory.put("Caffeine Base",cafTypes);
        inventory.put("Milks",milks);
        inventory.put("Syrups",syrups);
        inventory.put("Toppings",toppings);
        inventory.put("Temperature",tempTypes);
        inventory.put("Drinks",drinkTypes);
    }

    public static void displayInventory(){

    }
}
