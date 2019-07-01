package KlausurWS14_15;

import java.util.*;
import java.util.Comparator;

public class Aktiendepot
{
	Map<String,Aktie> aktien = new HashMap<String,Aktie>();
	Aktie[] result;
	Aktie[] result1;
	
	public Aktiendepot(Map<String, Aktie> aktien) 
	{
		this.aktien = aktien;
	}
	
	public void bucheAktieEin(Aktie a ) 
	{
		for(String s : aktien.keySet()) 
		{
			if(s.equals(a.getName())) 
			{
				return;
			}
		}
		aktien.put(a.getName(), a);
	}
	
	public Aktie leseAktieAus(String name) 
	{	
		return aktien.get(name);
	}
	
	public Aktie[] alleakien() 
	{
		result = new Aktie[aktien.size()];
		int i = 0;
		for(String s : aktien.keySet()) 
		{
			result[i] = aktien.get(s);
			i++;
		}
		return result;
	}
	
	public Aktie[] alleaktienNachNamen() 
	{
		result1 = alleakien();
		
		// !!! Arrays.asList(array)  merken !!!!
		Collections.sort(Arrays.asList(result1));
		
		return result1;
	}
	
	public Aktie[] alleaktienNachWert() 
	{
		result1 = alleakien();

		Collections.sort(Arrays.asList(result1), new NachWert());
		
		return result1;
	}
	
	public class NachWert implements Comparator<Aktie> 
	{
		public int compare(Aktie a, Aktie b) 
	    { 
			if(a.wert() > b.wert()) 
			{
				 return 1;
			}
			else if(a.wert() < b.wert()) 
			{
				return -1;
			}
			else 
			{
				return 0; 
			}
	    }
	}
}
