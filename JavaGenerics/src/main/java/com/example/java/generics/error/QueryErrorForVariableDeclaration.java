package com.example.java.generics.error;

import java.util.ArrayList;
import java.util.List;

public class QueryErrorForVariableDeclaration {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        //   list.add(10); // error
        //   list.add(10L); // error
        List<? super Number> list2 = new ArrayList<>();
        //   list.add(new Object()); // error

    }


}
