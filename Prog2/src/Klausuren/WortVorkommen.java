package Klausuren;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class WortVorkommen 
{
	Map<Wort, Position> positionList = new HashMap<Wort, Position>();
	
	
	public WortVorkommen() 
	{
		
	}

	public void einfuegen(Wort wort, Position position) 
	{
		positionList.put(wort, position);
		
	}

	public Position holeLetztePosition(Wort wort) 
	{
		positionList.get(wort);
		return null;
	}

	public Collection<Position> holeAlle(Wort wort) 
	{
		
		return null;
	}

	public int anzahlVorkommen(Wort wort) 
	{
		 
		
			
		
		return 0;
	}
}
