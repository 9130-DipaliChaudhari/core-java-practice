// Java Queue follows FIFO principle

// Check Queue is Empty or Not

import java.util.*;

public class program4
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        q.add("Java");
        q.add("Python");
        q.add("SQL");

        if(q.isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Queue is not Empty");
        }

    }
}

// o/p: Queue is not Empty