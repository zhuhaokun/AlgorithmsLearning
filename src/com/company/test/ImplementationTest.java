package com.company.test;

import java.util.ArrayList;
import java.util.List;

public class ImplementationTest {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList1 = new ArrayList<>();
        subList1.add(1);
        list.add(subList1);
        subList1 = new ArrayList<>();
        System.out.println(list);
    }
}
