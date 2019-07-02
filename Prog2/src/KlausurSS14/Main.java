package KlausurSS14;

import java.util.Arrays;

public class Main 
{
	public static void main(String[]args) 
	{
		Player[] players = new Player[] 
		{
				new Player("Podolski"),
				new Player("Lahm"),
				new Player("Mertesacker")
		};
		
		Arrays.sort(players, new ComparatorName());
		for(Player p : players) 
		{
			System.out.println(p.toString());
		}
		System.out.println("-----");
		
		
		Arrays.sort(players, new ComparatorGoal());
		
		for(Player p : players) 
		{
			System.out.println(p.toString());
		}	
	}
}
