package com.example.java.generics.shopping;

import com.example.java.generics.shopping.shop.Glove;
import com.example.java.generics.shopping.shop.Pair;
import com.example.java.generics.shopping.shop.Shoe;

public class UseAPair {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("one", "two");
        System.out.println(pair);


    }
}
