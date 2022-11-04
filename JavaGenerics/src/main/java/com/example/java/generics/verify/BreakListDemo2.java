package com.example.java.generics.verify;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *  List<E> - E is attached with expression eg: cities so no error
 */
public class BreakListDemo2 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList(List.of("BNG", LocalDate.now())); // no error
        cities.add("CHN");
        System.out.println(cities);

    }
}
