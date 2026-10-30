import java.util.Arrays;

public class StringArrayToIntegerArray
{
    public static void main(String[] args)
    {
        String[] stringArray = {"10", "20", "30", "40", "50"};

        Integer[] IntegerArray = new Integer[stringArray.length];

        for(int i = 0; i < stringArray.length; i++)
        {
            IntegerArray[i] = Integer.parseInt(stringArray[i]);
        }

        System.out.println("Integer Array: " + Arrays.toString(IntegerArray));
    }
}

/*
o/p:
Integer Array: [10, 20, 30, 40, 50]

*/