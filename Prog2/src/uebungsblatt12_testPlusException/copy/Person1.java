package uebungsblatt12_testPlusException.copy;

public class Person1 
{
	String vorname;
	String nachname;
	Adresse adresse;
	
	public Person1(String vn, String nn, Adresse adr) 
	{
		char c = vn.charAt(0);
		if((c >= 'A' && c <= 'Z') == false) 
		{
			throw new RuntimeException();
		}
		else 
		{
			this.vorname = vn;
		}
		this.nachname = nn;
		this.adresse = adr;
	}

	public static void main(String[]args) 
	{
		Adresse adr = new Adresse("Test", "TestOrt", "1111", 97072);
		Person1 p1 = new Person1("Thomas", "Müller", adr);
		
		
	}		
}