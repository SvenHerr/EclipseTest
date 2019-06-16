package uebungsblatt19;

public class IteratorMain 
{
	public static void main(String[] args) 
	{
		String string = "Hallo Welt";
		IterableString s = new IterableString(string);
		
		for (char c : s) 
		{
			System.out.print(c);
		}
		System.out.println();
		
		for (char c : string.toCharArray())
		{
			System.out.print(c);
		}
	}
}
