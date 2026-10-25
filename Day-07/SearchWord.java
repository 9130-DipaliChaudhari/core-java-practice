import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class SearchWord
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("demo.txt"));

            String line;
            String word = "Java";
            boolean found = false;

            while((line = br.readLine()) != null)
            {
                if(line.contains(word))
                {
                    found = true;
                    break;
                }
            }

            br.close();

            if(found)
            
                System.out.println("Word found.");
            else
                System.out.println("Error reading file.");
        }
        catch(IOException e)
        {
            System.out.println("Error reading file.");
        }
    }
}
