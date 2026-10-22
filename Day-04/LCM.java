import java.util.Scanner;

class LCM
{
	public static void main(String Arr[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a =sc.nextInt();

		System.out.println("Enter second number: ");
		int b=sc.nextInt();

		int max=(a>b) ? a:b;

		while(true)
		{
			if(max % a == 0 && max % b == 0)
			{
				System.out.println("LCM = " + max); 
				break;
			}
			max++;
		}

		sc.close();
	}
}