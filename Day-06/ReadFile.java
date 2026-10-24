import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile
{
	public static void main(String Arr[])
	{
		try
		{
			File f=new File("demo.txt");
			Scanner sc=new Scanner(f);

			while(sc.hasNextLine())
			{
				String data=sc.nextLine();
				System.out.println(data);
			}

			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
}
