package com.collections;

import java.util.*;

public class ToArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Integer[] arr = (Integer)(list.toArray());

        for (Object obj : arr) {
            Integer num = (Integer) obj; // type casting required
            System.out.println(num);
        }
    }
}
