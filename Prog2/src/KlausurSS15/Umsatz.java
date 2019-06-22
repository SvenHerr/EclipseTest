package KlausurSS15;

public class Umsatz 
{
	// muss nicht mit vererbung gemacht werden
	double kumulierterUmsatz ;
	
	/*
	public void erhoeheUmsatz(Ware o) 
	{
		this.kumulierterUmsatz += o.schreibeRechnung();
	}
	
	public void erhoeheUmsatz(Dienstleistungen o) 
	{
		this.kumulierterUmsatz += o.schreibeRechnung();
	}*/
	
	
	//Mit vererbung
	
	public void erhoeheUmsatz(UmsatzHelper o) 
	{
		this.kumulierterUmsatz += o.schreibeRechnung();
	}

}
