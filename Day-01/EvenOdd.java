// check even or odd

import java.util.Scanner;

class EvenOdd
{
	public static void main(String Arr[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int number = sc.nextInt();

		if(number%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}