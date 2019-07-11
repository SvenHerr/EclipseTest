package Streams;

import java.io.*;

public class BufferedReaderClass 
{
	public static void main(String[] args)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("BufferedText.txt"));)
		{
			do
			{
				String line = br.readLine();
				if (line == null) break;
				System.out.println(line);
			}
			while(true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
