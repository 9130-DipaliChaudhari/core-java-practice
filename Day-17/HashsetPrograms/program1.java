// Arraylist is a class in java collection framework that store unique elements 
// not allow duplicate,not maintain insertion order
// allow one null element
// Add and display elements

import java.util.HashSet;

class program1
{
    public static void main(String[] args)
    {
        HashSet<Integer> set=new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
    
        System.out.println(set);
    }
}

/*
The order of elements is not guaranteed
All elements are unique
*/

// o/p: [20, 40, 10, 30]