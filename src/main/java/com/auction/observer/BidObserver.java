package com.auction.observer;

public interface BidObserver {
    void onNewBid(double newPrice, String bidderName);
}
