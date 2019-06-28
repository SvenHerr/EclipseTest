package KlausurWS14_15;

import java.util.Comparator;

public class Aktie implements Comparable<Aktie>, Comparator<Aktie>
{
	private String name;
	private double kurs;
	private int anzahl;
	
	public Aktie() 
	{
		this("Telekom AG", 14.50, 1000);
	}
	
	public Aktie(String name, double kurs, int anzahl) 
	{
		this.name = name;
		this.kurs = kurs;
		this.anzahl = anzahl;
	}

	public String getName() 
	{
		return this.name;
	}
	public double getKurs() 
	{
		return this.kurs;
	}
	public int getAnzahl() 
	{
		return this.anzahl;
	}
	
	public String toString() 
	{
		return "Name: " + name +"\n"+ "Kurs: "+ kurs+ "\n" + "Anzahl: " + anzahl +"\n";
	}
	
	public double wert() 
	{
		return (anzahl * kurs);
	}
	
	@Override
	public int compareTo(Aktie o) 
	{
		if(this.getName().compareTo(o.getName()) < 0) 
		{
			System.out.println(this.getName()+ " zu "+o.getName()+"  -1 " +this.getName().compareTo(o.getName()));
			return -1;
		}
		else if(this.getName().compareTo(o.getName()) == 0) 
		{
			System.out.println(this.getName()+ " zu "+o.getName()+" - 0 " +this.getName().compareTo(o.getName()));
			
			return 0;
			
		}else 
		{
			System.out.println(this.getName()+ " zu "+o.getName()+" + 1 " +this.getName().compareTo(o.getName()));
			
			return 1;
		}
	}

	@Override
	public int compare(Aktie o1, Aktie o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
