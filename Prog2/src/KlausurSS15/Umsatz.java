package KlausurSS15;

public class Umsatz 
{
	
	double kumulierterUmsatz ;
	
	public void erhoeheUmsatz(Ware o) 
	{
		this.kumulierterUmsatz += o.schreibeRechnung();
	}
	
	public void erhoeheUmsatz(Dienstleistungen o) 
	{
		this.kumulierterUmsatz += o.schreibeRechnung();
	}
	

}
