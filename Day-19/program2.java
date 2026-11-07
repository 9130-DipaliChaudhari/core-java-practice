// Add elements at first and last position

import java.util.LinkedList;

public class program1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(20);
        list.add(30);

        list.addFirst(10);
        list.addLast(40);

        System.out.println(list);
    }
}

// o/p: [10, 20, 30, 40]

