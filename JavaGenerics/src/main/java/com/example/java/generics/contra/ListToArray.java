package com.example.java.generics.contra;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static <E> E[] getArray(List<E> list) {
        E[] array = (E[]) new Object[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void main(String[] args) {

        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("AWS");

        Object[] array = getArray(books);
        System.out.println(Arrays.toString(array));

    }
}
