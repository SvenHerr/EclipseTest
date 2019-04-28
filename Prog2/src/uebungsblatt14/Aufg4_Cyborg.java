package uebungsblatt14;

import java.util.Random;

public class Aufg4_Cyborg 
{
	
	public Aufg4_Entscheidungen entscheide(Aufg4_Gefahren gefahr) 
	{
		Aufg4_Mensch mensch = new Aufg4_Mensch();
		Aufg4_Roboter roboter = new Aufg4_Roboter();
		Aufg4_Entscheidungen entscheidungMensch = mensch.entscheide(gefahr);
		Aufg4_Entscheidungen entscheidungRoboter = roboter.entscheide(gefahr);
		
		
		if(entscheidungRoboter == entscheidungMensch) 
		{
			System.out.println("sind sich einig");
			return entscheidungRoboter;
		}
		else 
		{
			System.out.println("sind sich uneinig");
			Random r = new Random();
			int random = r.nextInt(10-0) + 1;
			
			if(random % 2 == 0) 
			{
				System.out.println("entscheidet sich für roboter");
				return entscheidungRoboter;
			}else 
			{
				System.out.println("entscheidet sich für mensch");
				return entscheidungMensch;
			}
		}
	}
}
