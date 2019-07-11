package KlausurWS15_16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Aufgabe1 
{	
	public static int liesWerteAusIntDatei(String dateiname) 
	{
		int summe = 0;
		
		try(DataInputStream din = new DataInputStream(new FileInputStream(dateiname)))
		{
			do
			{
				summe += (int)din.readInt();
			}
			while(true);
			
		}catch(EOFException eof) 
		{
			
		}
		catch(Exception e) 
		{
			System.out.println("Fehler");
			System.out.println(e.toString());
		}
		
		return summe;
	}
	
	// Diese Methode war nicht gefordert
	public static void schreibeWerteAlsIntDatei(String dateiname) 
	{
		try(FileOutputStream fos = new FileOutputStream(dateiname))
		{
			DataOutputStream dout = new DataOutputStream(fos);
			dout.writeInt(100);
			dout.writeInt(50);
					
		}catch(Exception e) 
		{
			System.out.println("fehler");
		}
	}
	public static double liesWerteAusSystemIn() 
	{
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		char[] c = line.toCharArray();
		double result = 0.0;
		int counter = 0;
		for(char n : c ) 
		{
			result = (double) n;
			counter++;
		}
		
		result = result / counter;
		
		return result;
	}
	/*
	public static void main(String[]args) 
	{
		//String fileName = "File/IntValues.txt";
		//schreibeWerteAlsIntDatei(fileName);
		//System.out.println(liesWerteAusIntDatei(fileName));
		
		System.out.println(liesWerteAusSystemIn());
	}	*/
}
