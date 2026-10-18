// find the largest number in an array

class LargestArrayNumber
{
	public static void main(String Arr[])
	{
		int[] arr={10,20,30,40,50};
		int largest=arr[0];

		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}

		System.out.println("Largest number=" +largest);
	}
}