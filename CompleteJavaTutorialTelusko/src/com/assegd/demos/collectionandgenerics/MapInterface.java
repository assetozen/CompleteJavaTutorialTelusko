package com.assegd.demos.collectionandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * To differentiate values we use key-value mapping
 **/
public class MapInterface {
    public static void main(String[] args) {
        implementingMapUsingHashMap();
        implementingMapUsingHashTable();

    }

    public static void implementingMapUsingHashMap() {
        System.out.println("Implementing Map using HashMap which is not synchronized - not ordered");
        System.out.println("if you dont want Thread safety go for HashMap");
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Assegd");
        map.put("actor", "John");
        map.put("ceo", "Marissa");
        map.put("actor", "Vandame"); // repeating key will overwrite the previous value
        map.put("lastname", "Assegd"); // repeating value for a different key will do nothing

        System.out.println("\nDispalying all data");
        System.out.println(map);

        System.out.println("\nDisplaying single data");
        System.out.println(map.get("myName"));

        System.out.println("\nDisplaying all value by their key values");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static void implementingMapUsingHashTable() {
        System.out.println("Implementing Map using HashTable which is synchronized ordered");
        System.out.println("if you  want Thread safety go for HashTable: ");
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Assegd");
        map.put("actor", "John");
        map.put("ceo", "Marissa");
        map.put("actor", "Vandame"); // repeating key will overwrite the previous value
        map.put("lastname", "Assegd"); // repeating value for a different key will do nothing

        System.out.println("\nDispalying all data");
        System.out.println(map);

        System.out.println("\nDisplaying single data");
        System.out.println(map.get("myName"));

        System.out.println("\nDisplaying all value by their key values");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
