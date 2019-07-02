package uebungsblatt13;

public class Abteilungsleiter extends Angestellter
{
	
	public Abteilungsleiter(String nn, String vn, String gebDat, int id, double gg) 
	{
		super( nn, vn, gebDat, id, gg);
		
		this.gehaltsfaktor = 2;
	}
	
	public void befördern(Angestellter ang) 
	{
		ang.setGehaltsfaktor(ang.gehaltsfaktor += 0.1);
	}

	public static void main(String[]args) 
	{
		Angestellter hans = new Angestellter("Müller", "Hans", "12.01.1990", 1234, 3400);
		System.out.println(hans.getGehaltsfaktor());
		
		Abteilungsleiter egon = new Abteilungsleiter("Meister", "Egon", "10.01.1980", 3333, 5400);
		egon.befördern(hans);
		
		System.out.println(hans.getGehaltsfaktor());
		
	}
}
