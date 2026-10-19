class palindromeString
{
    public static void main(String arr[])
    {
        String str="madam";
        String rev=""; // An empty String to store the reversed word.

        // logic
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}