package uebungsblatt14;

public class Aufg4_Roboter implements Aufg4_Autofahrer
{
	
	
	public Aufg4_Entscheidungen entscheide(Aufg4_Gefahren gefahr) 
	{
		if(Aufg4_Gefahren.GEFAHR_LINKS == gefahr) 
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
