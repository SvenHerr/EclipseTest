package Streams;

import java.io.*;

public class FileReaderClass 
{
	public static void main(String[]args) 
	{
		try(FileReader fr = new FileReader("hello.txt");)
		{
			char[] data = new char[25];
			int n = -1;
			while (true)
			{
				n = fr.read(data, 0, data.length);
				if (n == -1) 
				{
					break;
				}
				String s = new String(data, 0, n);
				System.out.println(s);
			}
			fr.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
