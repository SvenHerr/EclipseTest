package Streams;

import java.io.FileReader;

public class FileReaderExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Mit Array");
		mitArray();
		
	
		System.out.println("\n"+"Ab hier ist ohne Array");
		mitChar();
	}
	
	public static void mitArray() 
	{
		try (FileReader fr = new FileReader("hello.txt");) 
		{
			char[] data = new char[20];
			int n = -1;
			
			while (true) 
			{
				n = fr.read(data, 0, data.length);
				
				if (n == -1) 
					break;
				
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
	
	public static void mitChar() 
	{
		try (FileReader fr = new FileReader("hello.txt");) 
		{
			char n = (char)-1;
			
			while (true) 
			{
				n = (char)fr.read();
				
				if (n == (char)-1) 
					break;
				
				System.out.print(n);
			}
			fr.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
