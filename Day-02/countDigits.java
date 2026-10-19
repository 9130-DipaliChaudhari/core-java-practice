class countDigits
{
    public static void main(String Arr[])
    {
        int num = 1235;
        int count=0;

        while(num>0)// When num becomes 0, the while loop stops.
        {
            num=num/10;
            count++;
        }

        System.out.println("Number of digits:" + count);

    }
}