import java.util.Scanner;

public class SecondLargestElement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size=scanner.nextInt();

        if(size < 2)
        {
            System.out.println("Array must contain at least 2 elements.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter array elements:");
        
        for(int i =0; i < size; i++)
        {
            numbers[i]=scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        boolean found = false;

        for(int number : numbers)
        {
            if(number > largest)
            {
                SecondLargest = largest;
                largest=number;
            }
            else if(number > SecondLargest && number < largest)
            {
                SecondLargest=number;
                found=true;
            }
        }

        if(found)
        {
            System.out.println("Second Largest Element: " + SecondLargest);
        }
        else
        {
            System.out.println("Second largest distict element does not exits.");
        }

        scanner.close();
    }    
}

/*
o/p:

Enter array size: 5
Enter array elements:
10 50 30 20 40

Second Largest Element: 40

*/