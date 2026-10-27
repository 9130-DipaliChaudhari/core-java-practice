// Star square pattern without diagonals

import java.io.*;

class print_rectangle
{
    // method 1
    // To print hollow rectangle
    static void print_rectangle(int k, int l)
    {
        int a, b;

        // Nested for loop for iterations
        // outer loop for rows
        for(a = 1; a <= k; a++)
        {
            // Inner loop for columns
            for(b = 1; b <= l; b++)
            {
                // Condition check using logical  OR operator
                // over rows and columns positions
                // if found at circumference of rectangle
                if(a == 1 || a == k || b == 1 || b == l)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            // By now we are done with only 1 row so
            // New line
            System.out.println();
        }
    }

    // method 2
    // Main driver method
    public static void main(String args[])
    {
        // declaring and initializing rows and columns
        // for square row = columns

        // Custom input initialization values
        int rows = 8, columns = 22;

        // calling the method 1 to print hellow rectangle
        // pattern
        print_rectangle(rows, columns);
    }
}

/*
o/p:

**********************
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
**********************


*/