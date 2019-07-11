package uebungsblatt16;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.junit.Before;
import org.junit.Test;


public class ToUpperCaseWriterTest
{
	// a)
	 /*@Test
	public void writeCharTestWit_Try_With_resources()
	{
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(baos);
				ToUpperCaseWriter writer =new ToUpperCaseWriter(osw);)
		{
			writer.write('a');
			writer.flush();
			String uppercase = baos.toString();
			assertEquals(uppercase, "A");
			//writer.close();
		}
		catch (IOException e)
		{
			fail("IOException"+ e.getMessage());
		}
	}// a) ende */
	 
	
	 // b) und c)
	ToUpperCaseWriter writer;
	ByteArrayOutputStream baos;
	
	@Before
	public void prepareTest()
	{
		baos = new ByteArrayOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(baos);
		writer= new ToUpperCaseWriter(osw);
	}
	
	@Test
	public void writeCharTest()
	{
		try
		{
			writer.write('a');
			writer.flush();
			String uppercase = baos.toString();
			assertEquals(uppercase, "A");
		}
		catch (IOException e)
		{
			fail("IOException"+ e.getMessage());
		}
	}
	
	@Test
	public void writeCharTestWithNonChar()
	{
		try
		{
			writer.write('1');
			writer.flush();
			String uppercase = baos.toString();
			assertEquals(uppercase, "1");
		}
		catch (IOException e)
		{
			fail("IOException" + e.getMessage());
		}
	}
	
	/*@Test
	public void helper()
	{
		char a = 'a';
		char ziel1 = 'a';
		String ziel = null;
		
		for(char i = 'a'; i <= 'z'; i++) 
		{
			a = i;
			ziel1 = (char) (a-32);
			
			
			ziel = String.valueOf(ziel1);
			
			
			writeCharTest128_ASCI_Zeiche(a, ziel);
		}
		
	}*/
	
	
	public void writeCharTest128_ASCI_Zeiche(char a, String ziel)
	{
		try
		{
			System.out.println("write: " + a);
			
			writer.write(a);
			writer.flush();
			String uppercase = baos.toString();
			System.out.println("uppercase: " + ziel);
			System.out.println("ziel: " + ziel);
			assertEquals(uppercase, ziel );
		}
		catch (IOException e)
		{
			fail("IOException" + e.getMessage());
		}
	}
	
	/*
	public void cleanUp()
	{
		try
		{
			writer.close();
		}
		catch (IOException e)
		{
			fail("IOException"+ e.getMessage());
		}
	}*/
}
