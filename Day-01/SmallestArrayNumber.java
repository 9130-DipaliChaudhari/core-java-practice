// find the Smallest number in an array

class SmallestArrayNumber
{
	public static void main(String Arr[])
	{
		int arr[]={10,20,30,40,50};

		int smallest=arr[0];

		for(int i =1; i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}

		System.out.println("Smallest number="+ smallest);
	}
}