//Program 4: Check Palindrome String

import java.util.*;

public class Program4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length()-1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}

/*
Enter a String:
madam
Palindrome String
*/