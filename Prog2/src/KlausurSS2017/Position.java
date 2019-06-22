package KlausurSS2017;

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
	
	public void setZeilennummer(int zeilennummer) 
	{
		this.zeilennummer = zeilennummer;
	}
	public int getZeilennummer() 
	{
		return this.zeilennummer;
	}
	
	public void setSpaltennummer(int spaltennummer) 
	{
		this.spaltennummer = spaltennummer;
	}
	public int getSpaltennummer() 
	{
		return this.spaltennummer;
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
