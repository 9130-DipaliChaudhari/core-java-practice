//Program 2: Find Factorial of a Number

import java.util.*;

public class program2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= num; i++)
        {
            fact = fact*i;
        }

        System.out.println("Factorial: " + fact);

        sc.close();
    }
}

/*
Enter a number:
5
Factorial: 120
*/