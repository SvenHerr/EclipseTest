package KlausurWS15_16;

public class Main 
{
	public static void main(String[]args) 
	{
		//aufgabe1();
		//aufgabe2();
		//aufgabe2Option1();
		aufgabe3();
	}
	public static void aufgabe1() 
	{
		String fileName = "IntValues.txt";
		Aufgabe1.schreibeWerteAlsIntDatei(fileName);
		System.out.println(Aufgabe1.liesWerteAusIntDatei(fileName));
				
		System.out.println(Aufgabe1.liesWerteAusSystemIn());
	}
	
	
	public static void aufgabe2() 
	{
		HatKosten[] o = new HatKosten[6];
		
		o[0] = new Auto("Bmw", 60000.95, 122);
		o[1] = new Auto("Audo", 45000.55, 150 );
		
		o[2] = new Computer("Dell", 1000.99, "i5" );
		o[3] = new Computer("Dell1", 500.99, "i5" );
		o[4] = new Computer("Apple", 2000.99, "i7" );
		
		for(int i = 0; i < o.length; i++) 
		{
			if(o[i] != null) 
			{
				System.out.println("Objekt: "+i+"\n"
										+ "Kosten: " + o[i].getKosten()+"\n"
										+ "Name: "+ o[i].getName()+"\n");	
			}
		}
	}
	
	public static void aufgabe2Option1() 
	{
		Object[] o = new Object[6];
		
		o[0] = new Auto("Bmw", 60000.95, 122);
		o[1] = new Auto("Audo", 45000.55, 150 );
		
		o[2] = new Computer("Dell", 1000.99, "i5" );
		o[3] = new Computer("Dell1", 500.99, "i5" );
		o[4] = new Computer("Apple", 2000.99, "i7" );
		
		for(int i = 0; i < o.length; i++) 
		{
			if(o[i] != null) 
			{
				if(o[i].getClass()== Auto.class) 
				{
					Auto b = (Auto) o[i];
					System.out.println("Objekt: "+i+"\n"
										+ "Kosten: " + b.getKosten()+"\n"
										+ "Name: "+ b.getName()+"\n");
				}
				else 
				{
					Computer b = (Computer) o[i];
					System.out.println("Objekt: "+i+"\n"
										+ "Kosten: " + b.getKosten()+"\n"
										+ "Name: "+ b.getName()+"\n");
				}
			}
		}
	}
	
	public static void aufgabe3() 
	{
		
	}
}
