package uebungsblatt19;

public class Aufgabe1_Nährstoffangaben 
{
	private double portionsgroesse; // Pflicht
	private double anzahlPortionen; // Pflicht
	
	private double eiweiß;			// Optional
	private double fett;			// Optional
	private double kohlenhydrate;	// Optional
	private double natrium;			// Optional

	
	private Aufgabe1_Nährstoffangaben(double portionsgroesse, double anzahlPortionen) 
	{
		this.portionsgroesse = portionsgroesse;
		this.anzahlPortionen = anzahlPortionen;
	}
	
	private Aufgabe1_Nährstoffangaben(double portionsgroesse, double anzahlPortionen, double eiweiß, double fett, double kohlenhydrate, double natrium) 
	{
		this.portionsgroesse = portionsgroesse;
		this.anzahlPortionen = anzahlPortionen;
		
		this.eiweiß = eiweiß;
		this.fett = fett;
		this.kohlenhydrate = kohlenhydrate;
		this.natrium = natrium;
	}
	
	public double getPortionsgroesse() 
	{
		return this.portionsgroesse;
	}
	public double getAnzahlPortionen() 
	{
		return this.anzahlPortionen;
	}
	
	public double getEiweiß() 
	{
		return this.eiweiß;
	}
	public double getFett() 
	{
		return this.fett;
	}
	public double getKohlenhydrate() 
	{
		return this.kohlenhydrate;
	}
	public double getNatrium() 
	{
		return this.natrium;
	}
	
	@Override
	public String toString() 
	{
		return "Portionsgröße = "+ this.portionsgroesse +"\n" +
					"Anzahl an Portionen = "+this.anzahlPortionen +"\n"+ 
					"Eiweiß = "+this.eiweiß+"\n" + "Fett = " + this.fett +"\n" + 
					"Kohlenhydrate = "+ this.kohlenhydrate +"\n" + 
					"Natrium = " +this.natrium;
	}
	
	public static class Aufgabe1_NährstoffangabenBuilder
	{
		private double portionsgroesse;
		private double anzahlPortionen;
		
		private double eiweiß;
		private double fett;
		private double kohlenhydrate;
		private double natrium;
		
		public Aufgabe1_NährstoffangabenBuilder(double portionsgroesse, double anzahlPortionen) 
		{
			this.portionsgroesse = portionsgroesse;
			this.anzahlPortionen = anzahlPortionen;
		}
		
		public Aufgabe1_NährstoffangabenBuilder withEiweiß(double eiweiß)
		{
			this.eiweiß = eiweiß;
			return this;
		}
		
		public Aufgabe1_NährstoffangabenBuilder withFett(double fett)
		{
			this.fett = fett;
			return this;
		}
		
		public Aufgabe1_NährstoffangabenBuilder withKohlenhydrate(double kohlenhydrate)
		{
			this.kohlenhydrate = kohlenhydrate;
			return this;
		}
		
		public Aufgabe1_NährstoffangabenBuilder withNatrium(double natrium)
		{
			this.natrium = natrium;
			return this;
		}
		
		public Aufgabe1_Nährstoffangaben build() 
		{
			return new Aufgabe1_Nährstoffangaben(portionsgroesse, anzahlPortionen, eiweiß, fett, kohlenhydrate, natrium);
		}	
	}
}
