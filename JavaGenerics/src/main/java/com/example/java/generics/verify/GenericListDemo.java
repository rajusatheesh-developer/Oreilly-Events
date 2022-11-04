package com.example.java.generics.verify;

import java.util.ArrayList;
import java.util.List;

public class GenericListDemo {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Apples");
        products.add("Lenovo");
        products.add("Mac");

        System.out.println(products);
    }
}
