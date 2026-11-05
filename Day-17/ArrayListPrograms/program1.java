// Arraylist is a class in java collection framework used to store multiple elements dynamically.
// Add and display elements

import java.util.ArrayList;

class program1
{
    public static void main(String[] args)
    {
        ArrayList<String> names=new ArrayList<>(); // ArrayList<String> stores String values

        names.add("Dipali");     // add() inserts an elelemts
        names.add("Shahuraje");
        names.add("Priya");

        System.out.println(names);
    }
}

/*
o/p:
[Dipali, Shahuraje, Priya]

*/