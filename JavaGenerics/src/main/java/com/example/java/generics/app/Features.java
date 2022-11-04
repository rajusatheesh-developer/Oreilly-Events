package com.example.java.generics.app;

import java.util.ArrayList;
import java.util.List;

public class Features {
    public static void main(String[] args) {
        List<String> features = new ArrayList<>();
        features.add("Compile time Type Checking");
        features.add("Type inference with <>");
        features.add("Compile time Type consistency");

        System.out.println(features);
    }
}
