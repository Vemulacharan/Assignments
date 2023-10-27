package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpecifiedKey {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> list = new HashMap<>();

        list.put(101, "Tirupati");
        list.put(102, "Chennai");
        list.put(103, "Banglore");
        list.put(104, "Mumbai");
        list.put(105, "Delhi");
        
        System.out.println(list);

        Integer specifiedKey = 103;

        
        String value = list.get(specifiedKey);

        
        if (value != null) {
            System.out.println("Value for key '" + specifiedKey + "': " + value);
        } else {
            System.out.println("Key '" + specifiedKey + "' not found in the HashMap.");
        }

        
        System.out.println("Key Set of the HashMap:");
        Set<Integer> keySet = list.keySet();
        for (Integer key : keySet) {
            System.out.println(key);
        }
    }
}
