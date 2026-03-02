package com.collections;

import java.util.*;

public class Deque1 {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(10);
		deque.add(20);
		System.out.println(deque);
		
		deque.addFirst(5);
		deque.addLast(25);
		System.out.println(deque);
		
		deque.push(2);
		System.out.println(deque);
		
		System.out.println(deque.pop());
		System.out.println(deque);
		
	}
}
