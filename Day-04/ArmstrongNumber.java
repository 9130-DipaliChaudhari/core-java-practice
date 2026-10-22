//An Armstrong Number is a number whose sum of each digit raised to the power of the total number of digits equals the original number.

//Example: 153 
			//1^3+5^3+3^3=1+125+27=153

class ArmstrongNumber
{
	public static void main(String Arr[])
	{
		int num=153;
		int original = num; // stores the original number
		int sum=0;

		while(num>0)
		{
			int digit = num % 10; // gets the last digit
			sum=sum+digit*digit*digit;// calculate the cube of the digit
			num=num/10;// removes the last digit using integer division
		}

		if(sum==original)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}
}
