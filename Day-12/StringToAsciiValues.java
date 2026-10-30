import java.util.Scanner;

public class StringToAsciiValues
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        System.out.println("Character and ASCII values:");

        for(int index = 0; index < input.length(); index++)
        {
            char character = input.charAt(index);
            //charAt(index) retrieves a character, 
            // and casting it to int displays its numeric value. 
            // ASCII covers values 0–127
            
            System.out.println(character + " : " + (int)character);
        }

        scanner.close();
    }
}

/*
o/p:

Enter a String: Java

Character and ASCII values:
J : 74
a : 97
v : 118
a : 97

*/