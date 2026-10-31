import java.util.Scanner;

public class FindDuplicateElements
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter array elements:");

        for(int i=0;i<size;i++)
        {
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Duplicate Elements: ");

        for(int i =0; i <size; i++)
        {
            boolean isDuplicate = false;

            for(int j = 0; j < i; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    isDuplicate=true;
                    break;
                }
            }
        
            if(!isDuplicate)
            {
                for(int j = i + 1; j < size; j++)
                {
                    if(numbers[i] == numbers[j])
                    {
                        System.out.println(numbers[i] + " ");
                        break;
                    }
                }
            }
        }
        
        scanner.close();
    }    
}

/*
o/p:
Enter array size: 7
Enter array elements:
10 20 30 20 40 10 50

Duplicate Elements: 10 20
*/