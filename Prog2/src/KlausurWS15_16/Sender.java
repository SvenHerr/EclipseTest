package KlausurWS15_16;

public class Sender 
{
	
	private int kanalNr;
	private String name;
	
	public Sender(int kanalNr,String name) 
	{
		this.kanalNr = kanalNr;
		this.name = name;
	}
	
	public String toString() 
	{
		return "Kanal Nr: "+kanalNr + " Name: " +name;
	}

	public int getKanalNr() 
	{
		
		return this.kanalNr;
	}
	
	public String getSenderName() 
	{
		return this.name;
	}
}
