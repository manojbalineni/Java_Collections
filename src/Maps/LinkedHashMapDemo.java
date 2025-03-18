package Maps;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        /*
        * 1. HashTable and LinkedList Implementation
        * 2. Contains unique elements
        * 3. Initial Capacity is 16 and load factor is 0.75. */

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 1. put(K key, V value) - Insert elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // 2. get(Object key) - Retrieve value
        System.out.println("Value for key 2: " + map.get(2));

        // 3. containsKey(Object key) - Check if key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 4. containsValue(Object value) - Check if value exists
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // 5. remove(Object key) - Remove an entry
        map.remove(4);
        System.out.println("Map after removing key 4: " + map);

        // 6. size() - Get size of the map
        System.out.println("Size of map: " + map.size());

        // 7. keySet() - Get all keys
        System.out.println("Keys: " + map.keySet());

        // 8. values() - Get all values
        System.out.println("Values: " + map.values());

        // 9. entrySet() - Get key-value pairs
        System.out.println("Entries: " + map.entrySet());

        // 10. forEach(BiConsumer) - Iterating over LinkedHashMap
        System.out.println("Iterating using forEach:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // 11. putIfAbsent(K key, V value) - Insert if key is absent
        map.putIfAbsent(5, "Elderberry");
        System.out.println("Map after putIfAbsent(5, 'Elderberry'): " + map);

        // 12. replace(K key, V value) - Replace value for a key
        map.replace(2, "Blueberry");
        System.out.println("Map after replace(2, 'Blueberry'): " + map);

        // 13. replace(K key, V oldValue, V newValue) - Replace if old value matches
        map.replace(2, "Blueberry", "Blackberry");
        System.out.println("Map after conditional replace(2, 'Blueberry', 'Blackberry'): " + map);

        // 14. compute(K key, BiFunction) - Modify value for a key
        map.compute(1, (key, val) -> val + " Pie");
        System.out.println("Map after compute(1, (key, val) -> val + ' Pie'): " + map);

        // 15. computeIfAbsent(K key, Function) - Compute value if absent
        map.computeIfAbsent(6, k -> "Fig");
        System.out.println("Map after computeIfAbsent(6, k -> 'Fig'): " + map);

        // 16. computeIfPresent(K key, BiFunction) - Modify value if present
        map.computeIfPresent(3, (key, val) -> val.toUpperCase());
        System.out.println("Map after computeIfPresent(3, (key, val) -> val.toUpperCase()): " + map);

        // 17. merge(K key, V value, BiFunction) - Merge values
        map.merge(2, " Smoothie", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Map after merge(2, ' Smoothie', (old, newVal) -> old + newVal): " + map);

        // 18. clear() - Remove all elements
        map.clear();
        System.out.println("Map after clear(): " + map);

        // 19. isEmpty() - Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
