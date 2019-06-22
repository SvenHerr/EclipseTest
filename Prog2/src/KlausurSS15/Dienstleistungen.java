package KlausurSS15;

public class Dienstleistungen implements IVerrechenbar
{
	
	private String kundenname;
	private double stundenanzahl;
	private double stundensatz;
	
	public Dienstleistungen(String kundenname, double stundenanzahl,double stundensatz) 
	{
		this.kundenname = kundenname;
		this.stundenanzahl = stundenanzahl;
		this.stundensatz = stundensatz;
	}
	
	@Override
	public double schreibeRechnung() 
	{
		double ges_Betrag = this.stundenanzahl * this.stundensatz;
		
		System.out.println("K-Name: "+this.kundenname +"\n"
				+"Std.Anzahl: "+ this.stundenanzahl+"\n"
				+"Std.Satz: "+ this.stundensatz+"\n"
				+"Gesamtbetrag: "+ ges_Betrag +"\n"	
	);
		return ges_Betrag;
	}
	
	
	

}
