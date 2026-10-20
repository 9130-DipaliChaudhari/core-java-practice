class PrimeNumber
{
	public static void main(String Arr[])
	{
		int num=7;
		boolean isPrime=true;

		if(num <= 1)
		{
			isPrime=false;
		}
		else
		{
			for(int i=2; i < num; i++)
			{
				if(num % i == 0)
				{
					isPrime=false;
					break;
				}
			}
		}

		if(isPrime)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
