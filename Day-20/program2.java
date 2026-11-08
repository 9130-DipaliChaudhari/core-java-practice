// Java Queue follows FIFO principle

// Remove Element from Queue. 
// poll(): Removes the first element.

import java.util.*;

public class program2
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Before: " + q);

        // Removes the first element.
        q.poll();

        System.out.println("After: " + q);
    }
}

/*
o/p:

Before: [10, 20, 30, 40]
After: [20, 30, 40]

*/