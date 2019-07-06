package Streams;

import java.io.*;

public class WritePersonClass 
{
	public static void main(String[] args) 
	{
		try 
		{
			Person p = new Person("Doe", "John", "123");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
			oos.writeObject(p);
			oos.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

class Person implements Serializable 
{
	private static final long serialVersionUID = -6524876202123487472L;
	String name;
	String vorname;
	transient String pw;

	public Person(String name, String vorname, String pw) 
	{
		this.name = name;
		this.vorname = vorname;
		this.pw = pw;
	}
}
