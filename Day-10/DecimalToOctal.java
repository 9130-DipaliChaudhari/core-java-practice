class DecimalToOctal
{
    public static void main(String[] args)
    {
        int n=17;
        int[] octal = new int[32];
        int i =0;

        while(n > 0)
        {
            octal[i] = n % 8;
            n = n / 8;
            i++;
        }

        System.out.println("octal: ");
        for(int j = i - 1; j >= 0; j--)
        {
            System.out.print(octal[j]);
        }
    }
}
