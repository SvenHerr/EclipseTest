package uebungsblatt18;
import java.util.Set;
import java.util.HashSet;

public class Aufgabe1 
{
	public static void main(String[]args) 
	{
		int anzahlDerKartenDieAufDerHandSeinSollen = 10;
		int number = anzahlDerKartenDieAufDerHandSeinSollen;
		
		Set<KarteEnum> Hand = new HashSet<>();
		
		for(int i = 0; i < number; i++) 
		{
			KarteEnum temp = getRandomKarte();
			if(!Hand.contains(temp))
			{
				Hand.add(temp);		
			}else 
			{
				i--;
			}	
		}
		
		for(KarteEnum a : Hand) 
		{
			System.out.println(a.toString());
		}
	}
	
	public static KarteEnum getRandomKarte() 
	{
		KarteEnum[] randomKarten = KarteEnum.values();
		int randomNumber = (int)(Math.random()*randomKarten.length);
		KarteEnum randomKarte = randomKarten[randomNumber];
		return randomKarte;
	}
	/*
	public static Karte getRandomKarte1() 
	{
		Karte KreuzAss = new Karte("Kreuz", "Ass",1); Karte PikAss = new Karte("Pik", "Ass",2);
		Karte HerzAss = new Karte("Herz", "Ass",3); Karte KaroAss = new Karte("Karo", "Ass",4);
		
		Karte KreuzZehn = new Karte("Kreuz", "Zehn",5); Karte PikZehn = new Karte("Pik", "Zehn",6);
		Karte HerzZehn = new Karte("Herz", "Zehn",7); Karte KaroZehn = new Karte("Karo", "Zehn",8);
		
		Karte KreuzKönig = new Karte("Kreuz", "König",9); Karte PikKönig = new Karte("Pik", "König",10);
		Karte HerzKönig = new Karte("Herz", "König",11); Karte KaroKönig = new Karte("Karo", "König",12);
		
		Karte KreuzDame = new Karte("Kreuz", "Dame",13); Karte PikDame = new Karte("Pik", "Dame",14);
		Karte HerzDame = new Karte("Herz", "Dame",15); Karte KaroDame = new Karte("Karo", "Dame",16);
		
		Karte KreuzBube = new Karte("Kreuz", "Bube",17); Karte PikBube = new Karte("Pik", "Bube",18);
		Karte HerzBube = new Karte("Herz", "Bube",19); Karte KaroBube = new Karte("Karo", "Bube",20);
		
		Karte KreuzNeun = new Karte("Kreuz", "Neun",21); Karte PikNeun = new Karte("Pik", "Neun",22);
		Karte HerzNeun = new Karte("Herz", "Neun",23); Karte KaroNeun = new Karte("Karo", "Neun",24);
		
		Karte KreuzAcht = new Karte("Kreuz", "Acht",25); Karte PikAcht = new Karte("Pik", "Acht",26);
		Karte HerzAcht = new Karte("Herz", "Acht",27); Karte KaroAcht = new Karte("Karo", "Acht",28);
		
		Karte KreuzSieben = new Karte("Kreuz", "Sieben",29); Karte PikSieben = new Karte("Pik", "Sieben",30);
		Karte HerzSieben = new Karte("Herz", "Sieben",31); Karte KaroSieben = new Karte("Karo", "Sieben",32);
		
		ArrayList<Karte> alleKarten = new ArrayList<Karte>();
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
		
		int randomNumber = (int)(Math.random()*alleKarten.size());
		
		Karte randomKarte= alleKarten.get(randomNumber);
		
		return randomKarte;
	}*/
	
}