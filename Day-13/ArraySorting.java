import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter array elements: ");

        for(int i =0; i <size; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Ascending Order: " + Arrays.toString(numbers));

        System.out.print("Descending Order: ");

        for(int i = size - 1; i >= 0; i--)
        {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }    
}

/*
o/p:
Enter array size: 5
Enter array elements: 20
60
80
30
10
Ascending Order: [10, 20, 30, 60, 80]
Descending Order: 80 60 30 20 10

*/
