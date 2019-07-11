package uebungsblatt12_testPlusException;

public class Bruch1 
{
	double nenner;
	double zaehler;

	public Bruch1(double nenner, double zaehler) 
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
		double erg = 0;
		
		try 
		{
			erg = this.zaehler / this.nenner;
			System.out.println(erg);
			
		}catch(ArithmeticException e) 
		{
			System.out.println(erg);
			System.out.println(e);
		}	
	}	
	
	public static void main(String[]args) 
	{
		Bruch1 a = new Bruch1(1,1);
	}
}
