class countVowelsConsonants
{
    public static void main(String Arr[])
    {
        String str="Hello";
        int vowels=0;
        int consonants=0;

        str=str.toLowerCase(); // converts uppercase letters to lowercase.

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);//gets the character at index i

            if(ch >= 'a' || ch <= 'z')//checks whether the character is an English alphabet letter.
            {
                if(ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }

        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + consonants);
    }
}