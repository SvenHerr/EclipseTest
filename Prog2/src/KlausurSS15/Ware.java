package KlausurSS15;

public class Ware implements IVerrechenbar 
{
	private String bestellnr;
	private double stuckzahl;
	private double stueckpreis;

	
	public Ware(String bestellnr, double stuckzahl, double stueckpreis) 
	{
		this.bestellnr = bestellnr;
		this.stuckzahl = stuckzahl;
		this.stueckpreis = stueckpreis;
	}
	
	@Override
	public double schreibeRechnung() 
	{
		double ges_Betrag = this.stuckzahl * this.stueckpreis;

		System.out.println("Best-Nr.: " + this.bestellnr + "\n" 
				+ "Stk.Anzahl: " + this.stuckzahl + "\n"
				+ "Stk.Preis: " + this.stueckpreis + "\n" 
				+ "Gesamtbetrag: " + ges_Betrag +"\n");
		return ges_Betrag;
	}

}
