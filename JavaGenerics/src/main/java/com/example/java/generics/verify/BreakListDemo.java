package com.example.java.generics.verify;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BreakListDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("AWS");

        breakList(courses); // No error here
        String java = courses.get(0); //ClassCastException
        System.out.println(java);
    }

    public static void breakList(List list) {
        list.add(0, LocalDate.now());
    }
}
