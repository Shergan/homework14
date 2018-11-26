package com.divashchenko.shop;

public class Tv extends Item {
    protected int size;
    protected String style;
    protected boolean wiFi;

    public Tv(String name, double price, int size, String style, boolean wiFi) {
        super(name, price);
        this.size = size;
        this.style = style;
        this.wiFi = wiFi;
    }
}
