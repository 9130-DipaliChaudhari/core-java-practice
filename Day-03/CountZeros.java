class CountZeros
{
	public static void main(String Arr[])
	{
		int num=1020304050;
		int count=0;

		while(num>0)
		{
			int digit=num%10;

			if(digit==0)
			{
				count++;
			}

			num=num/10;
		}
		
		System.out.println("Number of zeros: " + count);
	}
}
