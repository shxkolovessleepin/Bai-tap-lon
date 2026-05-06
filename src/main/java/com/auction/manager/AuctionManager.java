package com.auction.manager;

public class AuctionManager {
    private static AuctionManager instance;

    private AuctionManager() {
        System.out.println("The auction management system has been initiated.");
    }

    public static AuctionManager getInstance() {
        if (instance == null)
            instance = new AuctionManager();
        return instance;
    }
}