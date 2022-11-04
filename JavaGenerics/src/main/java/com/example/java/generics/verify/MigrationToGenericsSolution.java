package com.example.java.generics.verify;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigrationToGenericsSolution
{
    public static void main(String[] args) {
        //proxy pattern but performance issue
        //It checks the type at runtime
        //CheckedList is not data structure
        List<String> countries = Collections.
                checkedList(new ArrayList<>(),String.class);

        countries.add("Java");
        countries.add("AWS");

        breakList(countries);
        String java = countries.get(0);
        System.out.println(java);
    }

    /**
     * If we have code like below written 15years ago while migrating to Generic Version of List
     * Then we can't find this code and we will face errors
     * @param list - is non-generic
     */
    public static void breakList(List list) {
        list.add(0, LocalDate.now()); // it does throw error at runtime
    }

}
