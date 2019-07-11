package uebungsblatt18;

public class Karte1 implements Comparable<Object>
{
	private String farbe;
	private String wert;
	private String ID;

	public Karte1() 
	{
		
	}
	public Karte1(String farbe, String wert, String ID) 
	{
		this.farbe = farbe;
		this.wert = wert;
	}
	
	public String getID() 
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
	public int compareTo(Object o) 
	{
		Karte1 other = (Karte1) o;
		return this.farbe.compareTo(other.farbe);
	}
}
