// Retrieve value using key

import java.util.*;

public class program2
{
    public static void main(String[] args)
    {
        // Create a hashmap object called map
        HashMap<Integer, String> map=new HashMap<>();

        //To add items to a HashMap, use the put() method
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"SQL");

        // Retrieve a value by key
        System.out.println(map.get(2)); // returns python
    }
}

// o/p: Python 
// otherwise when key is not match o/p is null.