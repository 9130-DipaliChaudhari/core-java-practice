class countWords
{
    public static void main(String arr[])
    {
        String str="i am happy";
        int count=0;

        for(int i =0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch==' ') // checks whether the current character is a space.
            {
                count++; // increases the count by one when a space is found.
            }
        }

        count=count+1;

        System.out.println("Number of words: " + count);
    }
}