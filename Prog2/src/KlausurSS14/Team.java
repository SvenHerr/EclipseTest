package KlausurSS14;

import java.util.*;

public class Team extends AbstractTeam
{
	List<Player> members;
	public Team() 
	{
		members = new ArrayList<Player>();	
	}
	
	@Override
	Player[] getPlayers() 
	{
		int i = 0;
		Player[] p = new Player[members.size()];
		for(Player pl : members) 
		{
			p[i] = pl;
			i++;
		}
		
		return p;
	}

	@Override
	Player playerByName(String name) 
	{
		for(Player p : members) 
		{
			if(p.name.equals(name)) 
			{
				return p;
			}
		}
		return null;
	}

	@Override
	boolean playerInTeam(String name) 
	{
		if(playerByName(name)!= null) 
		{
			return true;
		}
		
		return false;
	}

	@Override
	void addPlayerToTeam(String name) throws IllegalArgumentException 
	{
		if(playerInTeam(name)) 
		{
			throw new IllegalArgumentException("Spieler bereits vorhanden");
		}
		else 
		{
			Player p = new Player(name);
			members.add(p);
		}
	}

	@Override
	Player removePlayerFromTeam(String name) throws IllegalArgumentException 
	{
		if(playerInTeam(name)) 
		{
			//Option A start
			for(Player p : members) 
			{
				if(p.name.equals(name)) 
				{
					members.remove(p);
					return p;
				}
			}//Option A Ende
			
			//Option B Start
			//members.remove(playerByName(name));
			// Option B Ende
		}
		throw new IllegalArgumentException("Spieler nicht im Team") ;
	}
	

	@Override
	void substitutePlayer(String nameOfReplacedPlayer, String nameOfNewPlayer) throws IllegalArgumentException 
	{
		//throw new IllegalArgumentException("Einzuwechselnder Spieler bereits im Team"); 
		
		//throw new IllegalArgumentException("Auszuwechselnder Spieler nicht im Team"); 
		
	}
}
