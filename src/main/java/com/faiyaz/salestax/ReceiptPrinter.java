package com.faiyaz.salestax;

public class ReceiptPrinter {

    public static void print(Receipt receipt){
        receipt.getReceiptLines().forEach(System.out::println);
        System.out.printf("Sales Taxes: %.2f%n", receipt.getTotalTax());
        System.out.printf("Total: %.2f%n", receipt.getTotalAmount());
    }
}
