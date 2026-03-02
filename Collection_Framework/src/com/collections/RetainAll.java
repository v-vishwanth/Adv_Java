package com.collections;

import java.util.*;

public class RetainAll {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List<Integer> l2 = new ArrayList<>(Arrays.asList(40,50,30));
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l2.retainAll(l1));
		
		System.out.println(l1);
		System.out.println(l2);
	}
}
