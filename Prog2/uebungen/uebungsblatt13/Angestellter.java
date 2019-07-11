package uebungsblatt13;

public class Angestellter 
{
	
	private String nachnamen, vornamen, geburtsdatum;
	private int identifikation;
	private double grundgehalt;
	protected double gehaltsfaktor = 1;
	
	public Angestellter(String nn, String vn, String gebDat, int id, double gg)
	{
		this.nachnamen = nn;
		this.vornamen = vn;
		this.geburtsdatum = gebDat;
		this.identifikation = id;
		this.grundgehalt = gg;
		this.gehaltsfaktor = 1;
	}
	
	public int getIdentifikation() 
	{
		return identifikation;
	}

	public String getNachnamen() 
	{
		return nachnamen;
	}

	public String getVornamen() 
	{
		return vornamen;
	}

	public String getGeburtsdatum() 
	{
		return geburtsdatum;
	}

	public double getGrundgehalt() 
	{
		return grundgehalt;
	}

	public double getGehaltsfaktor() 
	{
		return gehaltsfaktor;
	}

	public void setNachnamen(String n) 
	{
		this.nachnamen = n;
	}
	public void setVornamen(String v) 
	{
		this.vornamen = v;
	}
	public void setGeburtsdatum(String g) 
	{
		this.geburtsdatum = g;
	}
	public void setID(int i) 
	{
		this.identifikation = i;
	}
	public void setGrundgehalt(double g) 
	{
		this.grundgehalt = g;
	}
	
	public void setGehaltsfaktor(double g) 
	{
		this.gehaltsfaktor = g;
	}
}
