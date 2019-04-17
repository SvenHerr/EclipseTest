package uebungsblattVererbung;

public class Aufg1_Main 
{
	public static void main(String[]args) 
	{
		Aufg1_Person a[] = new Aufg1_Person[100];
		
		for(int i  = 0; i < a.length; i++) 
		{
			if(i % 2 == 0) 
			{
				a[i] = new Aufg1_Student();
			}else 
			{
				a[i] = new Aufg1_Professor();
			}
			//a[i].gibTaetigkeitAus();
		}
		
		for(int i = 0; i < a.length; i++) 
		{
			a[i].gibTaetigkeitAus();
		}	
	}
}
