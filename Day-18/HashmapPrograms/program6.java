// Get keyset of mashmap

import java.util.HashMap;

public class program6
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "English");
        map.put(2, "Hindi");
        map.put(3, "Marathi");

        // Prints key
        for(Integer i : map.keySet())
        {
            System.out.println(i);
        }
    }
}

/*
o/p:    
    1
    2
    3

*/