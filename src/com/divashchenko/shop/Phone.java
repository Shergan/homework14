package com.divashchenko.shop;

public class Phone extends Item {
    protected double screenSize;
    protected int battery;
    protected int weight;

    public Phone(String name, double price, double screenSize, int battery, int weight) {
        super(name, price);
        this.screenSize = screenSize;
        this.battery = battery;
        this.weight = weight;
    }
}
