package KlausurSS14;

import java.util.Comparator;


public class ComparatorGoal implements Comparator<Player> 
{
	@Override
	public int compare(Player o1, Player o2) 
	{
		if(o1.getGoals() > o2.getGoals())
		{
			return -1;
		}
		else if(o1.getGoals() < o2.getGoals())
		{
			return 1;
		}
		
		return 0;
	}
}
