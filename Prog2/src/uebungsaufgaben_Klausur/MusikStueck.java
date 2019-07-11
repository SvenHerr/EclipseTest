package uebungsaufgaben_Klausur;

public class MusikStueck<MusikStueck>
{
	protected String titel;     // Name des Musikstueckes
	protected String interpret;    // Gruppe/Saenger des Stueckes
	protected int laenge;     // Dauer in Sekunden
	   
	public MusikStueck(String titel, String interpret, int laenge)
	{
	    this.titel = titel;
	    this.interpret = interpret;
	      this.laenge = laenge;
	}

	public String getTitel() 
	{
		return titel;
	}

	public void setTitel(String titel) 
	{
		this.titel = titel;
	}

	public String getInterpret() 
	{
		return interpret;
	}

	public void setInterpret(String interpret) 
	{
		this.interpret = interpret;
	}

	public int getLaenge() 
	{
		return laenge;
	}

	public void setLaenge(int laenge) 
	{
		this.laenge = laenge;
	}

	@Override
	public String toString() 
	{
		return "Titel= " + titel+"\n" + "Interpret= " + interpret+"\n" + "Laenge= " + laenge+"\n";
	}
	/*
	public static void main(String[]args) 
	{
		MusikStueck a = new MusikStueck("ka", "InterpretTest", 5);
		System.out.println(a.toString());
	}*/
}
