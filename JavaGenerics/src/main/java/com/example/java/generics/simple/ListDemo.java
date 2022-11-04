package com.example.java.generics.simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Raju");
        names.add("Satheesh");
        names.add(100);
        names.add(LocalDate.now());

        String name = (String) names.get(0);
        System.out.println(names);
        System.out.println(name);
    }
}
