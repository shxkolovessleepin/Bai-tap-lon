package com.auction.auction;

import com.auction.model.*;
import com.auction.observer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Auction {
    private String itemId;
    private double currentHighestPrice;
    private BidTransaction winningBid;
    private AuctionState state;

    private List<BidObserver> observers = new ArrayList<>();
    private final ReentrantLock lock = new ReentrantLock();

    public Auction(String itemId, double startingPrice) {
        this.itemId = itemId;
        this.currentHighestPrice = startingPrice;
        this.state = AuctionState.OPEN;
    }
    //LOGIC CHUYỂN TRẠNG THÁI
    public void startAuction() {
        if (state == AuctionState.OPEN) {
            state = AuctionState.RUNNING;
            System.out.println("Phiên đấu giá BẮT ĐẦU.");
        }
    }

    public void finishAuction() {
        if (state == AuctionState.RUNNING) {
            state = AuctionState.FINISHED;
            System.out.println("Phiên đấu giá KẾT THÚC.");
        }
    }

    //OBSERVER PATTERN
    public void addObserver(BidObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(double newPrice, String bidderName) {
        for (BidObserver observer : observers) {
            observer.onNewBid(newPrice, bidderName);
        }
    }

    //XỬ LÝ ĐẶT GIÁ ĐỒNG THỜI (CONCURRENCY)
    public boolean placeBid(String bidderName, double bidAmount) {
        if (state != AuctionState.RUNNING) {
            return false;
        }
        lock.lock();
        try {
            if (bidAmount > currentHighestPrice) {
                currentHighestPrice = bidAmount;
                winningBid = new BidTransaction(bidderName, bidAmount);

                notifyObservers(bidAmount, bidderName);
                return true;
            }
            return false;
        } finally {
            lock.unlock(); // Luôn nhả khóa để tránh deadlock
        }
    }
}
