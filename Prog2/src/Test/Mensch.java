package Test;

public class Mensch 
{
	
	private String vorname;
	private String nachname;
	private int alter;
	
	public Mensch(String vorname, String nachname, int alter) 
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}
	
	public String getVorname() 
	{
		return this.vorname;
	}
	
	public String getNachname() 
	{
		return this.nachname;
	}
	
	public int getAlter() 
	{
		return this.alter;
	}
	
	public void setVorname(String vorname) 
	{
		this.vorname = vorname;
	}
	
	public void setNachname(String nachname) 
	{
		this.nachname = nachname;
	}
	
	public void setAlter(int alter) 
	{
		this.alter = alter;
	}	
}
