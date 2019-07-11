package uebungsaufgaben_Klausur;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> 
{
	@Override
	public int compare(MusikStueck o1, MusikStueck o2) 
	{
		if(o1.titel.compareTo(o2.titel) < 0)
		{
			return -1;
		}
		if(o1.titel.compareTo(o2.titel) == 0)
		{
			return 0;
		}
		
		return 1;
	}
}
