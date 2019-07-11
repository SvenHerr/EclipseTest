package uebungsblatt12_testPlusException;

import static org.junit.Assert.fail;

import org.junit.Test;


public class PunktTest 
{
	@Test
	public void verschiebePunktXNegativ() 
	{
		try
		{
			Punkt.verschiebePunkt(-1,1);
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("X is negativ")) fail("Test fehlgeschlagen");
		}
	}
	
	@Test
	public void verschiebePunktYNegativ() 
	{
		try
		{
			Punkt.verschiebePunkt(1,-1);
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("Y is negativ")) fail("Test fehlgeschlagen");
		}
	}
	
	@Test
	public void verschiebePunktXHigher1920() 
	{
		try
		{
			Punkt.verschiebePunkt(1921,1);
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("X higher 1920")) fail("Test fehlgeschlagen");
		}
	}
	
	@Test
	public void verschiebePunktYHigher1080() 
	{
		try
		{
			Punkt.verschiebePunkt(1,1081);
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("Y higher 1080")) fail("Test fehlgeschlagen");
		}
	}
}
