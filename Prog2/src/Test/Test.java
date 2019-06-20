package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test extends Mensch implements Test_Interface
{

	public Test(String vorname, String nachname, int alter) 
	{
		super(vorname, nachname, alter);
		
	}
	public void testMethode(String testValue) 
	{
		
	}
	
	public static void main(String[]args)  
	{
		Test a = new Test("Hugo", "Walter", 1);
		a.getAlter();
		a.getNachname();
		
	
		
		Tage_Enum tageEnum = Tage_Enum.Dienstag;
		String test = tageEnum.toString();
		
		Tage_Enum[] wochentage = Tage_Enum.values();
		String wochenTag = wochentage[1].toString();
		System.out.println(wochenTag);
		
		printWochenTagInXTagen(1, "Mittwoch");
		
		try 
		{
			int zahl = ExceptionTest.exceptionTest();
			
		}catch(RuntimeException re) 
		{
			System.out.println("Runtime Exception gefangen");
		}
		
		try 
		{
			throwMyException();
		}catch(MyException my) 
		{
			System.out.println(my.getMessage());
		}
		
		
	}
	
	public static void throwMyException() throws MyException 
	{
		throw new MyException("TestException");
	}
	
	
	
	
	@Override
	public void TestInterfaceMethode() 
	{
		//String test = Test_Interface.testValue;
		if("TestValue".equals(Test_Interface.testValue) ) 
		{
			
		}
		
		
	}
	
	public static void printWochenTagInXTagen(int x, String tag) 
	{
		Tage_Enum[] wochentage = Tage_Enum.values();
		int teiler = wochentage.length;
		
		Tage_Enum arr = Tage_Enum.valueOf(tag);
		int number = arr.ordinal();
		int summe = (number + x) % teiler;
		
		System.out.println(wochentage[summe]);
	}
	
	
	public class Test1 extends AbstraktTest
	{
		@Override
		public void testMethode(String testValue) 
		{
			String value = testValue;
			
		}	
	}


	
}
