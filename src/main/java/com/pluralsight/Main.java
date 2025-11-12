package com.pluralsight;

import com.pluralsight.model.*;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();

        inventory.displayInventory("Bagels");
        System.out.println("\033[38;2;0;128;128mTeal text!\033[0m");
        System.out.println("\033[38;2;152;255;152mGreen text!\033[0m");
        System.out.println("\033[38;2;111;78;55mBrown text!\033[0m");
        System.out.println("\033[38;2;245;245;220mBeige text!\033[0m");
    }
}
