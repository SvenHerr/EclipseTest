package Tutorium_Blatt7;

public class Computer implements ProgrammInterface
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
	
	
	public void ausfuehren(ProgrammInterface programm) 
	{
		for( int i = 0; i < this.kernAnzahl; i ++) 
		{
		
			Thread thread = new Thread() 
			{
				@Override
				public void run() 
				{
					programm.führeAus();
					try {
						
						//switch(this.)
						//if(this.betriebessystem == Betriebssystem.Windws10)
						Thread.sleep(100);
						Thread.sleep(5000);
					} 
					catch (Exception e) 
					{
	
					}
				}
			};
		
			thread.start();
			
			//int anzahlKernel = 4; // TODO nur Platzhalter
			
			
		}
	}
	
	


	@Override
	public void führeAus() {
		
		
	}
}
