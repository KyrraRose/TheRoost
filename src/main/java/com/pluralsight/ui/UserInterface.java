package com.pluralsight.ui;

import com.pluralsight.model.Inventory;

public class UserInterface {
    private final Inventory inventory = Inventory.getInstance();

    public void displayWelcome(){

    }
    public void displayMainMenu(String type){

    }
    public void displayAllChoices(String type){
        System.out.println(type+":");
        for (int i=1;i<=inventory.get(type).size();i++){
            System.out.printf("[%d] %s\n",i,inventory.get(type).get(i-1));
        }
    }
    public void handleMenuSelection(int choice){

    }

}
