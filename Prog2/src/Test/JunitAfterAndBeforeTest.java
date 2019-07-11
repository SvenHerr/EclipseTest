package Test;

import java.io.*;

import org.junit.Test;
import uebungsblatt16.ToUpperCaseWriter;
import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class JunitAfterAndBeforeTest 
{
	ToUpperCaseWriter writer;
	ByteArrayOutputStream baos;

	@BeforeEach
	public void prepareTest() 
	{
		baos = new ByteArrayOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(baos);
		writer = new ToUpperCaseWriter(osw);
	}
	

	@Test
	public void writeCharTest() 
	{
		try {
			writer.write('a');
			writer.flush();
			String uppercase = baos.toString();
			assertEquals(uppercase, "A");
			writer.close();
		} catch (IOException e) 
		{
			fail("IOException" + e.getMessage());
		}
	}
/*
	@Test
	public void writeCharTestWithNonChar() 
	{
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
/*
	@AfterEach
	public void cleanUp() 
	{
		try 
		{
			writer.close();
		} catch (IOException e) 
		{
			fail("IOException" + e.getMessage());
		}
	}*/
}
