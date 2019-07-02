package KlausurSS14;

public class Player 
{
	String name;
	int numGoals = 0;
	
	public Player(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	public int getGoals() 
	{
		return numGoals;
	}
	
	public void score() 
	{
		numGoals++;
	}
	
	public String toString() 
	{
		return "Der Spieler " + this.name + " hat "+ this.numGoals + " Tore geschossen.";
	}
	

}
