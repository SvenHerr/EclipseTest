package uebungsblatt14;

public class Aufg4_Main 
{
	
	public static void main(String[]args) 
	{
		//option1();
		//option2();
		option3();
			
	}
	public static void option1() 
	{
		Aufg4_Mensch mensch = new Aufg4_Mensch();
		Aufg4_Roboter roboter = new Aufg4_Roboter();
		
		
		Aufg4_Gefahren gefahrVon = Aufg4_Gefahren.GEFAHR_LINKS;
		
		Aufg4_Entscheidungen entscheidungMensch = mensch.entscheide(gefahrVon);
		Aufg4_Entscheidungen entscheidungRoboter = roboter.entscheide(gefahrVon);
		
		System.out.println("Gefahr von: " + gefahrVon);
		
		System.out.println("Antwort Mensch = " + entscheidungMensch);
		System.out.println("Antwort Roboter = " + entscheidungRoboter);
		System.out.println();
		
		
		gefahrVon = Aufg4_Gefahren.GEFAHR_RECHTS;
		
		entscheidungMensch = mensch.entscheide(gefahrVon);
		entscheidungRoboter = roboter.entscheide(gefahrVon);
		
		System.out.println("Gefahr von: " + gefahrVon);
		
		System.out.println("Antwort Mensch = " + entscheidungMensch);
		System.out.println("Antwort Roboter = " + entscheidungRoboter);
		System.out.println();
		
		
		gefahrVon = Aufg4_Gefahren.GEFAHR_VORNE;
		
		entscheidungMensch = mensch.entscheide(gefahrVon);
		entscheidungRoboter = roboter.entscheide(gefahrVon);
		
		System.out.println("Gefahr von: " + gefahrVon);
		
		System.out.println("Antwort Mensch = " + entscheidungMensch);
		System.out.println("Antwort Roboter = " + entscheidungRoboter);
	}
	
	public static void option2() 
	{
		Aufg4_Mensch mensch = new Aufg4_Mensch();
		Aufg4_Roboter roboter = new Aufg4_Roboter();
		
		
		Aufg4_Gefahren gefahrVon = Aufg4_Gefahren.GEFAHR_LINKS;
		
		Aufg4_Entscheidungen entscheidungMensch;
		Aufg4_Entscheidungen entscheidungRoboter;
		
		int temp = 0;
		int countUnentschieden = 0;
		for(int i = 0; i < 100; i++) 
		{
			if(temp == 0) 
			{
				gefahrVon = Aufg4_Gefahren.GEFAHR_LINKS;
				
			}
			else if(temp ==1) 
			{
				gefahrVon = Aufg4_Gefahren.GEFAHR_RECHTS;
			}
			else if(temp ==2) 
			{
				gefahrVon = Aufg4_Gefahren.GEFAHR_VORNE;
			}
			
			entscheidungMensch = mensch.entscheide(gefahrVon);
			entscheidungRoboter = roboter.entscheide(gefahrVon);
			
			System.out.println("Gefahr von: " + gefahrVon);
			
			System.out.println("Antwort Mensch = " + entscheidungMensch);
			System.out.println("Antwort Roboter = " + entscheidungRoboter);
			
			if(entscheidungMensch == Aufg4_Entscheidungen.UNENTSCHIEDEN) 
			{
				countUnentschieden++;
			}
			
			System.out.println();
			temp++;
			if(temp == 3) 
			{
				temp = 0;
			}
		}
		System.out.println(countUnentschieden);
	}
	
	public static void option3() // b) 		=>	Cyborg
	{
		Aufg4_Cyborg cyborg = new Aufg4_Cyborg();
		
		Aufg4_Gefahren gefahrVon = Aufg4_Gefahren.GEFAHR_LINKS;
		
		Aufg4_Entscheidungen entscheidungCyborg;
		
		
		int temp = 0;
		for(int i = 0; i < 100; i++) 
		{
			if(temp == 0) 
			{
				gefahrVon = Aufg4_Gefahren.GEFAHR_LINKS;
				
			}
			else if(temp ==1) 
			{
				gefahrVon = Aufg4_Gefahren.GEFAHR_RECHTS;
			}
			else if(temp ==2) 
			{
				gefahrVon = Aufg4_Gefahren.GEFAHR_VORNE;
			}
		
			entscheidungCyborg = cyborg.entscheide(gefahrVon);
			
			System.out.println("Gefahr von: " + gefahrVon);
			System.out.println("Antwort Cyborg = " + entscheidungCyborg);
			
	
			System.out.println();
			temp++;
			if(temp == 3) 
			{
				temp = 0;
			}
		}
	}
}
