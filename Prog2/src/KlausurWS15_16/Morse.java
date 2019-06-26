package KlausurWS15_16;

import java.util.*;
import java.util.Map.Entry;

public class Morse 
{
	public static String[][] tabelle = {{"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}};
	public static HashMap<String, String> map;
	/*
	public static void main(String[]args) 
	{
		// Main Methode ist in Main Klasse
		
		
		/*
		HashMap<String, String> map = Morse.getMorseCodeMap(tabelle);
		/*Iterator<Entry<String, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()) 
		{
			HashMap.Entry<String, String> pair = it.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
		}*/
		
		/*
		System.out.println("Komplette Morse Liste:");
		for(Entry<String, String> pair : map.entrySet()) 
		{
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
		System.out.println();
		
		String buchstaben = "CAB";
		System.out.println("Folgende Buchstaben("+ buchstaben +") vom String in Morsezeichen umgewandelt");
		System.out.println(Morse.zeichenketteToMorse(buchstaben));
	}*/
	
	
	public static HashMap<String, String> getMorseCodeMap(String tabelle[][]) 
	{
		map = new HashMap<String, String>();
		
		for(String[] arr : tabelle) 
		{
			for(String arr2 : arr) 
			{
				//map.put(tabelle[arr.length][arr2.length()], tabelle[arr.length][arr2.length()]);
			}
		}
		
		for(int i = 0; i < tabelle.length; i++)
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
		char[] arr = s.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for(char z : arr) 
		{
			result.append(map.get(String.valueOf(z)));
			result.append("  ");
		}
		
		return result.toString();
	}
}
