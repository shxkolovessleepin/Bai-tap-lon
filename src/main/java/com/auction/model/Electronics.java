package com.auction.model;

public class Electronics extends Item {
    public Electronics(String name, double startPrice) {
        super(name, startPrice);
    }
    @Override
    public void getInfo() {
        System.out.println("[Electronic] | Name: " + name + " | ID: " + id + " | Starting price: " + startPrice);
    }
}
