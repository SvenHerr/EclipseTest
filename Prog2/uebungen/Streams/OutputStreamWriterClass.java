package Streams;

import java.io.*;

public class OutputStreamWriterClass 
{
	public static void main(String[] args)
	{
		try(FileOutputStream fos = new FileOutputStream("helloooo.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos))
			{
				osw.write("Hello World! Test" + OutputStreamWriterClass.class);
				//osw.close(); // schließt auch fos. Wird aber nicht benötigt da try-with resources benutzt ist.
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}

}
