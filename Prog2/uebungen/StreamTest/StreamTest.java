package StreamTest;

import java.io.FileWriter;

public class StreamTest 
{
	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter("StreamTestFile.txt");)
		{
			fw.write("Hello World!");
			fw.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
