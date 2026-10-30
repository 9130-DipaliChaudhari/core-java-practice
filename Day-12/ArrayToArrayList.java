import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList
{
    public static void main(String[] args)
    {
        Integer[] numbers = {10, 20, 30, 40, 50};

        List<Integer> arrayList=new ArrayList<>(Arrays.asList(numbers));

        System.out.println("ArrayList: " + arrayList);
    }
} 

/*
o/p: 
    ArrayList: [10, 20, 30, 40, 50]

*/