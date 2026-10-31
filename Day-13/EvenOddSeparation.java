import java.util.Scanner;

public class EvenOddSeparation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=scanner.nextInt();

        int[] numbers=new int[size];

        System.out.print("Enter array elements: ");

        for(int i = 0; i < size; i++)
        {
            numbers[i]=scanner.nextInt();
        }

        System.out.print("Even numbers: ");

        for(int number : numbers)
        {
            if(number % 2 == 0)
            {
                System.out.print(number + " ");
            }
        }
        
        System.out.print("\nOdd Numbers: ");

        for(int number : numbers)
        {
            if(number % 2 != 0)
            {
                System.out.print(number + " ");
            }
        }
    
        scanner.close();        
    }
}
/*
o/p:
Enter array size: 10
Enter array elements: 1
2
3
4
5
6
7
8
9
10
Even numbers: 2 4 6 8 10
Odd Numbers: 1 3 5 7 9


*/