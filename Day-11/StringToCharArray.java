import java.util.Scanner;
import java.util.Arrays;

class StringToCharArray 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();

        System.out.print("Character array: " + Arrays.toString(characters));

        scanner.close();
    }
}

/*
o/p:

Enter a string: Java
Character array: [J, a, v, a]

*/