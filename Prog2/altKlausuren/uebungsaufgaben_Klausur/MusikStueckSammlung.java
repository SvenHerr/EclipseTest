package uebungsaufgaben_Klausur;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MusikStueckSammlung 
{
	Map<String,MusikStueck> map = null;
	
	public MusikStueckSammlung() 
	{
		map = new HashMap<>();		
	}
	
	void musikStueckEinfügen(MusikStueck neu) throws IllegalArgumentException
	{
		if(map.containsValue(neu)) 
		{
			throw new IllegalArgumentException("Musikstück bereits vorhanden");
		}
		map.put(neu.titel, neu);
	}
	
	public MusikStueck[ ] getAlleMusikStueckeNachTitel() 
	{
		MusikStueck[] musicArray = new MusikStueck[map.size()];
		int i = 0;
		for(String s : map.keySet()) 
		{
			musicArray[i]= map.get(s);
			i++;
		}
		
		
		Arrays.sort( musicArray, new VergleicheMusikStueckTitel() );
		
	
		return musicArray;
	}
}
