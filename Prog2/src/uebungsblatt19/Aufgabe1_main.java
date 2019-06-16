package uebungsblatt19;


public class Aufgabe1_main 
{
	public static void main(String[]args) 
	{
		
		Aufgabe1_Nährstoffangaben a = new Aufgabe1_Nährstoffangaben.Aufgabe1_NährstoffangabenBuilder(1, 2)
				.withEiweiß(10)
				.withFett(0.5)
				.withKohlenhydrate(0.1)
				.withNatrium(0.001)
				.build();
		
		System.out.print(a.toString());	
		
	}
}
