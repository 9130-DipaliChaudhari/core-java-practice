// Reverse a LinkedList

import java.util.*;

public class program5
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.reverse(list);

        System.out.println(list);
    }
}
// o/p: [40, 30, 20, 10]