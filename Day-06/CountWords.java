import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CountWords
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("demo.txt");
			Scanner sc = new Scanner(f);

			int count=0;

			while(sc.hasNext())
			{
				sc.next();
				count++;
			}

			sc.close();

			System.out.println("Total words: " + count);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}
}
