package KlausurSS2017;

import java.util.Collection;
import java.util.List;

import KlausurSS2017.Warenkorb.Posten;


public class Main 
{
	public static void main(String[] args) 
	{
		aufgabe1();
		//aufgabe2();		
		
						//--------------------------//
					//									//
				//											//
			// Aufgabe 3 ist nicht richtig gelößt. Unbedingt überarbeiten //
				//											//
					//									//
						//	-----------------------//
		//aufgabe3();
	}

	public static void aufgabe1() 
	{
		String IBAN = "DE2130120400000BYI1522";
		System.out.println(Aufgabe1.ibanCheck(IBAN));

		Aufgabe1.ibanAusDateiLesen("Files/IBAN_Datei.txt");
		
		String[] fileNames = { "Files/IBAN_Datei.txt", "Files/IBAN_Datei1.txt", "Files/IBAN_Datei2.txt", "Files/IBAN_Datei3.txt" };
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
	
	public static void aufgabe3() 
	{
		//Kunde k = new Kunde("Horst");
				
					//--------------------------//
				//									//
			//											//
		// Aufgabe 3 ist nicht richtig gelößt. Unbedingt überarbeiten //
			//
				//										//
					//	-----------------------//
						
		Warenkorb warenkorb = new Warenkorb();
		warenkorb.addPosten("Posten1");
		warenkorb.addPosten("Posten2");
		
		
		List<Posten> postenList = warenkorb.getAllPosten();
		for(Posten p : postenList) 
		{
			System.out.println(p.getName());
		}
		
		// Tutorium
		//Warenkorb wk = new WarenkorbBuilder(Kunde k).addPosten("1-1-1", "...").build(); 	
	}
}
