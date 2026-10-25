import java.io.FileReader;
import java.io.IOException;

class CountVowels
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("demo.txt");
            int ch;
            int count = 0;

            while ((ch = fr.read()) != -1)
            {
                char c = Character.toLowerCase((char) ch);

                if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u')
                {
                    count++;
                }
            }

            fr.close();

            System.out.println("Total vowels: " + count);
        }
        catch (IOException e)
        {
            System.out.println("Error reading file.");
        }
    }
}