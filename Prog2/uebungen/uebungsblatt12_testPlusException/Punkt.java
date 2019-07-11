package uebungsblatt12_testPlusException;

public class Punkt  
{
	static int x;
	static int y;
	
	public static void verschiebePunkt(int zielX, int zielY) 
	{
		if(zielX < 0) 
		{
			throw new RuntimeException("X is negativ");
		}
		if(zielY < 0) 
		{
			throw new RuntimeException("Y is negativ");
		}		
		if(zielX > 1920) 
		{
			throw new RuntimeException("X higher 1920");
		}
		if(zielY > 1080) 
		{
			throw new RuntimeException("Y higher 1080");
		
		}
		x = zielX;
		y = zielY;	
	}
	
	public static void main(String []args)
	{
		System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
		
	}
}