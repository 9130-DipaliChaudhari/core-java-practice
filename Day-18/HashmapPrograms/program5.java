import java.util.HashMap;

public class program5
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "English");
        map.put(2, "Hindi");
        map.put(3, "Marathi");

        // clear() method cha return type void aahe
        map.clear();
        //clear() removes all key-value pairs from HashMap.

        System.out.println(map);
    }
}

/*
o/p:    
    {}
*/