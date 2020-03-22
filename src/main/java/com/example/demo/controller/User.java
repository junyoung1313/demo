package com.example.demo.controller;

/**
 * User
 */
public class User {

    private String userId;
    private String password;
    private String name;


    public User() {
    }

    public User(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User userId(String userId) {
        this.userId = userId;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " userId='" + getUserId() + "'" +
            ", password='" + getPassword() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
}