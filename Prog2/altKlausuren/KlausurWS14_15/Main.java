package KlausurWS14_15;

import java.util.*;

public class Main 
{
	public static void main(String[]args) 
	{
		Aktie a = new Aktie("Apple", 9, 5);
		System.out.println(a.toString());
		Aktie b = new Aktie("Dell", 10, 6);
		Aktie c = new Aktie("Elektro", 11, 7);
		Aktie d = new Aktie("Fluffl", 12, 8);
		
		Map<String, Aktie> map = new HashMap<String, Aktie>();
		map.put("Fluffl", d);
		map.put("Apple", a);
		map.put("Elektro", c);
		map.put("Dell", b);
		
		
		System.out.println("Ergebnis von Methode (wert) = " + a.wert());
		
		String eins = "b";
		String zwei = "cb";
		System.out.println(eins.compareTo(zwei));
		
		Aktiendepot ad = new Aktiendepot(map);
		/*
		Aktie[] aktie = ad.alleaktienNachNamen();
		for(Aktie akt : aktie) 
		{
			System.out.println(akt.getName());
		}*/
		
		// f 
		Aktie[] aktie1 = ad.alleaktienNachWert();
		for(Aktie akt : aktie1) 
		{
			System.out.println(akt.getName()+ " " + akt.wert());
		}	
	}
}
