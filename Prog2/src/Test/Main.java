package Test;

import java.io.*;
import java.util.*;

import Test.Person.PersonBuilder;

public class Main implements Comparable<Student>
{
	 Collection<Student> studenten = new ArrayList<>();
	
	public static void main(String[]args) throws FileNotFoundException 
	{
		String IBAN = "DE37055";
		String laenderCode = ""+IBAN.charAt(0)+ IBAN.charAt(1);
		System.out.println(laenderCode);
		
		//InputStream istr = new InputStream(); // abstrakte Klasse
		
		FileInputStream fi = new FileInputStream(""); 
		InputStreamReader i = new InputStreamReader(fi);
		
		

		try
		{
			FileInputStream fis = new FileInputStream("pic.jpg"); // Öffnen der Datei
		}
		catch (FileNotFoundException e) // beim öffnen der Datei kann eine FileNotFoundException ausgelöst werden
		{
		}
		
		Collection<Student> studenten = new ArrayList<>();
		//Collections.sort(studenten);
		
		
		HashMap<String, ArrayList> english2German = new HashMap<>();
		
		ArrayList<String> arr  =new ArrayList();
		arr.add("eins");
		arr.add("zwei");
		
		english2German.put("1 und 2", arr);
		
		english2German.get("1 und 2");
		
		List<String> strings = new ArrayList<>();
		List<?> list = new ArrayList<>();
		
		List<Objects> strings1 = new ArrayList<>();
		List<?> s = strings1;
		/*
		String ss = "Hallo Welt";
		for (char c : ss.toCharArray())
		{
		System.out.println(c);
		}*/
		
		/* 1 */	Person pb1 = new PersonBuilder("Herbert", "Müller")
				.withAlter(24).withAdresse("testaddr").build();
		System.out.println("pb1");
				System.out.println(pb1.toString()+"\n");
			
			/* 2 */PersonBuilder pb2 = new Person.PersonBuilder("Herbert", "Müller")
						.withAlter(24).withAdresse("testaddr");
						pb2.build();
						//Person p2 = pb2.build();
						System.out.println("pb2");
						//System.out.println(pb2.toString()+"\n");
						System.out.println(pb2.toString()+"\n");
				
			/* 3 */Person pb3 = new Person.PersonBuilder("Herbert", "Müller")
						.withAlter(24).withAdresse("testaddr").build();
			System.out.println("pb3");
			System.out.println(pb3.toString()+"\n");
		
		/*
		try {
			test();
			
		} catch (EigeneException e) 
		{
			
				//e.toString();
			e.printStackTrace();
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}*/
		
	}
	
	
	public void listeStudentenImRaum() 
	{
		for(Student s : studenten) 
		{
			System.out.println(s);
		}
	}
	public void listeStudentenImRaum1() 
	{
		Iterator<Student> iterator = studenten.iterator();
		
		while(iterator.hasNext())
		{
			Student student = iterator.next();
			System.out.println(student);
		}
	}


	public static void test() throws EigeneException, Exception {
		throw new EigeneException();
	}

	public static void test1() {
		throw new MyException1();
	}

	public static void ka() {
		try (FileOutputStream fos = new FileOutputStream("hello.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos);) {
			osw.write("Test text ");
		} catch (Exception e) {

		}

		try (FileWriter fw = new FileWriter("h.txt");) {
			fw.write("Hello World!");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
