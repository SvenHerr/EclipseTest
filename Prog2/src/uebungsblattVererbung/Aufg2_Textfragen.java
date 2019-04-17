package uebungsblattVererbung;

public class Aufg2_Textfragen extends Aufg2_Quizbogen
{
	//private String frage;
	
	
	public Aufg2_Textfragen(String frage) 
	{
		this.frage = frage;
	}
	
	@Override
	public void getFrage() 
	{
		System.out.println(frage);
	}
	
	@Override
	public void getAntwort() 
	{
		System.out.println("_____________");
		System.out.println("_____________");
	}
	
}
