package uebungsblatt15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamDoubler extends OutputStream
{
	OutputStream o1 = null;
    OutputStream o2 = null;
	
	public OutputStreamDoubler(OutputStream o1, OutputStream o2) 
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
		IOException exception = null; 
	
		try 
		{
            o1.write(b);
        } catch (IOException e) 
		{
            exception = e;
        }

        try 
        {
            o2.write(b);
        } catch (IOException e) 
        {
            exception = e;
        }

        if (exception != null) 
        {
            throw exception;
        }
	}
	
	public static void main(String[] args) 
	{
        try (FileOutputStream fos1 = new FileOutputStream("file1");
             FileOutputStream fos2 = new FileOutputStream("file2");
        		OutputStreamDoubler osd = new OutputStreamDoubler(fos1, fos2);
             OutputStreamWriter osw = new OutputStreamWriter(osd)) 
        {
            osw.write("Hello World");

        } catch (IOException ex) 
        {
            ex.printStackTrace();
        }
    }
}
