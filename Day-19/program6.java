// Find the size of LinkedList

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

        System.out.println("Size of LinkedList is: " + list.size());
    }
}
// o/p: Size of LinkedList is: 4