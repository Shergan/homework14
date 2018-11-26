package com.divashchenko.shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public enum Status {
        NEW, PAID, CANCELED
    }

    protected Status status;
    protected String date;
    protected List<Item> items = new ArrayList<>();

    public Order(Status status, String date) {
        this.status = status;
        this.date = date;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void sumPrice() {
        double tmpDouble = 0;
        for (Item item : items) {
            System.out.println("[" + item.name + ": " + item.price + "]");
            tmpDouble += item.price;
        }
        System.out.println();
        System.out.println("Full price is: " + tmpDouble);
    }


}
