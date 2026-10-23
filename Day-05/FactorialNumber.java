import java.util.Scanner;

class FactorialNumber
{
	public static void main(String Arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();

		int fact=1;

		for(int i =1; i <= num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: " + fact);

		sc.close();
	}
}
