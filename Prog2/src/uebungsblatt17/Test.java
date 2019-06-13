package uebungsblatt17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String[]args)
	{
		List<String> listTest = new ArrayList<>();
		
		listTest.add("test1");
		listTest.add("test1");
		listTest.add("test2");
		
		for(String s : listTest) 
		{
			System.out.println("ArrayList: "+s);
		}
		System.out.println();
		
		// unsortierte Liste aber ohne doppelte Elemente
		Set<String> setUnsorted = new HashSet<>();
		
		setUnsorted.add("test1");
		setUnsorted.add("test1");
		setUnsorted.add("test2");
		
		for(String s : setUnsorted) 
		{
			System.out.println("setUnsorted:" + s);
		}
		System.out.println();
		
		// sortierte Liste aber ohne doppelte Elemente
		Set<String> listTestSorted = new TreeSet<>();
		
		listTestSorted.add("test1");
		listTestSorted.add("test1");
		listTestSorted.add("test2");
		
		for(String s : listTestSorted) 
		{
			System.out.println("TreeSet:" + s);
		}
		
		
	}
}
