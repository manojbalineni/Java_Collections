package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        /*1.Used When we want to process the elements in the FIFO manner.
        * 2. Insertion of elements occurs at the end of the list and removal of elements happens at the starting of the list.
        * */

        Queue<Integer> queue = new LinkedList<>();

        // 1. add(E e) - Adds an element to the queue (throws exception if full)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add(): " + queue);

        // 2. offer(E e) - Adds an element to the queue (returns false if full)
        queue.offer(40);
        System.out.println("Queue after offer(): " + queue);

        // 3. element() - Retrieves but does not remove the head (throws exception if empty)
        System.out.println("Head element using element(): " + queue.element());

        // 4. peek() - Retrieves but does not remove the head (returns null if empty)
        System.out.println("Head element using peek(): " + queue.peek());

        // 5. remove() - Retrieves and removes the head (throws exception if empty)
        System.out.println("Removed element using remove(): " + queue.remove());
        System.out.println("Queue after remove(): " + queue);

        // 6. poll() - Retrieves and removes the head (returns null if empty)
        System.out.println("Removed element using poll(): " + queue.poll());
        System.out.println("Queue after poll(): " + queue);

        // 7. size() - Returns the number of elements
        System.out.println("Size of queue: " + queue.size());

        // 8. isEmpty() - Checks if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 9. Using iterator() to traverse the queue
        System.out.print("Queue elements using iterator: ");
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 10. Clearing the queue
        queue.clear();
        System.out.println("Queue after clear(): " + queue);

    }
}
