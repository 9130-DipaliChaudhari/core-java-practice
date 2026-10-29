import java.util.Scanner;

public class RemoveSpacesFromString 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = input.replace(" ", "");
        // replace(" ", "") removes ordinary space characters throughout the string.
        // To remove all whitespace characters, including tabs,
        // you can use replaceAll("\\s+", "").

        System.out.println("String without spaces: " + result);

        scanner.close();
    }
}

/*
o/p:

Enter a string: Java Developer
String without spaces: JavaDeveloper

*/
