// Remove All Elements from Queue

import java.util.*;

public class program7
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        q.add("Apple");
        q.add("Mango");
        q.add("Cheery");

       q.clear();

       System.out.println(q);
    }
}

/*
o/p:
    []
*/