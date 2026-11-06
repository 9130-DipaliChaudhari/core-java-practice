// Check whether key exists

import java.util.*;

public class program3
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "java");
        map.put(102, "python");

        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(105));
    }
}

/*
o/p:
    true
    false
    
*/