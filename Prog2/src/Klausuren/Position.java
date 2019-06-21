package Klausuren;

import java.util.ArrayList;
import java.util.List;

public class Position  implements Comparable < Position > 
{
	int zeilennummer , spaltennummer ;
	
	public Position(int z, int s) 
	{
		this.zeilennummer = z;
		this.spaltennummer = s;
	}
	
	@Override
	public int compareTo(Position o) 
	{
		if(o.zeilennummer < this.zeilennummer) 
		{
			return -1;
		}else if(o.zeilennummer == this.zeilennummer) 
		{
			return 0;
		}else 
		{
			return 1;
		}
	}
}
