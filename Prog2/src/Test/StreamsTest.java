package Test;

import java.io.*;



public class StreamsTest 
{
	
	public static void main(String[]args) 
	{
		InputStream fis = null;
		String source = "pic.jpg";
		
		try(InputStream fis1 = new FileInputStream(source)) 
		{
			//fis = new FileInputStream("pic.jpg");	
		}
		catch(FileNotFoundException e)
		{
			
		} 
		catch (IOException e1) 
		{
			
		}
		
		
		
		
		
	}

}
