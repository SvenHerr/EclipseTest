package KlausurWS12_13;

public class Bruch implements Comparable<Bruch>
{
	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler, int nenner) 
	{	
		this.zaehler = zaehler;
		this.nenner = nenner;
		
		if(nenner == 0) 
		{
			throw new ArithmeticException();
		}
	}
	
	public Bruch (int wert) 
	{
		this(wert, 1);
	}
	
	public Bruch() 
	{
		this(0);
	}
	
	public String toString() 
	{
		return ""+ this.zaehler /(double)this.nenner;
	}

	@Override
	public int compareTo(Bruch o) 
	{
		double erg1 = this.zaehler /(double)this.nenner;
		double erg2 = o.zaehler /(double)o.nenner;
		
		if(erg1 < erg2) 
		{
			return -1;
		}
		if (erg1 > erg2)
		{
			return 1;
		}
		
		return 0;
	}
}
