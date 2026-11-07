// LinkedList ia a class in java collection framework

import java.util.LinkedList;

public class program1
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("SQL");
        list.add("HTML");

        System.out.println(list);
    }
}

// o/p: [Java, Python, SQL, HTML]