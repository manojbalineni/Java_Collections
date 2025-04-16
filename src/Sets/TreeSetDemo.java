package Sets;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        /*1. Uses Binary Search Tree (BST) for implementation
        * 2. Efficient Data Structure to store large Data
        * 3. Maintains insertion sorted order. */

        TreeSet<Integer> set = new TreeSet<>();

        // 1. add(E e) - Adding elements
        set.add(10);
        set.add(120);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);

        System.out.println("TreeSet after adding elements: " + set); // Sorted order

        // 2. remove(Object o) - Removing an element
        set.remove(30);
        System.out.println("After removing 30: " + set);

        // 3. contains(Object o) - Checking if an element exists
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 100? " + set.contains(100));

        // 4. size() - Getting the size of the set
        System.out.println("Size of TreeSet: " + set.size());

        // 5. isEmpty() - Checking if the set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 6. first() - Getting the first (lowest) element
        System.out.println("First element: " + set.first());

        // 7. last() - Getting the last (highest) element
        System.out.println("Last element: " + set.last());

        // 8. higher(E e) - Returns the least element greater than given element
        System.out.println("Higher than 20: " + set.higher(20));

        // 9. lower(E e) - Returns the greatest element less than given element
        System.out.println("Lower than 40: " + set.lower(40));

        // 10. pollFirst() - Removes and returns the first element
        System.out.println("Removed first element: " + set.pollFirst());
        System.out.println("TreeSet after pollFirst: " + set);

        // 11. pollLast() - Removes and returns the last element
        System.out.println("Removed last element: " + set.pollLast());
        System.out.println("TreeSet after pollLast: " + set);

        // 12. subSet(E fromElement, E toElement) - Returns a subset from a range
        System.out.println("Subset from 20 to 60 (exclusive): " + set.subSet(20, 60));

        // 13. subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) - Custom inclusions
        System.out.println("Subset from 20 (inclusive) to 60 (inclusive): " + set.subSet(20, true, 60, true));

        // 14. headSet(E toElement) - Returns a subset with elements less than given element
        System.out.println("HeadSet (elements less than 50): " + set.headSet(50));

        // 15. headSet(E toElement, boolean inclusive) - Custom inclusive behavior
        System.out.println("HeadSet (elements less than or equal to 50): " + set.headSet(50, true));

        // 16. tailSet(E fromElement) - Returns a subset with elements greater than or equal to given element
        System.out.println("TailSet (elements greater than or equal to 40): " + set.tailSet(40));

        // 17. tailSet(E fromElement, boolean inclusive) - Custom inclusive behavior
        System.out.println("TailSet (elements strictly greater than 40): " + set.tailSet(40, false));

        // 18. descendingSet() - Returns a reverse order view of the elements
        NavigableSet<Integer> descendingSet = set.descendingSet();
        System.out.println("TreeSet in descending order: " + descendingSet);

        // 19. iterator() - Iterating over elements
        System.out.println("Iterating over TreeSet elements:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 20. descendingIterator() - Iterating in descending order
        System.out.println("Iterating in descending order:");
        Iterator<Integer> descIterator = set.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }

        // 21. clear() - Removing all elements
        set.clear();
        System.out.println("After clear() method, is set empty? " + set.isEmpty());
    }

}
