package com.example.java.generics.verify;

import java.util.ArrayList;
import java.util.List;

public class StringIsACharSequenceDemo {
    public static void main(String[] args) {
        List<CharSequence> values=new ArrayList<>();
        values.add("One"); // We can assign String as CharSequence but not vice-versa
        values.add("One");
        System.out.println(values);
    }
}
