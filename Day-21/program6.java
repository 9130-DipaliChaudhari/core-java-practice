// Stack is a linear data structure that follows FIFO

// Reverse a string using stack

import java.util.Stack;

public class program6
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        
        s.push(100);
        s.push(200);

        System.out.println(s.empty());

        s.pop();
        s.pop();

        System.out.println(s.empty());        
    }
}

/*
o/p:
    false
    true
*/