package uebungsaufgaben_Klausur;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer>  
{
	@Override
	public Iterator<Integer> iterator()  
	{
	    return new RouletteZahlenIterator();
	}
	

	public static void main(String[]args) 
	{
		RouletteZahlen rouletteZahlen = new RouletteZahlen();
		
		for(Integer nummer : rouletteZahlen) 
		{
			System.out.println(nummer);
		}
		
		Iterator<Integer> it =  rouletteZahlen.iterator();
		while(it.hasNext()) 
		{
			int nummer = it.next();
			System.out.println(nummer);
		}
	}
}
