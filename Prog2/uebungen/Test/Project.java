package Test;

public class Project 
{
	private String name;
	private int nummer;
	private String bezeichnung;
	private int pjNr;
	
	private Project(String name, int nummer)
	{ 
		this.name = name;
		this.nummer = nummer;
	}
	private Project(String name, int nummer, String bezeichnung, int pjNr)
	{ 
		this.name = name;
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.pjNr = pjNr;
	}
	
	
	public void setBezeichnung(String b) 
	{
		this.bezeichnung = b;
	}
	public void setPjNr(int p) 
	{
		this.pjNr = p;
	}
	
	public String getBezeichnung() 
	{
		return this.bezeichnung;
	}
	public int getPjNr() 
	{
		return this.pjNr;
	}
	
	public String getName() 
	{
		return this.name;
	}
	public int getNummer() 
	{
		return this.nummer;
	}
	
	public static class ProjectBuilder
	{
		private String name;
		private int nummer;
		private String bezeichnung;
		private int pjNr;

		public ProjectBuilder(String name, int nummer ) 
		{
			this.name = name;
			this.nummer = nummer;
		}
		
		public ProjectBuilder withBezeichnung(String bezeichnung) 
		{
			this.bezeichnung = bezeichnung;
			return this;
		}
		public ProjectBuilder withPjNr(int pjNr) 
		{
			this.pjNr = pjNr;
			return this;
		}
		
		public Project build() 
		{
			return new Project( name,  nummer, bezeichnung, pjNr);
		}
	}
}
