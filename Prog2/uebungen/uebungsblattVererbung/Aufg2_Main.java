package uebungsblattVererbung;

public class Aufg2_Main 
{
	public static void main(String[] args) 
	{
		String multiAntworten[] = {"4", "2", "1", "0"};
		String multiAntworten1[] = {"2", "4", "0", "1"};
		String multiAntworten2[] = {"Test", "1", "2", "4"};
		
		
		Aufg2_Quizbogen[] a = new Aufg2_Quizbogen[6];
		a[0] = new Aufg2_Textfragen("Was ist die Hauptstadt von Deutschland?");
		a[1] = new Aufg2_MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?",  multiAntworten);
		
		a[2] = new Aufg2_Textfragen("Was ist die Hauptstadt von Holland?");
		a[3] = new Aufg2_MultipleChoice("Welche ist die größte Zahl",  multiAntworten1);
		
		a[4] = new Aufg2_Textfragen("Was ist die Hauptstadt von Italien?");
		a[5] = new Aufg2_MultipleChoice("Was ist die Summe aus 2+2 ?",  multiAntworten2);
		
		
		
		a[0].getFrage();
		a[0].getAntwort();
		
		System.out.println("");
		
		a[1].getFrage();
		a[1].getAntwort();
		System.out.println("");
		
		
		a[2].getFrage();
		a[2].getAntwort();
		
		System.out.println("");
		
		a[3].getFrage();
		a[3].getAntwort();
		
		System.out.println("");
		
		a[4].getFrage();
		a[4].getAntwort();
		
		System.out.println("");
		
		a[5].getFrage();
		a[5].getAntwort();		
	}
}
