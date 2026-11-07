// Remove 1st and last elements

import java.util.LinkedList;

public class program1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}

// o/p: [20, 30]

