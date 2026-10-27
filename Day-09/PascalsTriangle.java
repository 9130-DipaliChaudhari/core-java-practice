// Pascal’s Triangle is a triangular pattern where each element is the sum of the two elements directly above it, based on binomial coefficients (nCr).

import java.io.*;

// Main Class
public class PascalsTriangle
{
    // method 1
    // to find factorial of a number
    public int factorial(int a)
    {
        if(a == 0)
            return 1;

        return a * factorial(a-1);
    }

    // Method 2 
    // Main driver method
    public static void main(String[] args)
    {
        int k = 4;

        int a, b;

        PascalsTriangle pt = new PascalsTriangle();

        for(a=0; a <= k; a++)
        {
            // Inner loop 1
            for(b = 0; b <= k - a; b++)
            {
                System.out.print(" ");
            }

            // Inner loop 2
            for(b=0; b <= a; b++)
            {
                // nCr formula
                System.out.print(" " + pt.factorial(a) / (pt.factorial(a - b) * pt.factorial(b)));
            }

            System.out.println();
        }

    }
}

/*
o/p:

      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1

*/