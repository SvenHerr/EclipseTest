package uebungsblatt12_testPlusException;
import static org.junit.Assert.*;
import org.junit.Test;

public class KugelvolumenTest 
{
	@Test
	public void berechneKugelvolumenVonZero() 
	{
		assertEquals(0,Kugelvolumen.berechneKugelvolumen(0),0.01);
	}
	
	@Test
	public void berechneKugelvolumenVonOne() 
	{
		assertEquals(4.189,Kugelvolumen.berechneKugelvolumen(1),0.01);
	}
	
	@Test
	public void berechneKugelvolumenFive() 
	{
		assertEquals(523.599,Kugelvolumen.berechneKugelvolumen(5),0.01);
	}
	
	@Test
	public void berechneKugelvolumenMinusOne() 
	{
		try
		{
			Kugelvolumen.berechneKugelvolumen(-1);
			fail(); 
		}
		catch(RuntimeException e)
		{
			if (!e.getMessage().equals("Ungültige Parameter")) fail("Test fehlgeschlagen");
		}
	}
}
