import java.io.*;
import java.util.Scanner;

class StringToInteger 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numeric string: ");
        String input = scanner.nextLine();

        try
        {
            int number = Integer.parseInt(input); 
            // Integer.parseInt() converts a numeric string into a primitive int.
            System.out.println("Integer value: " + number);
        }
        catch(NumberFormatException exception)
        {
            System.out.println("Invalid numeric string.");
        }

        scanner.close();
    }
}

/*
o/p:

Enter a numeric string: 12345
Integer value: 12345


*/