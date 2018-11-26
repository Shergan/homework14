package com.divashchenko;

import com.divashchenko.shop.Laptop;
import com.divashchenko.shop.Order;
import com.divashchenko.shop.Phone;
import com.divashchenko.shop.Tv;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(Order.Status.NEW, "26.11.2018");

        order.addItem(new Tv("LG", 20100, 37, "FullHD", true));
        order.addItem(new Tv("Toshiba", 10300, 27, "HD", false));
        order.addItem(new Tv("Samsung", 32000, 42, "FullHD 4K", true));

        order.addItem(new Phone("Xiaomi", 9000, 7.5, 4000, 170));
        order.addItem(new Phone("Sony", 12500, 5.8, 3000, 154));
        order.addItem(new Phone("Nokia", 18000, 6.1, 4500, 181));
        order.addItem(new Phone("iPhone", 7000, 5.0, 3000, 155));

        order.addItem(new Laptop("Asus", 18000, "Intel", 8, "Windows 10"));
        order.addItem(new Laptop("Lenovo", 22000, "AMD", 12, "Linux"));
        order.addItem(new Laptop("HP", 35000, "Intel", 16, "DOS"));

        order.sumPrice();
    }
}
