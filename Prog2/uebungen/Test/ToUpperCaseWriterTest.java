package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.*;

import org.junit.Test;

import uebungsblatt16.ToUpperCaseWriter;

public class ToUpperCaseWriterTest 
{

	@Test
	public void writeCharTest() 
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(baos);
		ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
		try 
		{
			writer.write('a');
			writer.flush();
			String uppercase = baos.toString();
			assertEquals(uppercase, "A");
			writer.close();
		} 
		catch (IOException e) 
		{
			fail("IOException" + e.getMessage());
		}
	}
	@Test
	public void writeCharTest1() 
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(baos);
		ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
		try 
		{
			writer.write('1');
			writer.flush();
			String uppercase = baos.toString();
			assertEquals(uppercase, "1");
			writer.close();
		} 
		catch (IOException e) 
		{
			fail("IOException" + e.getMessage());
		}
	}
}
