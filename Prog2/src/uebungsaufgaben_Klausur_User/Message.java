package uebungsaufgaben_Klausur_User;

public class Message 
{
	
	//private final User author ;
	private int charCounter ;
	private String message ;
	private String creationDate ;
	
	public Message(String message) 
	{
		this.message = message;
	}
	
	public void setCharCounter(int charCounter) 
	{
		this.charCounter = charCounter;
	}
	
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public void setCreationDate(String creationDate) 
	{
		this.creationDate = creationDate;
	}
	
	
	public int getCharCounter() 
	{
		return this.charCounter;
	}
	
	public String getMessage() 
	{
		return this.message;
	}
	
	public String getCreationDate() 
	{
		return this.creationDate;
	}
}
