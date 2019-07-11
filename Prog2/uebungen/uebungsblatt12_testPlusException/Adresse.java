package uebungsblatt12_testPlusException;

public class Adresse 
{
	String straße;
	String ort;
	String hausnummer;
	int plz;
	
	public Adresse(String str, String ort, String hn, int plz) 
	{	char c = str.charAt(0);
		if((c >= 'A' && c <= 'Z') == false) 
		{
			throw new RuntimeException();
		}
		else 
		{
			this.straße = str;
		}
		c = ort.charAt(0);
		if((c >= 'A' && c <= 'Z') == false) 
		{
			throw new RuntimeException();
		}
		else 
		{
			this.ort = ort;
		}
		c = hn.charAt(0);
		if((c >= '0' && c <= '9') == false) 
		{
			System.out.println(c);
			throw new RuntimeException();
		}
		else 
		{
			this.hausnummer = hn;
		}
		this.plz = plz;
	}
}
