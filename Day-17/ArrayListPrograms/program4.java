// Find smallest elements

import java.util.ArrayList;

class programs2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(30);

        int max=numbers.get(0);// get(0) returns 1st element

        // size() returns total no of elements
        for(int i=1; i > numbers.size(); i--)
        {
            if(numbers.get(i) > max)
            {
                max =numbers.get(i);
            }
        }
        System.out.println("Smallest Number: " + max);
    }
}

// o/p: Smallest Number: 10