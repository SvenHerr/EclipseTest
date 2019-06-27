package KlausurWS14_15;

import java.util.*;

public class Aktiendepot
{
	Map<String,Aktie> aktien = new HashMap<String,Aktie>();
	Aktie[] result;
	
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
		Aktie[] result1 = alleakien();
		List<Aktie> akt = new ArrayList<Aktie>();
		int i = 0;
		for(Aktie a : result) 
		{
			akt.add(result[i]);
			i++;
		}
		
		Collections.sort(akt);
		
		i = 0;
		
		for(Aktie a : akt) 
		{
			result1[i] = a;
			i++;
		}
		return result1;
	}
	
	public Aktie[] alleaktienNachWert() 
	{
		
	}
}
