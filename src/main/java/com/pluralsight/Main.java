package com.pluralsight;

import com.pluralsight.model.*;
import com.pluralsight.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();


        System.out.println("\033[38;2;0;128;128mTeal text!\033[0m");
        System.out.println("\033[38;2;152;255;152mGreen text!\033[0m");
        System.out.println("\033[38;2;111;78;55mBrown text!\033[0m");
        System.out.println("\033[38;2;245;245;220mBeige text!\033[0m");
        System.out.println();
        ui.displayWelcome();
        ui.displayMainMenu();
        ui.handleMainSelection();
        ui.handleMenuSelection();

        //ui.displayAllChoices();
    }
}
