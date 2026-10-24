import java.io.File;
import java.io.IOException;

class CreateFile 
{
	public static void main(String Arr[])
	{
		try
		{
			File f= new File("demo.txt");

			if(f.createNewFile())
			{
				System.out.println("File created successfully.");
			}
			else
			{
				System.out.println("File already exits.");
			}
		}

		catch(IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
