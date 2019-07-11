package KlausurSS15;

import java.util.Arrays;
import java.util.Collection;

public class Main {
	public static void main(String[] args) 
	{
		//aufgabe1();
		//aufgabe2();
		aufgabe5();
	}

	public static void aufgabe1() 
	{
		Dienstleistungen d = new Dienstleistungen("Kunde1", 5, 10);
		d.schreibeRechnung();

		Ware w = new Ware("beas123", 10, 12.50);
		w.schreibeRechnung();

		// Man kann es mit Vererbung lösen oder ohne
		Umsatz u = new Umsatz();
		u.kumulierterUmsatz = 5;
		u.erhoeheUmsatz(w);
		System.out.println(u.kumulierterUmsatz);

		Umsatz u1 = new Umsatz();
		u1.kumulierterUmsatz = 7;
		u1.erhoeheUmsatz(d);
		System.out.println(u1.kumulierterUmsatz);
	}
	
	public static void aufgabe2() 
	{
		Sparkonto k = new Sparkonto("Hans Müller", 1000, 10);
		System.out.println(k.getSaldo());
		System.out.println(k.getZinssatz());
		System.out.println(k.toString());
		
		System.out.println(k.istBuchungZulaessig(2000));
		System.out.println(k.istBuchungZulaessig(500));
		
		Hypothekenkonto h = new Hypothekenkonto("Peter Schneider", -3000, 5);
		System.out.println(h.getSaldo());
		System.out.println(h.getZinssatz());
		System.out.println(h.istBuchungZulaessig(50));
		h.sondertilgung(500);
		System.out.println(h.toString());
		
	}
	public static void aufgabe5() 
	{
		//Mitarbeiter.legDateiAn();
		//Mitarbeiter.gibCollectionAus(Mitarbeiter.leseDatei());
		
		// aufgabe f
		Mitarbeiter.legDateiAn();
		Collection<Mitarbeiter> collection = Mitarbeiter.leseDatei();
		Mitarbeiter[] array = Mitarbeiter.sortiere(collection);
		Mitarbeiter.gibCollectionAus(Arrays.asList(array));
	}
}
