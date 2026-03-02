package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDequeOnlyDemo {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        System.out.println("===== QUEUE METHODS =====");

        // add() -> insert at tail
        dq.add(10);
        dq.add(20);
        dq.add(30);
        System.out.println("After add(): " + dq);

        // offer() -> insert at tail (safe)
        dq.offer(40);
        System.out.println("After offer(40): " + dq);

        // element() -> view head (exception if empty)
        System.out.println("element(): " + dq.element());

        // peek() -> view head (null if empty)
        System.out.println("peek(): " + dq.peek());

        // remove() -> remove head (exception if empty)
        System.out.println("remove(): " + dq.remove());
        System.out.println("After remove(): " + dq);

        // poll() -> remove head (null if empty)
        System.out.println("poll(): " + dq.poll());
        System.out.println("After poll(): " + dq);


        System.out.println("\n===== DEQUE EXTRA METHODS =====");

        // addFirst() -> insert at front
        dq.addFirst(5);
        System.out.println("After addFirst(5): " + dq);

        // addLast() -> insert at end
        dq.addLast(50);
        System.out.println("After addLast(50): " + dq);

        // offerFirst() -> insert at front (safe)
        dq.offerFirst(1);
        System.out.println("After offerFirst(1): " + dq);

        // offerLast() -> insert at end (safe)
        dq.offerLast(60);
        System.out.println("After offerLast(60): " + dq);

        // getFirst() -> view front (exception if empty)
        System.out.println("getFirst(): " + dq.getFirst());

        // getLast() -> view end (exception if empty)
        System.out.println("getLast(): " + dq.getLast());

        // peekFirst() -> view front (null if empty)
        System.out.println("peekFirst(): " + dq.peekFirst());

        // peekLast() -> view end (null if empty)
        System.out.println("peekLast(): " + dq.peekLast());

        // removeFirst() -> remove front (exception if empty)
        System.out.println("removeFirst(): " + dq.removeFirst());
        System.out.println("After removeFirst(): " + dq);

        // removeLast() -> remove end (exception if empty)
        System.out.println("removeLast(): " + dq.removeLast());
        System.out.println("After removeLast(): " + dq);

        // pollFirst() -> remove front (null if empty)
        System.out.println("pollFirst(): " + dq.pollFirst());
        System.out.println("After pollFirst(): " + dq);

        // pollLast() -> remove end (null if empty)
        System.out.println("pollLast(): " + dq.pollLast());
        System.out.println("After pollLast(): " + dq);


        System.out.println("\n===== STACK STYLE (DEQUE) =====");

        // push() -> addFirst()
        dq.push(100);
        dq.push(200);
        System.out.println("After push(): " + dq);

        // pop() -> removeFirst()
        System.out.println("pop(): " + dq.pop());
        System.out.println("After pop(): " + dq);
    }
}
