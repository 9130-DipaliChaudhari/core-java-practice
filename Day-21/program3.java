// Stack is a linear data structure that follows FIFO

// Find top element using peek()

import java.util.Stack;

public class program3
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<>();

        s.push("BMW");
        s.push("Swift");
        s.push("Thar");
        
        System.out.println("Top element: " + s.peek());

        System.out.println("Stack: " + s);
    }
}

/*
o/p:
    Top element: Thar
    Stack: [BMW, Swift, Thar]
*/