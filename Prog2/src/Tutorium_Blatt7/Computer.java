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
	
	
	public static void ausfuehren(ProgrammInterface programm) 
	{
		Thread thread = new Thread() 
		{
			@Override
			public void run() 
			{
				programm.führeAus();
				try {
					//if(this.betriebessystem == Betriebssystem.Windws10)
					Thread.sleep(100);
					Thread.sleep(5000);
				} 
				catch (Exception e) 
				{

				}
			}
		};
		
		int anzahlKernel = 4; // TODO nur Platzhalter
		for( int i = 0; i < anzahlKernel; i ++) 
		{
			thread.start();
		}
	}
	
	public static void main(String[]args) 
	{
		Computer computer = new ComputerBuilder(111, "Dell")
				.withBetriebssystem(Betriebssystem.Windows7)
				.withKernAnzahl(20).build();
		
		//computer.ausfuehren();
	}


	@Override
	public void führeAus() {
		// TODO Auto-generated method stub
		
	}
}
