// Remove duplicate elements

import java.util.ArrayList;

class program3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        ArrayList<Integer> unique=new ArrayList<>();

        for(Integer num : numbers)
        {
            // contains() checks whether an element is already present in the list
            if(!unique.contains(num))
            {
                unique.add(num);
            }
        }

        System.out.println(unique);
    }
}

// o/p: [10, 20, 30]