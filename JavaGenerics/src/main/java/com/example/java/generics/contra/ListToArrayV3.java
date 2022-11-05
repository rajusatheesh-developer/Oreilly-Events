package com.example.java.generics.contra;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayV3 {

    public static <E> E[] getArray(List<E> list, Class cls) {
        //E[] array = (E[]) new Object[list.size()];
        E[] array = (E[]) Array.newInstance(cls, list.size());
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void main(String[] args) {

        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("AWS");

        CharSequence[] array = getArray(books, String.class);
        array[0] = new StringBuilder("AZURE");
        System.out.println("type of Array : " + array.getClass());
        System.out.println(Arrays.toString(array));

    }
}
