package KlausurWS13_14;

import java.util.Iterator;

public class SquareNumberIterator implements Iterator<Integer>  
{
	int i  = 1;
	int e = 0;

	@Override
	public boolean hasNext() 
	{
		e = i * i;
		if( e >= Integer.MAX_VALUE) // Bin mir bei der Terminierung nicht ganz sicher
		{
			return false;
		};
		
		return true;
	}

	@Override
	public Integer next() 
	{	
		e = i * i;
		i++;
		
		return e;
	}
}
