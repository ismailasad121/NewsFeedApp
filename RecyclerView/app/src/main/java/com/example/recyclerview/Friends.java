package com.example.recyclerview;


public class Friends {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Friends(String name) {
        this.name = name;

    }

    String name;

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                '}';
    }
}

