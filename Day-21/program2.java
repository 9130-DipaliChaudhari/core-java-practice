// Stack is a linear data structure that follows FIFO

// Remove top element

import java.util.Stack;

public class program2
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println("Before: " + s);
        //pop() removes last inserted element
        System.out.println("Removed:" + s.pop());
        System.out.println("After Removed: " + s);
    }
}

/*
o/p:
    Before: [10, 20, 30]
    Removed:30
    After Removed: [10, 20]
*/