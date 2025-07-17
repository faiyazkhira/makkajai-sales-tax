package com.faiyaz.salestax;

public class Main {
    public static void main(String[] args) {
        Receipt receipt1 = new Receipt();
        receipt1.addItem(new Item("book", 12.49, false, true, 1));
        receipt1.addItem(new Item("music CD", 14.99, false, false, 1));
        receipt1.addItem(new Item("chocolate bar", 0.85, false, true, 1));

        Receipt receipt2 = new Receipt();
        receipt2.addItem(new Item("imported box of chocolates", 10.00, true, true, 1));
        receipt2.addItem(new Item("imported bottle of perfume", 47.50, true, false, 1));

        Receipt receipt3 = new Receipt();
        receipt3.addItem(new Item("imported bottle of perfume", 27.99, true, false, 1));
        receipt3.addItem(new Item("bottle of perfume", 18.99, false, false, 1));
        receipt3.addItem(new Item("packet of headache pills", 9.75, false, true, 1));
        receipt3.addItem(new Item("box of imported chocolates", 11.25, true, true, 1));

        System.out.println("Output 1:");
        ReceiptPrinter.print(receipt1);
        System.out.println();
        System.out.println("Output 2:");
        ReceiptPrinter.print(receipt2);
        System.out.println();
        System.out.println("Output 3:");
        ReceiptPrinter.print(receipt3);
    }
}
