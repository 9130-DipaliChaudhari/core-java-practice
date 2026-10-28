class DecimalToHexadecimal
{
    public static void main(String[] args)
    {
        int n = 26;

        String hex = "";

        while(n > 0)
        {
            int remainder = n % 16;

            if(remainder < 10)
            {
                hex = remainder + hex;
            }
            else
            {
                hex = (char) ('A' + remainder -10) + hex;
            }

            n = n / 16;
        }

        System.out.println("Hexadecimal: " + hex);
    }   
}

// op : Hexadecimal: 1A