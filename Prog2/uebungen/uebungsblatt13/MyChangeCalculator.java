package uebungsblatt13;

public class MyChangeCalculator extends SimpleChangeCalculator
{
	@Override
	public int[] getChange(int euros, int cent)
	{
		if(euros < 0 ||cent < 0 || cent > 99) 
		{
			throw new RuntimeException("Fehler in den Parametern. Cent muss keliner 99, keine Negativwerte");
		}
		
		int anzahl2 = 0;
		if(euros >= 2) 
		{
			anzahl2 = euros / 2;
			euros -= anzahl2*2;
		}
		
		int anzahl1 = 0;
		if(euros == 1) 
		{
			anzahl1 = 1;
			euros -= anzahl1*1;
		}
		
		int anzahl50 = 0;
		if(cent >= 50) 
		{
			anzahl50 = cent / 50;
			cent -= anzahl50*50;
		}
		
		int anzahl20 = 0;
		if(cent >= 20) 
		{
			anzahl20 = cent / 20;
			cent -= anzahl20*20;
		}
		
		int anzahl10 = 0;
		if(cent >= 10) 
		{
			anzahl10 = cent / 10;
			cent -= anzahl10*10;
		}
		
		int anzahl5 = 0;
		if(cent >= 5) 
		{
			anzahl5 = cent / 5;
			cent -= anzahl5*5;
		}
		
		int anzahl2C = 0;
		if(cent >= 2) 
		{
			anzahl2C = cent / 2;
			cent -= anzahl2C*2;
		}
		
		int anzahl1C = 0;
		if(cent >= 1) 
		{
			anzahl1C = cent / 1;
			cent -= anzahl1C*1;
		}
		
		return new int[] {
				anzahl1C, // alles in 1-Cent-Muenzen
				anzahl2C,					// keine 2-Cent-Muenzen
				anzahl5,					// keine 5-Cent-Muenzen
				anzahl10,					// keine 10-Cent-Muenzen
				anzahl20,					// keine 20-Cent-Muenzen
				anzahl50,					// keine 50-Cent-Muenzen
				anzahl1,					// keine 1-Euro-Muenzen
				anzahl2					// keine 2-Euro-Muenzen
			};
	}

	public static void main(String[]args) 
	{
		MyChangeCalculator a = new MyChangeCalculator();
		a.test();
		int[] tst = a.getChange(1,99);
		/*
		for(int i = 0; i < tst.length; i++) 
		{
			System.out.println(tst[i]);
		}*/
		System.out.println();
		System.out.println(); 
		System.out.println(tst[0]+" 1-Cent");
		System.out.println(tst[1]+" 2-Cent");
		System.out.println(tst[2]+" 5-Cent");
		System.out.println(tst[3]+" 10-Cent");
		System.out.println(tst[4]+" 20-Cent");
		System.out.println(tst[5]+" 50-Cent");
		System.out.println(tst[6]+" 1-Euro");
		System.out.println(tst[7]+" 2-Euro");	
	}
}
