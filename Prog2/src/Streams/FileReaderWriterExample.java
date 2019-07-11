package Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample 
{
	public static void main(String[] args) 
	{
		try(FileReader fr = new FileReader("file2.txt"); FileWriter fw = new FileWriter("textText.txt"))
		{
			int i = 0;
		
			while(i != -1) 
			{
				char[] data = new char[20];
				
				i = fr.read(data, 0, data.length);
				fw.write(data, 0, data.length);
				
				if(i == -1) 
				{
					break;
				}
				
				String s = new String(data, 0, i);
				System.out.print(s);
			}
		}
		catch(IOException e ) 
		{
			e.printStackTrace();
		}
	}
}