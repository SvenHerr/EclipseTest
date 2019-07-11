package uebungsblatt12_testPlusException;

public class Person 
{
	 String vorname;
	 String nachname;
	 
	 String strasse;
	 String hausnummer;
	 int plz;
	 String ort;
	 
	 public Person(String vorname, String nachname, String strasse, String hausnummer, int plz, String ort) 
	 {
		if(!Character.isUpperCase(vorname.charAt(0)))
		{
			 throw new RuntimeException("Vorname ist ungültig");
		}
		if(!Character.isUpperCase(strasse.charAt(0)))
		{
			throw new RuntimeException("Strasse ist ungültig");
		}
		if(!Character.isUpperCase(ort.charAt(0))) 
		{
			throw new RuntimeException("Ort ist ungültig");
		}
		if(!Character.isDigit(hausnummer.charAt(0))) 
		{
			throw new RuntimeException("Hausnummer ist ungültig");
		}	
		if(!Character.isUpperCase(ort.charAt(0)))
		{
			 throw new RuntimeException("Ort ist ungültig");
		}
	 }
}
