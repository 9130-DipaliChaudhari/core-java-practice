// 4! = 4*3*2*1=24
// 5! = 5*4*3*2*1=120
// 1!+4!+5! = 1 + 24 + 120 = 145

import java.util.Scanner;

class StrongNumber
{
	public static void main(String Arr[])
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

		int original=num;
		int sum=0;

		while(num > 0)
		{
			int digit = num % 10;
			int fact=1;

			for(int i = 1; i <= digit; i++)
			{
				fact=fact*i;
			}

			sum=sum+fact;
			num=num/10;
		}

		if(sum==original)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}

		sc.close();
	}
}

// Enter a number: 145
// Strong number