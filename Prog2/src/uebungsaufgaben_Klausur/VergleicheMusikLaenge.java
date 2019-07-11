package uebungsaufgaben_Klausur;

import java.util.Comparator;

public class VergleicheMusikLaenge implements Comparator<MusikStueck> 
{
	@Override
	public int compare(MusikStueck o1, MusikStueck o2) 
	{
		if(o1.laenge < o1.laenge) 
		{
			return 1;
		}
		if(o1.laenge == o1.laenge) 
		{
			return 0;
		}
		
		return -1;
	}
}
