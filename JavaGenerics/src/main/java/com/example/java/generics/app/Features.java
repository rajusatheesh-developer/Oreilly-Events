package com.example.java.generics.app;

import java.util.ArrayList;
import java.util.List;

public class Features {
    public static void main(String[] args) {
        List<String> features = new ArrayList<>();
        features.add("Compile time Type Checking");
        features.add("Type inference with <>");
        features.add("Compile time Type consistency");
        features.add("Generics doesn't support records");
        features.add("extends : is assignment compatible eg: E extends Class/Interface");
        features.add("Inheritance is bad in GenericType");
        features.add("Can't apply generics to Enums");

        System.out.println(features);
    }
}
