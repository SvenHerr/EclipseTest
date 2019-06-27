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
					try 
					{	
						if(betriebessystem == Betriebssystem.Windws10) 
						{
							Thread.sleep(100);
						}else if(betriebessystem == Betriebssystem.WindowsXP) 
						{
							Thread.sleep(5000);
						}
						
						
					} 
					catch (Exception e) 
					{
					}
				}
			};
		
			thread.start();
		}
	}
	
	public void ausfuehrenOption1(ProgrammInterface programm) 
	{
		Thread thread = new Thread() 
		{
			@Override
			public void run() 
			{
				programm.führeAus();
				try 
				{	
					if(betriebessystem == Betriebssystem.Windws10) 
					{
						Thread.sleep(100);
					}else if(betriebessystem == Betriebssystem.WindowsXP) 
					{
						Thread.sleep(5000);
					}	
				} 
				catch (Exception e) 
				{
				}
			}
		};
		
		for( int i = 0; i < this.kernAnzahl; i ++) 
		{
			thread.start();
		}
	}
}
