package Test;

public class Liste<E> 
{

	Knoten start;
	Knoten ende;

	public void add(E element) 
	{
		if (element == null)
			return;
		Knoten k = new Knoten(element);
		if (start == null) 
		{
			start = k;
			ende = start;
		} 
		else 
		{
			ende.next = k;
			ende = k;
		}
	}
}
