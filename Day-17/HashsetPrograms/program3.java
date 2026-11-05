// Chcek whether an element exists

import java.util.HashSet;

class program3
{
    public static void main(String[] args)
    {
          HashSet<String> names = new HashSet<>();

          names.add("Dipali");
          names.add("Dips");
          names.add("Dip");

          // contains() check whether the specified element exists in the HashSet
          if(names.contains("Dip"))
          {
            System.out.println("Element is present");
          }
          else
          {
            System.out.println("Element is not present");
          }
    }
}

//o/p: Element is present