package uebungsblatt17;
import java.util.ArrayList;

public class Aufgabe2<T>
{
	
	ArrayList<T> aList = new ArrayList<T>();
		
	public Aufgabe2() 
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
