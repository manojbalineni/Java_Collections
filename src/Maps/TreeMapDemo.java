package Maps;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        /*1. Red black tree based implementation
        * 2. Cannot have a null key but can have a multiple null values
        * 3. Maintains Ascending order*/


        TreeMap<Integer, String> map = new TreeMap<>();

        // 1. put(K key, V value) - Insert elements (Sorted order)
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(4, "Date");
        map.put(2, "Banana");

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

        // 10. firstKey() - Get first (lowest) key
        System.out.println("First key: " + map.firstKey());

        // 11. lastKey() - Get last (highest) key
        System.out.println("Last key: " + map.lastKey());

        // 12. firstEntry() - Get first (lowest) entry
        System.out.println("First entry: " + map.firstEntry());

        // 13. lastEntry() - Get last (highest) entry
        System.out.println("Last entry: " + map.lastEntry());

        // 14. higherKey(K key) - Get next higher key
        System.out.println("Key higher than 2: " + map.higherKey(2));

        // 15. lowerKey(K key) - Get next lower key
        System.out.println("Key lower than 2: " + map.lowerKey(2));

        // 16. higherEntry(K key) - Get next higher key-value pair
        System.out.println("Entry higher than key 2: " + map.higherEntry(2));

        // 17. lowerEntry(K key) - Get next lower key-value pair
        System.out.println("Entry lower than key 2: " + map.lowerEntry(2));

        // 18. ceilingKey(K key) - Get the smallest key greater than or equal to given key
        System.out.println("Ceiling key of 2: " + map.ceilingKey(2));

        // 19. floorKey(K key) - Get the largest key less than or equal to given key
        System.out.println("Floor key of 2: " + map.floorKey(2));

        // 20. ceilingEntry(K key) - Get entry with smallest key ≥ given key
        System.out.println("Ceiling entry of 2: " + map.ceilingEntry(2));

        // 21. floorEntry(K key) - Get entry with largest key ≤ given key
        System.out.println("Floor entry of 2: " + map.floorEntry(2));

        // 22. descendingMap() - Get reversed order map
        System.out.println("Descending map: " + map.descendingMap());

        // 23. subMap(K fromKey, K toKey) - Get sub-map within range (exclusive of toKey)
        System.out.println("SubMap (1 to 3): " + map.subMap(1, 3));

        // 24. headMap(K toKey) - Get sub-map before given key (exclusive)
        System.out.println("HeadMap (before key 3): " + map.headMap(3));

        // 25. tailMap(K fromKey) - Get sub-map from given key (inclusive)
        System.out.println("TailMap (from key 2): " + map.tailMap(2));

        // 26. putIfAbsent(K key, V value) - Insert if key is absent
        map.putIfAbsent(5, "Elderberry");
        System.out.println("Map after putIfAbsent(5, 'Elderberry'): " + map);

        // 27. replace(K key, V value) - Replace value for a key
        map.replace(2, "Blueberry");
        System.out.println("Map after replace(2, 'Blueberry'): " + map);

        // 28. replace(K key, V oldValue, V newValue) - Replace if old value matches
        map.replace(2, "Blueberry", "Blackberry");
        System.out.println("Map after conditional replace(2, 'Blueberry', 'Blackberry'): " + map);

        // 29. clear() - Remove all elements
        map.clear();
        System.out.println("Map after clear(): " + map);

        // 30. isEmpty() - Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
