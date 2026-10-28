class OctalToDecimal
{
    public static void main(String[] args)
    {
        int n = 21;
        int decimal = 0;
        int base = 1;

        while(n > 0)
        {
            int digit = n % 10;//21%10= 1, 2
            decimal = decimal + digit * base; // 0+1*1= 1, 1+2*8=17
            base = base * 8;//1*8=8, 8*8 = 64
            n = n / 10;//2 , 2/10= 0
        }
        System.out.println("Decimal: " + decimal);
    }
}
