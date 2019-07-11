package Test;

public class Project_Main 
{
	
	public static void main(String[]args) 
	{
		Project a = new Project.ProjectBuilder("test", 123)
				.withBezeichnung("bez")
				.withPjNr(321).build();
		
		
/*
 * 			Person p = new Person.PersonBuilder("John", "Doe", "01.01.1900")
			.withKoerpergroesse(188)
			.withWohnort("Berlin")
			.build();
 */
		
	}

}
