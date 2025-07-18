package com.faiyaz.salestax;

public class TaxCalculator {
    public static double calculateTax(Item item){
        double taxRate = 0.0;

        if(!item.isExempt()){
            taxRate += 0.10;
        }
        if(item.isImported()){
            taxRate += 0.05;
        }
        double totalItemPrice = item.getPrice() * item.getQuantity();
        return roundTax(totalItemPrice * taxRate);
    }

    public static double roundTax(double tax){
        return Math.ceil(tax * 20.0) / 20.0;
    }
}
