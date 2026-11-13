//Different Ways to Print a 2D Array in Java

//3. Using Arrays.toString()

/*
The Arrays.toString() method can be used to 
convert each one-dimensional row into a readable string. 
We can call it for every row of the 2D array.
*/

import java.util.Arrays;

class program3
{
    public static void main(String[] args)
    {
        int[][] mat ={
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        for(int[] row : mat)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}

/*
o/p:
        [1, 2, 3]
        [4, 5, 6]
        [7, 8, 9]

*/