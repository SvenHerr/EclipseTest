package Streams;

import java.io.*;

public class ReadPersonClass 
{

	public static void main(String[] args) 
	{
		try 
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
			Person person = (Person) ois.readObject();
			ois.close();
			System.out.println(person.vorname + " " + person.name + " " + person.pw);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
