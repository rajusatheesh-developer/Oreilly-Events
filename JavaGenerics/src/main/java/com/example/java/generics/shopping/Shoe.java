package com.example.java.generics.shopping;

public class Shoe implements Sized,Colored
{
    int size;
    String color;

    public Shoe(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }
}
