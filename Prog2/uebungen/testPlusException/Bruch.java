package testPlusException;

public class Bruch 
{
	int nenner;
	int zaehler;

	public Bruch(int nenner, int zaehler) 
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
		
		if(nenner == 0) 
		{
			throw new ArithmeticException();
		}
	}
	
	public void verschiebePunkt(int zielX, int zielY) 
	{
		if(zielX < 0 || zielY < 0 || zielX > 1920 || zielY > 1080) 
		{
			throw new RuntimeException("Fehler");
		}
	}
	
	public static void main(String[]args) 
	{
		Bruch a = new Bruch(1,1);
		System.out.println("Nenner: " + a.nenner);
		System.out.println("Zähler: " + a.zaehler);
	}
}
