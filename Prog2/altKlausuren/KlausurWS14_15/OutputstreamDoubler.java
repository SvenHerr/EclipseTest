package KlausurWS14_15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputstreamDoubler extends OutputStream
{
	OutputStream o1 = null;
	OutputStream o2 = null;
	
	public OutputstreamDoubler(OutputStream o1, OutputStream o2)  
	{
		this.o1 = o1;
		this.o2 = o2;
	}
	

	public void close() throws IOException
	{
		this.o1.close();
		this.o2.close();	
	}
	
	
	public void write(int b) throws IOException 
	{
		IOException ioe = null;
		
		try 
		{
			o1.write(b);
		}catch(IOException ioe1 ) 
		{
			ioe = ioe1;
		}
		catch(Exception e) 
		{
			
		}
		
		try 
		{
			o2.write(b);
		}catch(IOException ioe1 ) 
		{
			ioe = ioe1;
		}
		catch(Exception e) 
		{
			
		}
		
		if(ioe != null) 
		{
			throw ioe;
		}
		
	}
	
	public static void main(String[]args) 
	{
		try(FileOutputStream fos1 = new FileOutputStream("file1.txt");
				FileOutputStream fos2 = new FileOutputStream("file2.txt");
				OutputstreamDoubler doppler = new OutputstreamDoubler(fos1, fos2);
				OutputStreamWriter osw = new OutputStreamWriter(doppler))
		{
			osw.write("Hello World");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}	
	}
}
