package KlausurWS15_16;

import java.util.*;

public class Morse 
{
	
	public static String[][] tabelle = {{"A", ".-"}, {"B", "-..."}};
	
	public static void main(String[]args) 
	{
		HashMap<String, String> map = Morse.getMorseCodeMap(tabelle);
		Iterator i = map.
		for(String[][] s : map) 
		{
			map.get(key)
			System.out.println(map);
		}
		
	}
	
	
	public static HashMap getMorseCodeMap(String tabelle[][]) 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i < tabelle.length; i++)
		{
			for(int k = 0; k < tabelle.length; i++)
			{
				map.put(tabelle[i][k], tabelle[i][k]);
			}
		}
		return map;
	}
}
