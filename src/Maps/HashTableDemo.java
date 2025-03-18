package Maps;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        /*1. Does not allow null key or value.
        * 2. HashTable is Slow
        * 3. HashTable is Synchronized and thread safe. */

        Hashtable<Integer, String> table = new Hashtable<>();

        // 1. put(K key, V value) - Insert elements
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        table.put(4, "Date");

        // 2. get(K key) - Retrieve value
        System.out.println("Value for key 2: " + table.get(2));

        // 3. containsKey(K key) - Check if key exists
        System.out.println("Contains key 3? " + table.containsKey(3));

        // 4. containsValue(V value) - Check if value exists
        System.out.println("Contains value 'Mango'? " + table.containsValue("Mango"));

        // 5. remove(K key) - Remove an entry
        table.remove(4);
        System.out.println("After removing key 4: " + table);

        // 6. size() - Get size of the hashtable
        System.out.println("Size of hashtable: " + table.size());

        // 7. keySet() - Get all keys
        System.out.println("Keys: " + table.keySet());

        // 8. values() - Get all values
        System.out.println("Values: " + table.values());

        // 9. entrySet() - Get key-value pairs
        System.out.println("Entries: " + table.entrySet());

        // 10. Enumeration - Get keys using Enumeration
        Enumeration<Integer> keys = table.keys();
        System.out.print("Keys using Enumeration: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // 11. elements() - Get values using Enumeration
        Enumeration<String> values = table.elements();
        System.out.print("Values using Enumeration: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println();

        // 12. putIfAbsent(K key, V value) - Insert only if absent
        table.putIfAbsent(5, "Elderberry");
        System.out.println("After putIfAbsent(5, 'Elderberry'): " + table);

        // 13. replace(K key, V value) - Replace value for a key
        table.replace(2, "Blueberry");
        System.out.println("After replace(2, 'Blueberry'): " + table);

        // 14. replace(K key, V oldValue, V newValue) - Replace if old value matches
        table.replace(2, "Blueberry", "Blackberry");
        System.out.println("After replace(2, 'Blueberry', 'Blackberry'): " + table);

        // 15. clone() - Create a shallow copy of the hashtable
        Hashtable<Integer, String> tableCopy = (Hashtable<Integer, String>) table.clone();
        System.out.println("Cloned Hashtable: " + tableCopy);

        // 16. clear() - Remove all elements
        table.clear();
        System.out.println("After clear(): " + table);

        // 17. isEmpty() - Check if hashtable is empty
        System.out.println("Is hashtable empty? " + table.isEmpty());

    }
}
