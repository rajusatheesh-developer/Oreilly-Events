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
        features.add("Wildcard support : ? ");
        features.add("super only works with ? doesn't work with E");
        features.add("co-variance vs contravariance vs invariant");
        features.add("co-variance : E extends String");
        features.add("contravariance : ? super Object");
        features.add("invariant : List<String>");
        features.add("? super String : query super String");
        features.add("? extends String : query extends String");
        features.add("Doesn't support Primitive types");

        System.out.println(features);
    }
}
