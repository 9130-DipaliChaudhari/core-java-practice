import java.io.FileWriter;
import java.io.IOException;

class WriteFile  
{
	public static void main(String Arr[])
	{
		try
		{
			FileWriter fw= new FileWriter("demo.txt");

			fw.write("Hello, Java file handling!");

			fw.close();

			System.out.println("Data written successfully.");
		}

		catch(IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
