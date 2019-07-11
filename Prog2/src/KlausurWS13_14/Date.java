package KlausurWS13_14;

import java.util.Arrays;

public class Date implements Comparable<Date>
{
	private int day, month, year;

	public Date(int d, int m, int y) 
	{
		day = d; month = m; year = y;
	}
	public String toString() 
	{
		return day + "." + month + "." + year;
	} 
	
	@Override
	public int compareTo(Date o) 
	{
		if(this.day < o.day) 
		{
			return 1;
		}
		else if(this.day > o.day) 
		{
			return -1;
		}
		
		return 0;
	}
	
	public static void main(String[]args) 
	{
		Date[] dates = new Date[] 
		{
			new Date(31, 12, 2014),
			new Date(15, 3, -44),
			new Date( 9, 11, 1989),
			new Date( 3, 10, 1990)
		};

		Arrays.sort(dates); 
				 
		for(Date d : dates) 
		{
			System.out.println(d.toString());
		}	 
	}
}
