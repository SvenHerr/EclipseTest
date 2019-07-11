package uebungsblatt14;

public class Aufg2_Main 
{
	
	public static void main(String[]args) 
	{
		Aufg2_Stack<Integer> a = new Aufg2_Stack<Integer>();
		
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		

		int anzazhlElemente = a.size();
		System.out.println("Anzahl Elemente = " + anzazhlElemente);
		
		for(int i = 0; i < anzazhlElemente; i++) 
		{
			System.out.println("Element an Stelle "+ i + " = " + a.get(i));
		}
		System.out.println();
		
		
		a.pop();
		anzazhlElemente = a.size();
		System.out.println("Anzahl Elemente nach pop = " + anzazhlElemente);
		for(int i = 0; i < anzazhlElemente; i++) 
		{
			System.out.println("Element an Stelle "+ i + " = " + a.get(i));
		}
		System.out.println();
		
		a.push(4);
		anzazhlElemente = a.size();
		System.out.println("Anzahl Elemente nach push = " + anzazhlElemente);
		
		for(int i = 0; i < anzazhlElemente; i++) 
		{
			System.out.println("Element an Stelle "+ i + " = " + a.get(i));
		}
	}
}
