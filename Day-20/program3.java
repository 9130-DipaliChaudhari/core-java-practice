// Java Queue follows FIFO principle

// Display First Element Using Peek
// peek(): Returns the first element.

import java.util.*;

public class program3
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        q.add("Java");
        q.add("Python");
        q.add("SQL");

        System.out.println(q.peek());

    }
}

// o/p: Java