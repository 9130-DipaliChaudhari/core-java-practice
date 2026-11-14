//Program 3: Reverse a Number

import java.util.*;

public class program3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;

        while(num > 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reverse: " + rev);

        sc.close();
    }
}

/*
Enter a number:
1234
Reverse: 4321
*/