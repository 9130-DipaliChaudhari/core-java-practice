// Append File: Adding new data to an existing file without deleting the old data.

import java.io.FileWriter;
import java.io.IOException;

class AppendFile
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw=new FileWriter("demo.txt", true);

			fw.write("Welcome to Java File Handling\n");

			fw.close();

			System.out.println("Data appended successfully.");
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
		}
	}
}
