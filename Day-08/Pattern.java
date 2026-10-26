class Pattern 
{
    public static void main(String[] args)
    {
        for(int i=1; i <= 5; i++)
        {
            for(int j= i; j >= 1; j--)
            {
                for(int k = 1; k <= j; k++)
                {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
 