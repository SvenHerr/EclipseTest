package Klausuren;

import java.util.Collection;

public class Main 
{
	public static void main(String[] args) 
	{
		//aufgabe1();
		aufgabe2();
	}

	public static void aufgabe1() 
	{
		String IBAN = "DE2130120400000BYI1522";
		System.out.println(Aufgabe1.ibanCheck(IBAN));

		Aufgabe1.ibanAusDateiLesen("IBAN_Datei.txt");
		
		String[] fileNames = { "IBAN_Datei.txt", "IBAN_Datei1.txt", "IBAN_Datei2.txt", "IBAN_Datei3.txt" };
		Aufgabe1.dateienTest(fileNames);
	}

	public static void aufgabe2() 
	{
		Wort und = new Wort ( " und " );
		WortVorkommen woerter = new WortVorkommen ();
		
		woerter.einfuegen( und , new Position (1 , 3));
		woerter.einfuegen( und , new Position (3 , 7));
		woerter.einfuegen( und , new Position (0 , 7));
		
		Position letztePosition = woerter.holeLetztePosition ( und );
		Collection < Position > allePositionen = woerter.holeAlle ( und );
		int anzahlVorkommen = woerter.anzahlVorkommen ( und );
		
		// Ausgabe
		System.out.println("letzte Zeilennummer "+letztePosition.zeilennummer  + " letzte Spaltennummer " + letztePosition.spaltennummer);
		System.out.println("AnzahlVorkommen " + anzahlVorkommen+ "\n");
		
		for(Position p : allePositionen) 
		{
			System.out.println("Alle Positionen von: "+ und.wort);
			System.out.println("Zeilennummer "+p.zeilennummer + " Spaltennummer " + p.spaltennummer);
		}	
	}
}
