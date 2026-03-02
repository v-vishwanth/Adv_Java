package com.lpu;

import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StreamDemo {
	public static void main(String[] args) {
//		Stream.generate(() -> 2).forEach(n -> System.out.println("Value is repeated : " + n));;
		
		Supplier<Integer> supplier = new Supplier<Integer>() {
			Integer count = 1;
			@Override
			public Integer get() {
				return count++;
			}
		};
		
		Consumer<Integer> consumer = new Consumer<Integer>(){
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		
		Stream<Integer> stream = Stream.generate(supplier);
		stream.forEach(consumer);
	}
}
