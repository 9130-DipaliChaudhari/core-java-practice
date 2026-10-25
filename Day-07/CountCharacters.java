import java.io.FileReader;
import java.io.IOException;

class CountCharacters
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr=new FileReader("demo.txt");

			int ch;
			int count=0;

			while((ch = fr.read()) != -1)
			{
				count++;
			}

			fr.close();

			System.out.println("Total characters: " + count);
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
		}
	}
}
