package com.auction.model;

import java.util.UUID;

public abstract class Entity {
    protected String id;

    public Entity() {
        this.id = setId();
    }
    abstract public String setId();
    public String getId() {
        return id;
    }
}
