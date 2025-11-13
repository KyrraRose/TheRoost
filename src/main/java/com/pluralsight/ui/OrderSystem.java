package com.pluralsight.ui;

import com.pluralsight.model.Inventory;
import com.pluralsight.model.drinks.*;

import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.ui.MenuOptions.*;
import static com.pluralsight.ui.MenuUtility.*;

public class OrderSystem {
    private static final Inventory inventory = Inventory.getInstance();



    //drink methods
    public static void processOrderDrink(){
        String type = "" ;
        switch(getUserInt(BEIGE)){
            case 1 -> {
                buildLatte();
            }
            case 2 -> type = "Siphon Coffee";
            case 3 -> type = "Tea";
            case 4 -> type = "Steamer";
        }
    }
    public static String askIngredient(String ingredient,String dialogue){
        systemDialogue(TEAL,MINT,dialogue);
        systemDialogue(BROWN,BEIGE,inventory.displayInventory(ingredient));
        return inventory.getInventory().get(ingredient).get(getUserInt(BEIGE)-1);

    }
    public static String askKind(List<String> menu,String dialogue){
        systemDialogue(TEAL,MINT,dialogue);
        systemDialogue(BROWN,BEIGE,displayOptions(menu));
        return menu.get(getUserInt(BEIGE)-1);
    }
    public static String askKindWithPrice(List<String> menu,String dialogue){
        systemDialogue(TEAL,MINT,dialogue);
        systemDialogue(BROWN,BEIGE,displaySizePrice(menu));
        return menu.get(getUserInt(BEIGE)-1);
    }
    public static Latte buildLatte(){
        String size, base, milk;

        size = askKindWithPrice(SIZE,"Coo...What size would you like?...");
        base = askIngredient("Caffeine Base","Would you like espresso..\n\tor something else?...Coo.");
        milk = askIngredient("Milks","..Coo. You want pigeon milk in that?");
        return new Latte("Latte",size,base,milk);
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
