package com.auction.manager;

public class AuctionManager {
    private static AuctionManager instance;

    private AuctionManager() {
        System.out.println("Hệ thống quản lý đấu giá được khởi tạo");
    }

    public static AuctionManager getInstance() {
        if (instance == null)
            instance = new AuctionManager();
        return instance;
    }
}