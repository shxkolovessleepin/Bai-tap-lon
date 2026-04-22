package com.auction.factory;
import com.auction.model.*;

public class ItemFactory {
    public static Item createItem(String type, String name, double startingPrice) {
        switch (type.toLowerCase()) {
            case "electronic" :
                return new Electronics(name, startingPrice);
            case "art":
                return new Art(name, startingPrice);
            case "vehicle":
                return new Vehicle(name, startingPrice);
            default:
                try {
                    throw new IllegalAccessException("Loại sản phẩm không hợp lệ: " + type);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
