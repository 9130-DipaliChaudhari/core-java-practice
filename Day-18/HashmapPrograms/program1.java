// Hashmap is a class in Java collection framework that stores data in key-value pairs
// key must be unique
// values can be duplicate
//does not maintain insertion order

import java.util.*;

public class program1
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        // put() insert key-value pairs
        map.put(101,"Dipali");
        map.put(102,"Dipa");
        map.put(103,"Dip");

        System.out.println(map);
    }
}

// o/p: {101=Dipali, 102=Dipa, 103=Dip}