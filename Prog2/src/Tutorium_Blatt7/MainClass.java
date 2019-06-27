package Tutorium_Blatt7;

public class MainClass 
{
	public static void main(String[]args) 
	{
		Computer computer = new ComputerBuilder(111, "Dell")
				.withBetriebssystem(Betriebssystem.WindowsXP)
				.withKernAnzahl(20).build();
		
		HalloWeltProgramm programm = new HalloWeltProgramm();
		computer.ausfuehren(programm);
	}
}
