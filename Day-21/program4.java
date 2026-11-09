// Stack is a linear data structure that follows FIFO

// Search an element

import java.util.Stack;


public class program4
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.search(30));

        System.out.println(s.search(0));
    }
}

/*
o/p:
    2
    -1
*/