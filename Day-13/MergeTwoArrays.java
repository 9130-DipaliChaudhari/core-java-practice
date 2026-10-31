import java.util.Scanner;
import java.util.Arrays;


public class MergeTwoArrays
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first array size: ");
        int firstSize = scanner.nextInt();

        int[] firstArray = new int[firstSize];

        System.out.println("Enter first array elements:");

        for(int i =0; i < firstSize; i++)
        {
            firstArray[i] = scanner.nextInt();
        }

        System.out.println("Enter second array size:");
        int secondSize=scanner.nextInt();

        int[] secondArray = new int[secondSize];

        System.out.println("Enter second array elements:");

        for(int i =0; i < secondSize; i++)
        {
            secondArray[i] = scanner.nextInt();
        }

        int[] mergedArray = new int[firstSize + secondSize];

        for(int i = 0; i < firstSize; i++)
        {
            mergedArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondSize; i++)
        {
            mergedArray[firstSize + i] = secondArray[i];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        scanner.close();
    }    
}

/*
o/p:

Enter first array size: 3
Enter first array elements:
10 20 30

Enter second array size: 3
Enter second array elements:
40 50 60

Merged Array: [10, 20, 30, 40, 50, 60]

*/
