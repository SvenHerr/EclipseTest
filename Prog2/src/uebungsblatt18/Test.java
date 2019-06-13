package uebungsblatt18;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Test 
{
	
	public static void main(String[]args) 
	{
		
		Set<String> a = new HashSet<String>();
		
		a.add("1");
		a.add("1");
		a.add("2");
		a.add("3");
		
		for(String b: a) 
		{
			System.out.print(b.toString());
		}
		
		
		
	}

}
