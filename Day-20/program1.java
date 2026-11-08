// Java Queue follows FIFO principle

// Create and Display Queue

import java.util.*;

public class program1
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q);
    }
}

//o/p: [10, 20, 30, 40]