package uebungsblatt13;

public class Main 
{
	public static void main(String[]args) 
	{
		Person[] p = new Person[100];
		
		for(int i = 0; i < p.length; i+=2) 
		{
			p[i]= new Student();
			p[i+1]= new Professor();
		}
		
		for(int i = 0; i < p.length; i++) 
		{
			//System.out.println(i+1);
			p[i].gibTaetigkeitAus();
		}
	}
}
