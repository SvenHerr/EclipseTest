package uebungsblatt18;

public class Karte1 implements Comparable<Karte1>
{
	private String farbe;
	private String wert;
	private int ID;

	public Karte1() 
	{
		
	}
	public Karte1(String farbe, String wert, int ID) 
	{
		this.farbe = farbe;
		this.wert = wert;
	}
	
	public int getID() 
	{
		return ID;
	}
	
	public String getFarbe() 
	{
		return farbe;
	}
	
	public String getWert() 
	{
		return wert;
	}
	
	@Override
	public String toString() 
	{
		return "Farbe: " +farbe+"  Wert: "+ wert;
	}
	
	@Override
	public int compareTo(Karte1 m)
	{
		return -1;
	}
}
