package com.pluralsight.ui;

import com.pluralsight.model.Inventory;

public class UserInterface {
    private final Inventory inventory = Inventory.getInstance();

    public void displayWelcome(){
        System.out.printf("%s%s%n%s%s%n%s%s%s%n",MenuUtility.TEAL,MenuUtility.BORDER_T,MenuUtility.MINT,MenuUtility.WELCOME_MESSAGE,MenuUtility.TEAL,MenuUtility.BORDER_B,MenuUtility.RESET);
    }
    public void displayMainMenu(){
        System.out.printf("%s%s%s%n",MenuUtility.BROWN,MenuUtility.ALT_BORDER_T,MenuUtility.RESET);
        System.out.printf("%s\t[1] I'd like a new order.%n\t[0] Nevermind. Goodbye!%s%n",MenuUtility.BEIGE,MenuUtility.RESET);
        System.out.printf("%s%s%s%n",MenuUtility.BROWN,MenuUtility.ALT_BORDER_B,MenuUtility.RESET);
    }
    public void handleMainSelection(){

    }

    public void displayAllChoices(){
        for (String type : inventory.getInventory().keySet()) {
            System.out.printf("%s%s:%s%n",MenuUtility.MINT,type,MenuUtility.RESET);
            inventory.displayInventory(type,MenuUtility.BEIGE,MenuUtility.RESET);
        }
    }
    public void handleMenuSelection(int choice){

    }

}
