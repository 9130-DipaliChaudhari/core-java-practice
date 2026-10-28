class HexadecimalToDecimal 
{
    public static void main(String[] args)
    {
        String hex = "1A";
        int decimal = 0;

        for(int i = 0; i < hex.length(); i++)
        {
            char ch = Character.toUpperCase(hex.charAt(i));
            int digit;

            if(ch >= '0' && ch <= '9')
            {
                digit = ch - '0';
            }
            else
            {
                digit = ch - 'A' + 10;
            }

            decimal = decimal * 16 + digit;
        }

        System.out.println("Decimal: " + decimal);
    }   
}

// op : Decimal: 26