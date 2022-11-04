package com.example.java.generics.shopping;

public class UseAPair {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("one", "two");
        System.out.println(pair);

        Pair<Shoe> shoePair = new Pair<>(new Shoe(10, "Red"), new Shoe(20, "Green"));
        Pair<Glove> glovePair = new Pair<>(new Glove(10, "Red"), new Glove(20, "Green"));
    }
}
