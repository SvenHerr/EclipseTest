package Test;

public class Knoten 
{
	Object element;
	Knoten next;

	public Knoten(Object element) 
	{
		this.element = element;
	}

	public Object getElement() 
	{
		return element;
	}
}
