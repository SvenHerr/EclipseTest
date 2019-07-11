package testPlusException;

import static org.junit.Assert.fail;
import org.junit.Test;

public class PersonTest 
{
	@Test
	public void vornameTest() 
	{
		try
		{
			Person a = new Person("max", "Mueller", "Musterstraße", "11A", 9074, "Musterort");
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("Vorname ist ungültig")) fail("Test fehlgeschlagen");
		}	
	}
	@Test
	public void straßeTest() 
	{
		try
		{
			Person a = new Person("Max", "Mueller", "musterstraße", "11A", 9074, "Musterort");
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("Strasse ist ungültig")) fail("Test fehlgeschlagen");
		}	
	}
	@Test
	public void ortTest() 
	{
		try
		{
			Person a = new Person("Max", "Mueller", "Musterstraße", "11A", 9074, "musterort");
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("Ort ist ungültig")) fail("Test fehlgeschlagen");
		}
	}
	@Test
	public void hausnummerTest() 
	{
		try
		{
			Person a = new Person("Max", "Mueller", "Musterstraße", "A11", 9074, "Musterort");
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("Hausnummer ist ungültig")) fail("Test fehlgeschlagen");
		}
	}		
}
