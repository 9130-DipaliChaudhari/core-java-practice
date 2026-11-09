// Stack is a linear data structure that follows FIFO

// Find stack size

import java.util.Stack;

public class program7
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        
        s.push(100);
        s.push(200);

        System.out.println("Size: " + s.size());

        //pop() removes last inserted element
        s.pop();

        System.out.println("After removing: " + s.size());
       
    }
}

/*
o/p:
    Size: 2
    After removing: 1
*/