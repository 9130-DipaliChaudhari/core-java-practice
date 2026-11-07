// Intermediate Linkedlist:
// Search an elements in linkedlist

import java.util.LinkedList;

public class program4
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("SQL");

        if(list.contains("Java"))
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}

// o/p: Element found
