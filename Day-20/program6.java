// Java Queue follows FIFO principle

// Iterate Queue Using For-Each Loop

import java.util.*;

public class program6
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        q.add("Apple");
        q.add("Mango");
        q.add("Cheery");

        for(String language : q)
        {
            System.out.println(language);
        }
    }
}

/*
o/p:
    Apple
    Mango
    Cheery

*/