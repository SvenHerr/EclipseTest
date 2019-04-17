package testPlusException;

public class Bruch 
{
	double nenner;
	double zaehler;

	public Bruch(double nenner, double zaehler) 
	{
		this.zaehler = zaehler;
		if(nenner == 0) 
		{
			throw new ArithmeticException();
			
		}
		this.nenner = nenner;
	
	}
	
	public static void main(String[]args) 
	{
		Bruch a = new Bruch(0,1);
	}
}
