package Tutorium_Blatt7;

public class Computer 
{
	int seriennummer;
	String hersteller;
	int kernAnzahl = 1;
	Betriebssystem betriebessystem = Betriebssystem.Windws10;
	
	protected Computer(int seriennummer, String hersteller, int kernAnzahl, Betriebssystem betriebessystem) 
	{
		this.seriennummer = seriennummer;
		this.hersteller = hersteller;
		this.kernAnzahl = kernAnzahl;
		this.betriebessystem = betriebessystem;
	}
	
	
	public static void ausfuehren(Programm programm) 
	{
		
		Thread thread = new Thread() 
		{
			@Override
			public void run() 
			{
				programm.führeAus();
				try {
					if(this.betriebessystem == Betriebssystem.Windws10)
					Thread.sleep(100);
					Thread.sleep(5000);
				} 
				catch (Exception e) 
				{

				}
			}
		};

		thread.start();
		thread.start();
		thread.start();
		thread.start();
	}
}
