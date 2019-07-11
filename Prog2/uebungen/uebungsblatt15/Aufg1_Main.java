package uebungsblatt15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SuppressWarnings({ "unused", "resource", "null" })

public class Aufg1_Main {

	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		
		createNumberFormatException(); // a) NumberFormatException
		
		//createArrayIndexOutOfBoundException(); // b) ArrayIndexOutOfBoundsException
		
		//createNullPointerException(); // c) NullPointerException 
		
		//createOutOfMemoryError(); // d) OutOfMemoryError
		
		//createFileNotFoundException(); // e) FileNotFoundException
		
		//createArithmeticException(); // f) ArithmeticException
		
	}
	
	public static void createNumberFormatException() 
	{
		String numberWithLetter = "123B";
		int number = Integer.parseInt(numberWithLetter);
	}
	
	public static void createArrayIndexOutOfBoundException() 
	{
		int array[] = new int[5]; // 0,1,2,3,4
		array[5] = 1;
	}
	
	public static void createNullPointerException() 
	{
		String a = null;
		a.length();
	}
	
	public static void createOutOfMemoryError() 
	{
		int dummyArraySize = 15;
		long memoryConsumed = 0;
		long[] memoryAllocated = null;	
		
		for (int loop = 0; loop < Integer.MAX_VALUE; loop++) 
		{
			memoryAllocated = new long[dummyArraySize];
			memoryAllocated[0] = 0;
			memoryConsumed += dummyArraySize * Long.SIZE;
			dummyArraySize *= dummyArraySize * 2;
		} 
	}
		
	public static void createFileNotFoundException() throws FileNotFoundException 
	{
		FileInputStream fis = new FileInputStream("pic.jpg");
	}
	
	public static void createArithmeticException()
	{
		int number1 = 0;
		int number2 = 2;
		int erg = number2/number1;
	}
	
	
	

}
