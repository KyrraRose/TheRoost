package com.pluralsight.ui;

import java.util.ArrayList;
import java.util.List;

public class MenuOptions {
    public static final List<String> MAIN = new ArrayList<>(List.of("Main Menu","Order"));
    public static final List<String> ORDER = new ArrayList<>(List.of("Order Menu","Drink","Breakfast Item","Cookie","Checkout"));

    public static final List<String> DESCRIPTIONS = new ArrayList<>(List.of(
            "Our Available Drinks",
            "Latte: Rich espresso balanced with steamed milk and a light layer of foam.",
            "Siphon Coffee: Full-bodied coffee brewed with hot water through a siphon.",
            "Tea: Smooth, earthy teas brewed gently with hot water. Milk optional.",
            "Steamer: Comforting warm,steamed milk with optional flavors."));

    public static final List<String> SIZE = new ArrayList<>(List.of("Sizes","Small","Medium","Large"));
    public static final List<String> TEMP = new ArrayList<>(List.of("Styles","Hot","Iced","Frozen"));
    public static final List<String> BAGELS = new ArrayList<>(List.of("Bagel Options","Plain","Honey Buttered","Sandwich"));


    public static String displayOptions(List<String> menuType){

        StringBuilder message = new StringBuilder();
        for(int i=0; i<menuType.size();i++){
            if (i == 0){
                message.append(String.format("✾ %s:", menuType.get(i)));
            }  else {
                message.append(String.format("%n\t\t[%d] %s", i, menuType.get(i)));
            }
        }
        return message.toString();
    }
    public static String displaySizePrice(List<String> menuType){

        StringBuilder message = new StringBuilder();
        double price = 1;
        for(int i=0; i<menuType.size();i++){

            if (i == 0){
                message.append(String.format("✾ %s:", menuType.get(i)));
            }  else {
                message.append(String.format("%n\t\t[%d] %s - $%.2f", i, menuType.get(i),price));
                price +=.5;
            }
        }
        return message.toString();
    }
    public static String displayFoodPrice(List<String> menuType){

        StringBuilder message = new StringBuilder();
        double price = 1;
        for(int i=0; i<menuType.size();i++){

            if (i == 0){
                message.append(String.format("✾ %s:", menuType.get(i)));
            } else if (i==3) {
                price = 4;
            } else {
                price +=.5;
            }
            message.append(String.format("%n\t\t[%d] %s - $%.2f", i, menuType.get(i),price));
        }
        return message.toString();
    }


}
