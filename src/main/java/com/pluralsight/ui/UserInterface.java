package com.pluralsight.ui;

import com.pluralsight.model.Inventory;

import static com.pluralsight.ui.MenuOptions.*;
import static com.pluralsight.ui.MenuUtility.*;
import static com.pluralsight.ui.OrderSystem.*;


public class UserInterface {


    public void displayWelcome(){
        System.out.printf("%s%s%n%s%s%n%s%s%s%n",TEAL,ALT_BORDER_T,MINT,WELCOME_MESSAGE,TEAL,ALT_BORDER_B,RESET);
    }
    public void displayMainMenu(){
        systemDialogue(BROWN,BEIGE,displayMenuWithBack(MAIN));
    }
    public void handleMainSelection(){
        switch(getUserInt()){
            case 1 -> {
                while(true) {
                    displayOrderMenu();
                    handleMenuSelection();
                }
            }
            case 0 -> exit() ;
        }
    }
    public void displayOrderMenu(){
        systemDialogue(TEAL,MINT,"You're placing an order?...Coo.\n\t....What would you like?...");
        systemDialogue(BROWN,BEIGE,displayMenuWithBack(ORDER));
    }


    public void handleMenuSelection(){
        switch(getUserInt()){
            case 1 ->processOrderDrink();
            case 2 -> {systemDialogue(TEAL,MINT,"You are hungry?...We have bagels...Coo.");
                    processOrderFood();}
            case 3 ->{
                        processAddCookie();}
            case 4 ->{ checkout();}
            case 0 ->{ exit();}
        }
    }
    public void run(){
       displayWelcome();
       displayMainMenu();
       handleMainSelection();

    }

}
