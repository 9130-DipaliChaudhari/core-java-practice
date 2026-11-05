// Remove duplicate elements

import java.util.HashSet;

class program2
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,10,30,20,50,40};

        HashSet<Integer> set=new HashSet<>();

        for(int num: arr)
        {
            set.add(num);
        }

        System.out.println(set);
    }
}

//o/p:[50, 20, 40, 10, 30]