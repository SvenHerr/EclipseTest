package Tutorium_Blatt7;

public class ComputerBuilder 
{
	int seriennummer;
	String hersteller;
	int kernAnzahl = 1;
	Betriebssystem betriebessystem = Betriebssystem.Windws10;
	
	public ComputerBuilder(int seriennummer, String hersteller) 
	{
		this.seriennummer = seriennummer;
		this.hersteller = hersteller;
	}
	
	public ComputerBuilder withKernAnzahl(int kernAnzahl) 
	{
		this.kernAnzahl = kernAnzahl;
		return this;
	}
	public ComputerBuilder withBetriebssystem(Betriebssystem betriebessystem) 
	{
		this.betriebessystem = betriebessystem;
		return this;
	}
	
	public Computer build() 
	{
		return new Computer(seriennummer, hersteller, kernAnzahl,betriebessystem );
	}
}
