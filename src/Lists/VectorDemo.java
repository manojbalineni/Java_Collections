package Lists;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        /**
         * 1. Implements List Interface.
         * 2. Synchronized (Thread-safe).
         * 3. Allows duplicate elements.
         * 4. Maintains insertion order.
         */
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");

        // Inserting element at specific index
        vector.add(1, "Orange");

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Removing an element
        vector.remove("Banana");

        // Checking size and capacity
        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());

        // Iterating over Vector
        for (String fruit : vector) {
            System.out.println(fruit);
        }

    }
}
