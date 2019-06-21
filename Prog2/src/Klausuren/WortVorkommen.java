package Klausuren;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class WortVorkommen 
{
	Map<Wort, ArrayList<Position>> positionList = new HashMap<Wort, ArrayList<Position>>();
	ArrayList<Position> positionenVonWort = new ArrayList<Position>();
	
	
	public void einfuegen(Wort wort, Position position) 
	{		
		if(positionList.containsKey(wort)) 
		{	
			positionenVonWort = positionList.get(wort);
			positionenVonWort.add(position);
			positionList.put(wort, positionenVonWort);
		}
		else 
		{
			positionenVonWort.add(position);
			positionList.put(wort, positionenVonWort);
		}	
	}

	public Position holeLetztePosition(Wort wort) 
	{
		positionenVonWort = new ArrayList<Position>();
		positionenVonWort = positionList.get(wort);
		positionenVonWort.get(positionenVonWort.size()-1);
		
		return positionenVonWort.get(positionenVonWort.size()-1);
	}

	public Collection<Position> holeAlle(Wort wort) 
	{
		Collection<Position> pos = new ArrayList<Position>();
		positionenVonWort = positionList.get(wort);
		
		for(Position p : positionenVonWort) 
		{
			pos.add(p);
		}
		return pos;
	}

	public int anzahlVorkommen(Wort wort) 
	{
		positionenVonWort = new ArrayList<Position>();
		positionenVonWort = positionList.get(wort);
		
		return positionenVonWort.size();
	}
}
