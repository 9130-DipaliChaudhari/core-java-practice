//Different Ways to Print a 2D Array in Java

//4. Using Arrays.deepToString()

/*
The Arrays.deepToString() method can directly
 convert a multidimensional array into a 
 readable string representation.
*/
import java.util.Arrays;

class program4
{
    public static void main(String[] args)
    {
        int[][] mat ={
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        System.out.println(Arrays.deepToString(mat));
    }
}

/*
o/p:
    [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
*/