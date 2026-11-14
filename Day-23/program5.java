//Program 5: Find Largest Element in Array

import java.util.*;

public class Program5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("Largest Number: " + max);

        sc.close();
    }
}

/*
Enter 5 numbers:
10 50 20 80 30
Largest Number: 80
*/