//Different Ways to Print a 2D Array in Java
//1. Using Nested for Loop

class program1
{
    static void print2D(int[][] mat)
    {
        // Traverse rows
        for(int i = 0; i < mat.length; i++)
        {
            // Traverse columns
            for(int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
        int[][] mat ={
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        print2D(mat);
    }
}

/*
o/p:
        1 2 3
        4 5 6
        7 8 9
*/