package uebungsblatt14;

import java.util.ArrayList;

@SuppressWarnings("all") //unterdrueckt alle Warnings
public class Aufg2_Stack<T> extends ArrayList
{
	
	public Aufg2_Stack() 
	{
		super();
	}
			
	public boolean  push(T t) 
	{
		this.add(t);
		return true;
	}
	  
	public T pop() 
	{
		return (T) this.remove((this.size()-1));  
	}
}
