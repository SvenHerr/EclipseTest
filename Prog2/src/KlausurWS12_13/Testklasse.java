package KlausurWS12_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testklasse 
{
	public static void main(String[]args) 
	{
		List<Bruch> brueche = new ArrayList<>();
		brueche.add(new Bruch(1,4));
		brueche.add(new Bruch(2,3));
		brueche.add(new Bruch(1,8));
		brueche.add(new Bruch(4,17));
		brueche.add(new Bruch(-4,5));
		
		Collections.sort(brueche);
		
		for(Bruch bruch : brueche) 
		{
			System.out.println(bruch.toString());
		}
	}

}
