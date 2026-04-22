package com.auction.model;

public abstract class Item extends Entity {
    protected String name;
    protected double startingPrice;

    public Item(String name, double startingPrice) {
        super();
        this.name = name;
        this.startingPrice = startingPrice;
    }

    public String getName() {return name;}
    public double getStartingPrice() {return startingPrice;}

    public void setName(String newName) {this.name = newName;}
    public void setStartingPrice(double newPrice) {this.startingPrice = newPrice;}
}
