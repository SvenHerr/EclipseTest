package Streams;

import java.io.FileWriter;

public class FileWriterClass 
{
	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter("newText.txt");)
		{
			fw.write("Hello World!   " + FileWriterClass.class );
			fw.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
