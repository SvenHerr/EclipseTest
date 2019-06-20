package Klausuren;

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnit_Test 
{
	@Test
	public void ibanCheck_IBANRichtig()
	{
		assertTrue( true == Aufgabe1.ibanCheck("DE2130120400000BYI1522"));
	}
	
	@Test
	public void ibanCheck_IBAN_zuKurz()
	{
		String IBAN = "DE2130120400000BYI152";
		
		try
		{
			assertTrue( false == Aufgabe1.ibanCheck(IBAN));
		}
		catch(Aufg1_FalscheIBANException e)
		{
			
		if (!e.getMessage().equals("IBAN ist ungültig da weniger als 22 Zeichen.\n Ihre eingegebene IBAN war: "+ IBAN+ " und hat "+ IBAN.length()+ " Zeichen")) fail("Test fehlgeschlagen");
		}
	}
	
	@Test
	public void ibanCheck_IBAN_LaenderkennungFalsch()
	{
		String IBAN = "De2130120400000BYI1522";
		
		try
		{
			assertTrue( false == Aufgabe1.ibanCheck(IBAN));
		}
		catch(Aufg1_FalscheIBANException e)
		{
			
		if (!e.getMessage().equals("Im Ländercode der IBAN ist ein fehler. \n Ihre eingabe war: " + IBAN)) fail("Test fehlgeschlagen");
		}
	}
}
