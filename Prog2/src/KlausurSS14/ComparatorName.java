package KlausurSS14;

import java.util.Comparator;

public class ComparatorName implements Comparator<Player> 
{
	@Override
	public int compare(Player o1, Player o2) 
	{
		if(o1.getName().compareTo(o2.getName()) < 0)
		{
			return -1;
		}
		else if(o1.getName().compareTo(o2.getName()) > 0)
		{
			return 1;
		}
		
		return 0;
	}
}
