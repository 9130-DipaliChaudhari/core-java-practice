// Fibonacci series : each number is the sum of the previous two numbers.

class FibonacciSeries
{
	public static void main(String Arr[])
	{
		int n=7;
		int first=0;
		int second=1;

		for(int i=1; i<=n; i++)
		{
			System.out.print(first + " ");

			int next=first+second;
			first=second;
			second=next;
		}
	}
}
