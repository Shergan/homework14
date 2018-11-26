package com.divashchenko.shop;

public class Laptop extends Item {
    protected String cpu;
    protected int ramSize;
    protected String operationSystem;

    public Laptop(String name, double price, String cpu, int ramSize, String operationSystem) {
        super(name, price);
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.operationSystem = operationSystem;
    }
}
