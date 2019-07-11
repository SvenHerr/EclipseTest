package Test;

import Test.Person.PersonBuilder;

public class Person 
{
	String name;
	String vName;
	int alter;
	String adresse;
	
	private Person(String name, String vName, int alter,String adresse) 
	{
		this.name = name;
		this.vName = vName;
		this.alter = alter;
		this.adresse = adresse;
	}/*
	public void setAlter(int alter) 
	{
		this.alter = alter;
	}*/
	
	public String toString() 
	{
		return "Name: " + name + " Vorname: " + vName + " Adresse: " + adresse;
	}

	
public static class PersonBuilder 
{
	String name;
	String vName;
	int alter;
	String adresse;
	
	public PersonBuilder(String name, String vName) 
	{
		this.name = name;
		this.vName = vName;
	}
	
	public PersonBuilder withAlter(int alter) 
	{
		this.alter = alter;
		return this;
	}
	public PersonBuilder withAdresse(String adresse) 
	{
		this.adresse = adresse;
		return this;
	}
	
	public Person build() 
	{
		return new Person(name, vName, alter, adresse);
	}
}
}
