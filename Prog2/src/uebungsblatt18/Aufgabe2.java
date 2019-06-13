package uebungsblatt18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aufgabe2
{
	static Set<Karte1> HandSpieler1 = new HashSet<>();
	static Set<Karte1> HandSpieler2 = new HashSet<>();
	
	static List<Karte1> alleKarten = new ArrayList<Karte1>();
	
	public static void main(String[]args) 
	{
		createKards();
		int anzahlKartenDieAufDerHandSeinSollen = 5;
		
		for(int i = 0; i<anzahlKartenDieAufDerHandSeinSollen; i++ ) 
		{
			Karte1 k1 = getRandomKarte1();
			Karte1 k2 = getRandomKarte1();
			
			HandSpieler1.add(k1);
			HandSpieler2.add(k2);	
		}
		
		System.out.println("Hand Spieler1: ");
		for(Karte1 b : HandSpieler1) 
		{
			System.out.println(b.toString());
		}
		System.out.println();
		
		System.out.println("Hand Spieler2: ");
		for(Karte1 b : HandSpieler2) 
		{
			System.out.println(b.toString());
		}
		System.out.println();
		System.out.println("Anzahl Karten auf Stapel: " + alleKarten.size());
	}
	
	public static Karte1 getRandomKarte1() 
	{
		int randomNumber = (int)(Math.random()*alleKarten.size());
		
		Karte1 randomKarte= alleKarten.get(randomNumber);
		alleKarten.remove(randomKarte);  // Löschen der Karten deshalb, weil z.B. ein weitere Spieler in seine Hand bzw. HashMap die gleiche Karte ziehen könnte wie schon der andere Spieler hat.
			
		return randomKarte;
	}
	
	public static void createKards() 
	{
		Karte1 KreuzAss = new Karte1("Kreuz", "Ass",1); Karte1 PikAss = new Karte1("Pik", "Ass",2);
		Karte1 HerzAss = new Karte1("Herz", "Ass",3); Karte1 KaroAss = new Karte1("Karo", "Ass",4);
		
		Karte1 KreuzZehn = new Karte1("Kreuz", "Zehn",5); Karte1 PikZehn = new Karte1("Pik", "Zehn",6);
		Karte1 HerzZehn = new Karte1("Herz", "Zehn",7); Karte1 KaroZehn = new Karte1("Karo", "Zehn",8);
		
		Karte1 KreuzKönig = new Karte1("Kreuz", "König",9); Karte1 PikKönig = new Karte1("Pik", "König",10);
		Karte1 HerzKönig = new Karte1("Herz", "König",11); Karte1 KaroKönig = new Karte1("Karo", "König",12);
		
		Karte1 KreuzDame = new Karte1("Kreuz", "Dame",13); Karte1 PikDame = new Karte1("Pik", "Dame",14);
		Karte1 HerzDame = new Karte1("Herz", "Dame",15); Karte1 KaroDame = new Karte1("Karo", "Dame",16);
		
		Karte1 KreuzBube = new Karte1("Kreuz", "Bube",17); Karte1 PikBube = new Karte1("Pik", "Bube",18);
		Karte1 HerzBube = new Karte1("Herz", "Bube",19); Karte1 KaroBube = new Karte1("Karo", "Bube",20);
		
		Karte1 KreuzNeun = new Karte1("Kreuz", "Neun",21); Karte1 PikNeun = new Karte1("Pik", "Neun",22);
		Karte1 HerzNeun = new Karte1("Herz", "Neun",23); Karte1 KaroNeun = new Karte1("Karo", "Neun",24);
		
		Karte1 KreuzAcht = new Karte1("Kreuz", "Acht",25); Karte1 PikAcht = new Karte1("Pik", "Acht",26);
		Karte1 HerzAcht = new Karte1("Herz", "Acht",27); Karte1 KaroAcht = new Karte1("Karo", "Acht",28);
		
		Karte1 KreuzSieben = new Karte1("Kreuz", "Sieben",29); Karte1 PikSieben = new Karte1("Pik", "Sieben",30);
		Karte1 HerzSieben = new Karte1("Herz", "Sieben",31); Karte1 KaroSieben = new Karte1("Karo", "Sieben",32);
		
		alleKarten.add(KreuzAss); alleKarten.add(PikAss); alleKarten.add(HerzAss);
		alleKarten.add(KaroAss); alleKarten.add(KreuzZehn); alleKarten.add(PikZehn);
		alleKarten.add(HerzZehn); alleKarten.add(KaroZehn); alleKarten.add(KreuzKönig);
		alleKarten.add(PikKönig); alleKarten.add(HerzKönig); alleKarten.add(KaroKönig);
		alleKarten.add(KreuzDame); alleKarten.add(PikDame); alleKarten.add(HerzDame);
		alleKarten.add(KaroDame); alleKarten.add(KreuzBube); alleKarten.add(PikBube);
		alleKarten.add(HerzBube); alleKarten.add(KaroBube); alleKarten.add(KreuzNeun);
		alleKarten.add(PikNeun); alleKarten.add(HerzNeun); alleKarten.add(KaroNeun);
		alleKarten.add(KreuzAcht); alleKarten.add(PikAcht); alleKarten.add(HerzAcht);
	    alleKarten.add(KaroAcht); alleKarten.add(KreuzSieben); alleKarten.add(PikSieben);
		alleKarten.add(HerzSieben); alleKarten.add(KaroSieben);
	}
}