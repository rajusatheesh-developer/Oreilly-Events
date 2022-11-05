package com.example.java.generics.error;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MethodOverrideError
{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
    }

    public void doStuff(int a) { }
    public void doStuff(long a) { }
//    public void doStuff(List<String> a) { } // shows compile time error because String is expression
    public void doStuff(List<LocalDate> a) { }
}
