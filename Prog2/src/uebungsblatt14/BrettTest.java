package uebungsblatt14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BrettTest 
{
	@Test
	public void checkXkoordsFromTurm()
	{
		Aufg1_TurmImpl t = new Aufg1_TurmImpl(1,1); 
		Aufg1_Brett brett = t.gibErlaubteFelder();
	    
		for(int i = 0; i < 8; i++)  // schau ob die Felder vom Turm vorhanden sind
	    {
	    	assertTrue(brett.brett[i][0] == true ); // x
	    }
	}
	@Test
	public void checkYkoordsFromTurm()
	{
		Aufg1_TurmImpl t = new Aufg1_TurmImpl(1,1); 
		Aufg1_Brett brett = t.gibErlaubteFelder();
	    
		for(int i = 0; i < 8; i++)  // schau ob die Felder vom Turm vorhanden sind
	    {
	    	assertTrue(brett.brett[0][i] == true ); // y
	    }
	}
	
	@Test
	public void checkKombiniere() 
	{
		Aufg1_TurmImpl t = new Aufg1_TurmImpl(1,1); 
	    Aufg1_Brett brett = t.gibErlaubteFelder();
	    
	    Aufg1_Brett brett1 = new Aufg1_Brett();
		brett1.brett[2][2] = true;
		brett1.brett[3][3] = true;
		
		Aufg1_Brett c = brett.kombiniere(brett1);
		
		assertTrue(c.brett[2][2] == true && c.brett[2][2] == true ); 
		assertTrue(c.brett[3][3] == true && c.brett[3][3]  == true); 
	    
	    
		for(int i = 0; i < 8; i++)  
	    {
	    	assertTrue(brett.brett[0][i] == true ); // y
	    }
		
		for(int i = 0; i < 8; i++)
	    {
	    	assertTrue(brett.brett[i][0] == true ); // x
	    }
	}
}
