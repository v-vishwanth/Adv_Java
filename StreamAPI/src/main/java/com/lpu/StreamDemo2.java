package com.lpu;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
//		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
//		stream.forEach(System.out::println); 
//		
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
		stream.forEach(consumer);
	}
}
