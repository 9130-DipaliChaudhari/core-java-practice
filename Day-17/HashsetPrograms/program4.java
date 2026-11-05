// Find the Size of HashSet
import java.util.HashSet;

class program4
{
  public static void main(String[] args)
  {
    HashSet<Integer> set=new HashSet<>();

    set.add(10);
    set.add(10);
    set.add(20);
    set.add(10);

    System.out.println("Size: " + set.size());
  }
}

// o/p: Size: 2   (duplicate not allowed in hashset)