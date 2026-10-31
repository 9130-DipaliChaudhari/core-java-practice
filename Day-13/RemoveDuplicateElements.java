public class RemoveDuplicateElements
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers=new int[size];

        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++)
        {
            numbers[i]=scanner.nextInt();
        }

        int uniqueCount = 0;

        for(int i = 0; i < size; i++)
        {
            boolean isDuplicate = false;

            for(int j = 0; j < uniqueCount; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    isDuplicate=true;
                    break;
                }
            }

            if(!isDuplicate)
            {
                numbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates: ");

        for(int i = 0; i < uniqueCount; i++)
        {
            System.out.println(numbers[i] + " ");
        }

        scanner.close();
    }    
}

/*
o/p:
Enter array size: 7
Enter array elements:
10 20 30 20 40 10 50

Array after removing duplicates: 10 20 30 40 50

*/