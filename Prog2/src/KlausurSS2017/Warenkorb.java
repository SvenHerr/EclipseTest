package KlausurSS2017;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb 
{
	Posten posten;
	List<Posten> postenList = new ArrayList();
	
	public Warenkorb() 
	{
		posten = new Posten();
	}
	
	public void addPosten(String name) 
	{
		posten = new Posten();
		posten.setName(name);
		postenList.add(posten);
		
	}
	public List<Posten> getAllPosten() 
	{
		return postenList;
	}
	
	/*
	public void setPostenName(String postenName) 
	{
		posten.setName(postenName);
	}
	
	public String getName() 
	{
		return posten.postenName;
	}*/

	static class Posten 
	{
		String postenName;
		
		
		public Posten() 
		{
			
		}
		/*public Posten(String postenName) 
		{
			this.postenName = postenName;
		}*/
		
		public void setName(String postenName) 
		{
			this.postenName = postenName;
		}
		
		public String getName() 
		{
			return this.postenName;
		}
	}	
	
}
