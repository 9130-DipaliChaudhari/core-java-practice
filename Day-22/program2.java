//Different Ways to Print a 2D Array in Java
//2. Using Nested for-each Loop

class program2
{
    static void print2D(int[][] mat)
    {
        for(int[] row : mat)
        {
            for(int value : row)
            {
                System.out.print(value + " ");
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