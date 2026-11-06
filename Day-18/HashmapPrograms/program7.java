// Get values of mashmap

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
        for(String i : map.values())
        {
            System.out.println(i);
        }
    }
}

/*
o/p:    
    English
    Hindi
    Marathi
*/