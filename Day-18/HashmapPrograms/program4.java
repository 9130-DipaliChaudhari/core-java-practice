import java.util.HashMap;

public class program4
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "English");
        map.put(2, "Hindi");
        map.put(3, "Marathi");

        System.out.println(map.remove(3));
        System.out.println(map.get(3));
    }
}

/*
o/p:    
    Marathi
    null
*/