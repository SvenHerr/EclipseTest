package uebungsblatt14;
import java.util.ArrayList;

@SuppressWarnings("all") //unterdrueckt alle Warnings
public class Aufg3_Stack<T>
{
	ArrayList<T> aList = new ArrayList<T>();
	
	public Aufg3_Stack() 
	{
		super();
	}
				
	public boolean  push(T t) 
	{
		aList.add(t);
		return true;
	}
	  
	public T pop() 
	{
		return (T) aList.remove((aList.size()-1));  
	}
}
