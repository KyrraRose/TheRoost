package com.pluralsight.model.food;


public class Cookie extends Food {
    @Override
    public String displayItem() {
        return "";
    }

    public Cookie(String item, boolean toGo) {
        super(item, toGo);
        this.price = .75;
    }
    public String formatForReceipt() {
        StringBuilder cookie = new StringBuilder(String.format("\t\t\t%s - $.75",this.item));
        if (isToGo()){
            cookie.append(String.format("%n\t\t\t\t- To Go"));
        }else{
            cookie.append(String.format("%n\t\t\t\t- For Here"));}
        return cookie.toString();
    }
}
