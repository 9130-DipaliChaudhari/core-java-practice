class CountDigitFrequency
{
	public static void main(String Arr[])
	{
		int num=122333;
		int target=3;
		int count=0;

		while(num>0)
		{
			int digit=num%10;

			if(digit==target)
			{
				count++;
			}

			num=num/10;
		}

		System.out.println(" Digit " + target + " appears " + count + " times ");
	}
}
