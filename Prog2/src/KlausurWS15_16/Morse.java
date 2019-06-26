package KlausurWS15_16;

import java.util.*;
import java.util.Map.Entry;

public class Morse 
{
	public static String[][] tabelle = {{"A", ".-"}, {"B", "-..."}};
	
	public static void main(String[]args) 
	{
		HashMap<String, String> map = Morse.getMorseCodeMap(tabelle);
		/*Iterator<Entry<String, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()) 
		{
			HashMap.Entry<String, String> pair = it.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
		}*/
		
		for(Entry<String, String> pair : map.entrySet()) 
		{
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
	}
	
	
	public static HashMap<String, String> getMorseCodeMap(String tabelle[][]) 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(String[] arr : tabelle) 
		{
			for(String arr2 : arr) 
			{
				
			}
		}
		
		for(int i = 0; i < tabelle[0].length; i++)
		{
			for(int k = 0; k < tabelle[1].length-1; k++)
			{
				map.put(tabelle[i][k], tabelle[i][k+1]);
			}
		}
		return map;
	}
	
	public static String zeichenketteToMorse(String s)
	{
		
		
		return null;
	}
	
}
