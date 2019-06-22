package KlausurSS15;

public class Main 
{
	public static void main(String[]args) 
	{
		Dienstleistungen d = new Dienstleistungen("Kunde1",5,10 );
		d.schreibeRechnung();
		
		Ware w = new Ware("beas123", 10, 12.50);
		w.schreibeRechnung();
		
		Umsatz u = new Umsatz();
		u.kumulierterUmsatz = 5;
		u.erhoeheUmsatz(w);
		System.out.println(u.kumulierterUmsatz);
		
		Umsatz u1 = new Umsatz();
		u1.kumulierterUmsatz = 7;
		u1.erhoeheUmsatz(d);
		System.out.println(u1.kumulierterUmsatz);
		
		
	}

}
