package KlausurSS15;

import java.util.Comparator;

public class VergleichePersonalNummer implements Comparator<Mitarbeiter>
{
	@Override
	public int compare(Mitarbeiter o1, Mitarbeiter o2) 
	{
		if(o1.getNummer() < o2.getNummer()) 
		{
			return -1;
		}
		else if(o1.getNummer() == o2.getNummer()) 
		{
			return 0;
		}
		else 
		{
			return 1;
		}
	}
}
