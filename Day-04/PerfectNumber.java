import java.util.Scanner;

class PerfectNumber
{
	public static void main(String Arr[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Write a number :");
		int num=sc.nextInt();

		int sum=0;

		for(int i=1; i < num; i++)
		{
			if(num % i == 0) 

			sum=sum + i;
		}

		if(sum==num)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("NOt A perfect number`");
		}

	}
}