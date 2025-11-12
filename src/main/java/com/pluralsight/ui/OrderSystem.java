package com.pluralsight.ui;

import com.pluralsight.model.Inventory;

import java.util.List;

import static com.pluralsight.ui.MenuUtility.*;

public class OrderSystem {
    private static final Inventory inventory = Inventory.getInstance();



    //drink methods
    public static void processOrderDrink(){
        String type = "" ;
        switch(getUserInt(BEIGE)){
            case 1 -> {
                type = "Latte";
                System.out.println(askIngredient("Caffeine Base"));;
            }
            case 2 -> type = "Siphon Coffee";
            case 3 -> type = "Tea";
            case 4 -> type = "Steamer";
        }
    }
    public static String askIngredient(String ingredient){
        systemDialogue(BROWN,BEIGE,inventory.displayInventory(ingredient));
        int want = getUserInt(BEIGE)-1;
        String choice = inventory.getInventory().get(ingredient).get(want);
        return choice;
    }





    public static void processOrderFood(){
        System.out.println("Processing!");
    }
    public static void processAddCookie(){
        System.out.println("Processing!");
    }
    public static void checkout(){
        System.out.println("Processing!");
    }

    public void displayAllChoices(){
        for (String type : inventory.getInventory().keySet()) {
            System.out.printf("%s%s:%s%n",MenuUtility.MINT,type,MenuUtility.RESET);
            inventory.displayInventory(type);
        }
    }

}
