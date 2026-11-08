// Java Queue follows FIFO principle

// Find Size of Queue

import java.util.*;

public class program5
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        q.add("Java");
        q.add("Python");
        q.add("SQL");

        System.out.println("Size of Queue is: " + q.size());
    }
}

// o/p: Size of Queue is: 3