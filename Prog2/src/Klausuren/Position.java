package Klausuren;

import java.util.ArrayList;
import java.util.List;

public class Position  implements Comparable < Position > 
{
	int zeilennummer , spaltennummer ;
	//List<Wort> wortList = new ArrayList();

	
	public Position(int z, int s) 
	{
		this.zeilennummer = z;
		this.spaltennummer = s;
	}
	
	@Override
	public int compareTo(Position o) 
	{
		
		return 0;
	}
	
	 // Methode compareTo aus Comparable

}
