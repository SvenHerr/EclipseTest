package uebungsblatt17;

public class Aufgabe2_Main 
{
	public static void main(String[] args) 
	{
		Aufgabe2<String> s = new Aufgabe2<>();
		s.push("Hallo");
		s.push("Welt");
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
