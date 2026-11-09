// Stack is a linear data structure that follows FIFO

// Create and Display Stack

import java.util.Stack;

public class program1
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();

        // push() add elements to the top of the Stack
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        System.out.println(s);
    }
}

//o/p: [10, 20, 30, 40]