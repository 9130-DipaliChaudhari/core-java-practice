// check even or odd

import java.util.Scanner;

class LargestNumber
{
	public static void main(String Arr[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number:");
		int a = sc.nextInt();

		System.out.println("Enter a second number:");
		int b = sc.nextInt();

		System.out.println("Enter a third number:");
		int c = sc.nextInt();

		if(a >= b && a >= c)
		{
			System.out.println(a + " is the largest number");
		}
		else if(b >= a && b >= c)
		{
			System.out.println(b + " is the largest number");
		}
		else
		{
			System.out.println(c + " is the lagest number");
		}

		sc.close();
	}
}