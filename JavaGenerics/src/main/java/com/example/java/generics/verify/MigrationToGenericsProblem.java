package com.example.java.generics.verify;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MigrationToGenericsProblem
{
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Java");
        countries.add("AWS");

        breakList(countries); // No error here
        String java = countries.get(0); //ClassCastException at runtime
        System.out.println(java);
    }

    /**
     * If we have code like below written 15years ago while migrating to Generic Version of List
     * Then we can't find this code and we will face errors
     * @param list - is non-generic
     */
    public static void breakList(List list) {
        list.add(0, LocalDate.now()); //it doesn't throw any error
    }

}
