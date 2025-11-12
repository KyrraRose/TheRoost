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

    public static String displayOptions(List<String> menuType){

        StringBuilder message = new StringBuilder();
        for(int i=0; i<menuType.size();i++){
            if (i == 0){
                message.append(String.format("✾ %s:%n", menuType.get(i)));
            }  else {
                message.append(String.format("\t\t[%d] %s%n", i, menuType.get(i)));
            }
        }
        message.append("\t\t[0] Nevermind. Goodbye!");
        return message.toString();
    }
}
