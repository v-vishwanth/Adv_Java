package com.lpu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7);
		
//		Stream<Integer> s1 = arr.stream();
//		Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//		s2.forEach(n -> System.out.println(n));
		
		arr.stream().filter(n -> n%2 == 0).forEach(System.out::println);
	}

}
