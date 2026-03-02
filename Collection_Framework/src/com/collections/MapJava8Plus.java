package com.collections;

import java.util.*;

public class MapJava8Plus {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Krishna");
		map.put(2, "Rahul");
		map.put(3, "Aman");
		System.out.println("\nOriginal Map:");
		System.out.println(map);
		
		map.putIfAbsent(2, "Abhishek");
		map.putIfAbsent(4, "Piyush");
		System.out.println("\nAfter putIfAbsent():");
		System.out.println(map);
		
		
		map.replace(4, "Priyanshu");
		map.replace(5, "Tanmay");
		System.out.println("\nAfter replace()");
		System.out.println(map);
		
		map.replace(4, "Priyanshu","Ayush");
		map.replace(3, "Naman","Swayam");
		System.out.println("\nAfter replace()");
		System.out.println(map);
		
		String name = map.getOrDefault(2, "Nahi Hai");
		System.out.println(name);
		
		String name1 = map.getOrDefault(5, "Nahi Hai");
		System.out.println(name1);
		
		System.out.println(map);
		
		
		map.compute(1, (k,v) -> v + " Upadhyay");
		System.out.println("\n After compute()");
		System.out.println(map);
		
		map.compute(5, (k,v) -> "Ayushman");
		System.out.println("\n After compute()");
		System.out.println(map);
		
		map.compute(5, (k,v) -> null);
		System.out.println("\n After compute()");
		System.out.println(map);
		
		
		map.merge(2, "Upadhyay", (oldV,newV) -> oldV+newV);
		map.merge(5, "NewUser", (oldV,newV) -> oldV+newV);
		System.out.println("\n After merge()");
		System.out.println(map);
		
		map.merge(5, "new", (oldV,newV) -> null);
		System.out.println("\nAfter merge()");
		System.out.println(map);
		
	}
}
