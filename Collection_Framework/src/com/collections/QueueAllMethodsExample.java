package com.collections;

import java.util.Queue;
import java.util.LinkedList;

public class QueueAllMethodsExample {

    public static void main(String[] args) {

        // Queue creation
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Initial Queue: " + queue);

        // ---------------- offer() ----------------
        // Inserts element (SAFE - no exception)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("After offer(): " + queue);

        // ---------------- peek() ----------------
        // Views head (SAFE - returns null if empty)
        Integer peekElement = queue.peek();
        System.out.println("peek(): " + peekElement);
        System.out.println("Queue after peek(): " + queue);

        // ---------------- poll() ----------------
        // Removes head (SAFE - returns null if empty)
        Integer pollElement = queue.poll();
        System.out.println("poll(): " + pollElement);
        System.out.println("Queue after poll(): " + queue);

        // ---------------- remove() ----------------
        // Removes head (UNSAFE - throws exception if empty)
        Integer removeElement = queue.remove();
        System.out.println("remove(): " + removeElement);
        System.out.println("Queue after remove(): " + queue);

        // ---------------- element() ----------------
        // Views head (UNSAFE - throws exception if empty)
        Integer elementValue = queue.element();
        System.out.println("element(): " + elementValue);
        System.out.println("Queue after element(): " + queue);

        // ---------------- EMPTY QUEUE TEST ----------------
        System.out.println("\n--- Empty Queue Test ---");

        Queue<Integer> emptyQueue = new LinkedList<>();

        System.out.println("peek(): " + emptyQueue.peek()); // null
        System.out.println("poll(): " + emptyQueue.poll()); // null

        // Uncomment to see exceptions
        // emptyQueue.remove();   // NoSuchElementException
        // emptyQueue.element();  // NoSuchElementException
    }
}
