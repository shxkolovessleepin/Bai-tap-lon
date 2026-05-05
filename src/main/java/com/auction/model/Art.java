package com.auction.model;

public class Art extends Item {
    public Art(String name, double startPrice) {
        super(name, startPrice);
    }
    @Override
    public void getInfo() {
        System.out.println("[Art] | Name: " + name + " | ID: " + id + " | Starting price: " + startPrice);
    }
}

