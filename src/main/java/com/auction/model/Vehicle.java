package com.auction.model;

public class Vehicle extends Item {
    public Vehicle(String name, double startPrice) {
        super(name, startPrice);
    }
    @Override
    public void getInfo() {
        System.out.println("[Vehicle] | Name: " + name + " | ID: " + id + " | Starting price: " + startPrice);
    }
}