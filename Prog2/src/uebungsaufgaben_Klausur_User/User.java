package uebungsaufgaben_Klausur_User;

import java.io.Serializable;

public class User implements Serializable, Comparable<User>
{
	
	private static final long serialVersionUID = 1L;
	
	String benutzername;
	
	transient String passwort; // b 
	
	public User(String benutzername, String passwort) 
	{
		this.benutzername = benutzername;
		this.passwort = passwort;
	}
	
	public String getBenutzname() 
	{
		return this.benutzername;
	}
	

	@Override
	public int compareTo(User o) 
	{
		if (!this.benutzername.equalsIgnoreCase(o.benutzername)) 
		{
			return this.benutzername.compareTo(o.benutzername);
		}
            
        if (!this.benutzername.equalsIgnoreCase(o.benutzername)) 
        {
        	return this.benutzername.compareTo(o.benutzername);
        }
		
		return 0;
	}
}
