import java.util.Scanner;
import java.util.Arrays;

class CharArrayToString 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter characters without spaces: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();
        String result = new String(characters);

        System.out.print("Converted String: " + result);

        scanner.close();
    }
}

/*
o/p:
Enter characters without spaces: Java
Converted string: Java

*/