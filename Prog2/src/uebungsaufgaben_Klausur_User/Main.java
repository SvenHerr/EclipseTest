package uebungsaufgaben_Klausur_User;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[]args) 
	{
		User one = new User("Anton", "pw123");
		User two = new User("Markus", "lol");
		User three = new User("Lukas", "pwggg");
		User four = new User("Phillip", "pwxx");
		User five = new User("Horst", "123");
		
		List<User> list = new ArrayList<User>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		
		for(int i = 0; i < list.size(); i++) 
		{
			System.out.println("Benutzername: " + list.get(i).benutzername + " Passwort: "+list.get(i).passwort);
		}
		System.out.println();
		
		UserManager usermanager = new UserManager();
		usermanager.serialize(list);
		
		
		List<User> listDeserialize = usermanager.deserialize();
		for(int i = 0; i < listDeserialize.size(); i++) 
		{
			System.out.println("Benutzername: " + listDeserialize.get(i).benutzername + " Passwort: "+listDeserialize.get(i).passwort);
		}
	}
}
