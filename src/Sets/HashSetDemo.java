package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        /*1. Used to create a collection that uses hash table to store.
        * 2. Hashing mechanism is used
        * 3. Contains Unique elements
        * 4. Allows null values
        * 5. Does not maintain insertion order
        * 6. Default capacity is 16 and load factor is 12.
        * 7. 16 * 0.75 = 12 => HashSet size increases internally when we insert 12 elements.*/


        HashSet<String> fruits = new HashSet<>();
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits);

        System.out.println(fruits.contains("Apple"));

        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(fruits.isEmpty());

        fruits.remove("Apple");
        System.out.println(fruits);

        System.out.println(fruits.size());

    }
}
