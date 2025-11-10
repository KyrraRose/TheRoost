package com.pluralsight.ui;

import java.util.Scanner;

public class MenuUtility {


    public static int getUserInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type Here: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    public static String getUserString(String prompt){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    public static boolean getYesNo(String prompt){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        boolean yesNo = false;
        switch(input){case "Yes","Y","y","yes","yeah","yep","yea","ok","alright"->yesNo=true;}
        return yesNo;
    }

}
