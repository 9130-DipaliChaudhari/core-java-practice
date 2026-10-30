class DecimalArrayToBinary
{
    public static void main(String[] args)
    {
        int[] numbers={10,15,20,25,30};

        System.out.println("Binary Values: ");

        for(int i=0; i<numbers.length; i++)
        {
            String binary = Integer.toBinaryString(numbers[i]);

            System.out.println(numbers[i] + " = " + binary);
        }
    }    
}

/*
o/p:
Binary Values:
10 = 1010
15 = 1111
20 = 10100
25 = 11001
30 = 11110

*/
