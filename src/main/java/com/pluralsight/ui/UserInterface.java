package com.pluralsight.ui;

import com.pluralsight.model.Inventory;

import static com.pluralsight.ui.MenuOptions.*;
import static com.pluralsight.ui.MenuUtility.*;


public class UserInterface {
    private final Inventory inventory = Inventory.getInstance();

    public void displayWelcome(){
        System.out.printf("%s%s%n%s%s%n%s%s%s%n",TEAL,ALT_BORDER_T,MINT,WELCOME_MESSAGE,TEAL,ALT_BORDER_B,RESET);
    }
    public void displayMainMenu(){
        systemDialogue(BROWN,BEIGE,displayOptions(MAIN));
    }
    public void handleMainSelection(){
        switch(MenuUtility.getUserInt(MenuUtility.BEIGE)){case 1 -> displayOrderMenu();case 0 -> exit() ;
        }
    }
    public void displayOrderMenu(){
        systemDialogue(TEAL,MINT,"You would like to place an order?...Coo.%n\t....What would you like?...");
        systemDialogue(BROWN,BEIGE,displayOptions(ORDER));
    }

    public void displayAllChoices(){
        for (String type : inventory.getInventory().keySet()) {
            System.out.printf("%s%s:%s%n",MenuUtility.MINT,type,MenuUtility.RESET);
            inventory.displayInventory(type,MenuUtility.BEIGE,MenuUtility.RESET);
        }
    }
    public void handleMenuSelection(int choice){
        switch(MenuUtility.getUserInt(MenuUtility.BEIGE)){
            case 1 -> //drink
             ;
            case 2 -> //Breakfast Item
            ;
            case 3 -> //Cookie
            ;
            case 4 -> //Checkout
            ;
            case 0 -> exit() ;
        }
    }

}
