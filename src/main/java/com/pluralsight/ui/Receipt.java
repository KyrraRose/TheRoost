package com.pluralsight.ui;

import com.pluralsight.model.MenuItem;
import com.pluralsight.model.drinks.Drink;
import com.pluralsight.model.food.Food;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static com.pluralsight.ui.MenuUtility.*;

public class Receipt<T extends MenuItem> {
    private ArrayList<T> receipt;
    private double orderTotal;
    private LocalDateTime now;
    private String saveTime;




    public Receipt() {
        this.receipt = new ArrayList<>();
        this.orderTotal = 0;
        this.now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        this.saveTime= now.format(format);
    }


    // Remove or clear if needed
    public void clearItems() {
        this.receipt.clear();
    }

    public void addToReceipt(T item){
        receipt.add(item);
    }

    public ArrayList<T> getReceipt() {
        return this.receipt;
    }

    public void setReceipt(ArrayList<T> receipt) {
        this.receipt = receipt;
    }

    public double getOrderTotal() {
        this.orderTotal=0;
        for(T item : this.receipt){
            this.orderTotal+= item.calculateTotal();
        }
        return this.orderTotal;
    }
    public String displayReceipt(){
        StringBuilder receipt = new StringBuilder(String.format("\n           RECEIPT - CUSTOMER COPY\n        %10tD        %14tr\n\n\n  ✾Drinks:",this.now,this.now));

        for (MenuItem i : this.receipt){
            if (i instanceof Drink){receipt.append(String.format("%n%s",i.formatForReceipt()));}
        }
        receipt.append("\n\n  ✾Food Items:");
        for (MenuItem i : this.receipt){
            if (i instanceof Food){receipt.append(String.format("%n%s",i.formatForReceipt()));}
        }
        receipt.append(String.format("\n\n\t\t\t\t≪ °❈ Total Due: $%-14.2f\n",getOrderTotal()));
        return receipt.toString();
    }
    public void saveReceipt(){
        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("src/main/resources/receipts/" + saveTime + ".txt"));
            buffWriter.write(String.format("%s", R_BORDER_T));
            buffWriter.write(displayReceipt());
            buffWriter.write(String.format("%s",R_BORDER_B));
            buffWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
