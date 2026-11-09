// Stack is a linear data structure that follows FIFO

// Reverse a string using stack

import java.util.Stack;


public class program5
{
    public static void main(String[] args)
    {
        Stack<Character> s = new Stack<>();
        String str = "Java";

        for(int i = 0; i < str.length(); i++)
        {
            s.push(str.charAt(i));
        }

        String reverse = " ";

        while(!s.empty())
        {
            reverse = reverse + s.pop();
        }

        System.out.println("Original: " + str);

        System.out.println("Reverse: " + reverse);
        
    }
}

/*
o/p:
    Original: Java
    Reverse:  avaJ
*/