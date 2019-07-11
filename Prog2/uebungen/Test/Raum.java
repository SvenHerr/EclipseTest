package Test;

import java.util.*;

public class Raum 
{
	final int KAPAZITAET = 50;
	ArrayList<Student> studenten = new ArrayList<>();

	public void betrete(Student s) 
	{
		boolean a = checkListIfNameIsInList(s);
		
		if (!studenten.contains(s) && studenten.size() < KAPAZITAET && a)
			studenten.add(s);
	}
	
	public boolean checkListIfNameIsInList(Student s) 
	{
		for(Student stud : studenten) 
		{
			if(stud.matNr  == s.matNr) 
			{
				return false;
			}	
		}
		return true;
	}
	
	public ArrayList<Student> getStudentsInRaum() 
	{
		return studenten;
	}

	public void verlasse(Student s) 
	{
		studenten.remove(s);
	}

	public static void main(String[]args) 
	{
		Student s =  new Student("Herbert", 12345);
		Student s1 =  new Student("Herbert", 12345);
		Raum m = new Raum();
		
		m.betrete(s);
		m.betrete(s1);
		//m.verlasse(s);
		
		Collection<Student> list = m.getStudentsInRaum();
		for(Student stud : list) 
		{
			System.out.println(stud.name +""+ stud.matNr);
		}	
	}
}

class Student
{
	String name;
	int matNr;
	
	public Student(String name, int matNr) 
	{
		this.name = name;
		this.matNr = matNr;
	}
}
