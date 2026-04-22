package com.auction.model;

public abstract class User extends Entity {
    protected String username;
    protected String email;

    public User(String username, String email) {
        super();
        this.username = username;
        this.email = email;
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }

    public void setUsername(String newName) {this.username = newName;}
    public void setEmail(String newEmail) {this.email = newEmail;}

}
