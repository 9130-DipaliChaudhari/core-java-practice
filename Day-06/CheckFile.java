import java.io.File;

class CheckFile{
	public static void main(String[] args)
	{
		File f=new File("demo.txt");

		if(f.exists())
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does not exist.");
		}
	}
}
