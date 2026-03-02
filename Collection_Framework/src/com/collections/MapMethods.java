package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"Krishna");
		map.put(2,"Abhishek");
		
		System.out.println(map.get(2));
		System.out.println(map.containsKey(2));
		System.out.println(map);
		
		System.out.println(map.containsValue("Krishna"));
		System.out.println(map.size());
		
		map.remove(2);
		System.out.println(map);
		
		map.put(3, "Divya");
		map.put(4, "David");
		
		for(Integer i : map.keySet()) {
			System.out.println("key -> " + i + ", value -> "+ map.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println("key -> " + m.getKey() + ", value -> "+ m.getValue());
		}
		
		System.out.println();
		System.out.println();
		
		Collection<String> collection = map.values();
		for(String i : collection) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		Set<Integer> set = map.keySet();
		for(Integer i : set){
			System.out.println(i);
		}
		
	}
}
