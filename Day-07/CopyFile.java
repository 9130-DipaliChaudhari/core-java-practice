import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class CopyFile
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("demo.txt");
			FileWriter fw=new FileWriter("copy.txt");
			
			int ch;

			while((ch = fr.read()) != -1)
			{
				fw.write(ch);
			}

			fr.close();
			fw.close();

			System.out.println("File copied successfully");
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
		}
	}
}
