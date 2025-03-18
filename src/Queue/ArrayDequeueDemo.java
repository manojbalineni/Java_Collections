package Queue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        /**
         * Faster than LinkedList for queue and stack operations.
         * No capacity restriction (grows dynamically).
         * Allows both FIFO and LIFO (Can be used as a Queue or Stack).
         * No null elements allowed.
         */

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements at the tail (FIFO behavior)
        deque.offer("A");
        deque.offer("B");
        deque.offer("C");
        System.out.println("Queue after offer(): " + deque);

        // Adding elements at the head
        deque.offerFirst("X");
        deque.offerLast("Z");
        System.out.println("Queue after offerFirst() & offerLast(): " + deque);

        // Accessing elements without removal
        System.out.println("Peek (Head): " + deque.peek());
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Removing elements (FIFO)
        System.out.println("Poll (Head removed): " + deque.poll());
        System.out.println("After poll(): " + deque);

        // Removing elements from both ends
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println("After pollFirst() & pollLast(): " + deque);

        // Adding elements again
        deque.add("D");
        deque.addFirst("E");
        deque.addLast("F");
        System.out.println("After add(), addFirst(), addLast(): " + deque);

        // Removing specific element
        deque.remove("D");
        System.out.println("After remove(D): " + deque);

        // Checking if an element exists
        System.out.println("Contains 'F'? " + deque.contains("F"));

        // Getting size
        System.out.println("Queue Size: " + deque.size());

        // Clearing the deque
        deque.clear();
        System.out.println("Is Queue Empty? " + deque.isEmpty());
    }
}
