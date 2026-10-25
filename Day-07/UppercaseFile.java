import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class UppercaseFile
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("demo.txt");

			StringBuilder sb = new StringBuilder();
			int ch;

			while((ch = fr.read()) != -1)
			{
				sb.append((char) ch);
			}

			fr.close();

			String data = sb.toString().toUpperCase();

            FileWriter fw = new FileWriter("demo.txt");
            fw.write(data);
            fw.close();

            System.out.println("File converted to uppercase successfully.");
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
		}
	}
}
