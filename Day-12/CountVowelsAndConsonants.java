import java.util.Scanner;
import java.util.Locale;

public class CountVowelsAndConsonants
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        int vowels = 0;
        int consonants = 0;

        for (int index = 0; index < input.length(); index++) {
            char character = input.charAt(index);

            if (character >= 'a' && character <= 'z')
                 {
                if ("aeiou".indexOf(character) != -1)
                {
                    vowels++;
                } 
                else
                {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanner.close();
    }
}

/*
o/p:

Enter a string: Java Developer
Vowels: 5
Consonants: 7

*/