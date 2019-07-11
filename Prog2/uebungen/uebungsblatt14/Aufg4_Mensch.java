package uebungsblatt14;

import java.util.Random;

public class Aufg4_Mensch implements Aufg4_Autofahrer
{
	
	
	public Aufg4_Entscheidungen entscheide(Aufg4_Gefahren gefahr) 
	{
		Random r = new Random();
		int wahrscheinlichkeit = r.nextInt(100-1) + 1;
		
		if(wahrscheinlichkeit >= 0 && wahrscheinlichkeit <= 25) 
		{
			return Aufg4_Entscheidungen.UNENTSCHIEDEN;	
		}
		else if(Aufg4_Gefahren.GEFAHR_LINKS == gefahr) 
		{
			return Aufg4_Entscheidungen.RECHTS;
		}
		else if(Aufg4_Gefahren.GEFAHR_RECHTS == gefahr) 
		{
			return Aufg4_Entscheidungen.LINKS;
		}
		else if(Aufg4_Gefahren.GEFAHR_VORNE == gefahr) 
		{
			return Aufg4_Entscheidungen.BREMSEN;
		}
		
		return null;
	}
}
