import java.util.*;

class IntegerToString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String result = String.valueOf(number); 
        // String.valueOf() converts the integer to a String. Another option is Integer.toString(number).

        System.out.println("String value: " + result);
        System.out.println("Data type: String");

        scanner.close();
    }
}

/*
o/p:

Enter an integer: 12345
String value: 12345
Data type: String

*/