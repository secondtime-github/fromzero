package com.teki.learn.dto;

public class User {

    private final String name;
    private final String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
