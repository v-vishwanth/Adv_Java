package com.collections;

import java.util.*;

public class ToArray2 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		Integer[] arr = new Integer[0];
		arr = list.toArray(arr);
		
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		System.out.println(list);
	}
}
