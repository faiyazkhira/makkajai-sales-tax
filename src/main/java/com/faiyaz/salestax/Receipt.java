package com.faiyaz.salestax;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private final List<Item> items;
    private final List<Double> itemTaxes;

    public Receipt(List<Item> items, List<Double> itemTaxes) {
        this.items = items;
        this.itemTaxes = itemTaxes;
    }

    public void addItem(Item item){
        double tax = TaxCalculator.calculateTax(item);
        items.add(item);
        itemTaxes.add(tax);
    }

    public double getTotalTax(){
        return itemTaxes.stream().reduce(0.0, (a,b) -> a+b);
    }

    public double getTotalAmount(){
        double sum = 0.0;

        for(int i=0; i<items.size(); i++){
            sum += items.get(i).getPrice() + itemTaxes.get(i);
        }
        return sum;
    }

    public List<String> getReceiptLines(){
        List<String> lines = new ArrayList<>();
        for(int i=0; i<items.size(); i++){
            Item item = items.get(i);
            double totalPrice = (item.getPrice() * item.getQuantity()) + itemTaxes.get(i);
            lines.add(String.format("%d %s at %.2f", item.getQuantity(), item.getName(), totalPrice));
        }
        return lines;
    }
}
