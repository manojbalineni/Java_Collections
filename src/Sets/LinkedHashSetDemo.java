package Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /**
         * Maintains Insertion Order – Unlike HashSet, elements are stored in the order they were inserted.
         * No Duplicates – Like all Set implementations, it does not allow duplicate elements.
         * Implements Set Interface – Part of the java.util package.
         * Allows null Values – But only one null value can be stored.
         * Faster than TreeSet – Does not maintain sorting order but provides better performance than TreeSet.
         */

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // 1. add() - Adding elements
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Cherry");
        lhs.add("Apple"); // Duplicate - won't be added
        lhs.add("Mango");
        lhs.add(null);  // Allows one null value

        System.out.println("LinkedHashSet after additions: " + lhs);

        // 2. remove() - Removing an element
        lhs.remove("Banana");
        System.out.println("After removing 'Banana': " + lhs);

        // 3. contains() - Checking if an element exists
        System.out.println("Contains 'Cherry'? " + lhs.contains("Cherry"));

        // 4. size() - Getting size of set
        System.out.println("Size of LinkedHashSet: " + lhs.size());

        // 5. isEmpty() - Checking if set is empty
        System.out.println("Is LinkedHashSet empty? " + lhs.isEmpty());

        // 6. Iterating using Iterator
        System.out.println("Iterating through LinkedHashSet:");
        Iterator<String> iterator = lhs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // 7. clear() - Removing all elements
        lhs.clear();
        System.out.println("After clear() method, is empty? " + lhs.isEmpty());
    }
}
