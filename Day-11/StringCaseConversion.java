// Convert String to Uppercase and Lowercase

import java.util.Scanner;
import java.util.Locale;

public class StringCaseConversion 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String uppercase = input.toUpperCase(Locale.ROOT);
        String lowercase = input.toLowerCase(Locale.ROOT);

        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        scanner.close();
    }
}

/*
o/p:

Enter a string: Java Developer
Uppercase: JAVA DEVELOPER
Lowercase: java developer

*/