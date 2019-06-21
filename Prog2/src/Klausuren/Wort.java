package Klausuren;

public class Wort implements Comparable < Wort > 
{
	String wort , wortTyp , sprache ;
	int laenge ;
	
	public Wort(String wort) 
	{
		this.wort = wort;
	}
	
	public void setWort(String w) 
	{
		this.wort = w;
	}
	
	public void setWortTyp(String wt) 
	{
		this.wortTyp = wt;
	}
	
	public void setSprache(String s) 
	{
		this.sprache = s;
	}
	
	public void setLaenge(int l) 
	{
		this.laenge = l;
	}
	
	public String getWort() 
	{
		return this.wort;
	}
	public String getWortTyp() 
	{
		return this.wortTyp;
	}
	public String getSprache() 
	{
		return this.sprache;
	}
	public int getLaenge() 
	{
		return this.laenge;
	}
	
	@Override
	public int compareTo(Wort o) 
	{
		//o.wort.compareTo(this.wort);
		
		return o.wort.compareTo(this.wort);
	}
}
