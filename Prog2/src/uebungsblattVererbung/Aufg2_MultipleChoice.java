package uebungsblattVererbung;

public class Aufg2_MultipleChoice extends Aufg2_Quizbogen
{
	//private String frage;
	private String[] multiAntworten;
	
	
	public Aufg2_MultipleChoice(String frage, String[] multiAntworten) 
	{
		this.multiAntworten = multiAntworten;
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
		System.out.println("A: " + multiAntworten[0] );
		System.out.println("B: " + multiAntworten[1]);
		System.out.println("C: " + multiAntworten[2]);
		System.out.println("D: " + multiAntworten[3]);
	}

}
