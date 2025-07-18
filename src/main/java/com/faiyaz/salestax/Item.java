package com.faiyaz.salestax;

import lombok.Getter;

@Getter
public class Item {

    private final String name;
    private final double price;
    private final boolean isImported;
    private final boolean isExempt;
    private final int quantity;

    public Item(String name, double price, boolean isImported, boolean isExempt, int quantity) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.isExempt = isExempt;
        this.quantity = quantity;
    }
}
