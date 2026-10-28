import java.io.*;

class DecimalToBinary
{
    static int binaryToDecimal(int n)
    {
       int decimal=0;
       int base=1;

       while(n > 0)
       {
        int lastDigit = n % 10;
        decimal = decimal + lastDigit * base;
        base = base * 2;
        n = n / 10;
       }

       return decimal;
    }

    // Driver program
    public static void main(String[] args)
    {
        int n=10001;

        System.out.println("Binary : " + n);
        System.out.println("Decimal : " + binaryToDecimal(n));
        
    }
}
