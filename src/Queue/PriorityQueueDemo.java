package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        /**
         * Implements Queue interface.
         *  Maintains elements in natural ordering (ascending for numbers).
         * Uses Min Heap by default (smallest element has the highest priority).
         * Allows custom comparators for custom sorting.
         * Does not allow null elements.
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.offer(40);
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);

        System.out.println("PriorityQueue (Min Heap): " + pq); // Elements are not sorted in printing

        // Retrieving elements without removal
        System.out.println("Peek (Top Element): " + pq.peek());

        // Removing elements
        System.out.println("Poll (Removed Element): " + pq.poll());
        System.out.println("PriorityQueue after poll: " + pq);

        // Checking if an element exists
        System.out.println("Contains 30? " + pq.contains(30));

        // Removing a specific element
        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        // Size of queue
        System.out.println("Queue Size: " + pq.size());

        // Clearing the queue
        pq.clear();
        System.out.println("Is Queue Empty? " + pq.isEmpty());

        // Custom Comparator (Max Heap - Descending Order)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.offer(40);
        maxHeap.offer(20);
        maxHeap.offer(30);
        maxHeap.offer(10);

        System.out.println("\nPriorityQueue (Max Heap): " + maxHeap);
        System.out.println("Poll from Max Heap: " + maxHeap.poll());
    }
}
