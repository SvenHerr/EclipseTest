package uebungsblatt15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Aufgabe3 
{
	public static void main(String[]args) 
	{
		long startTime = System.currentTimeMillis();
		boolean aufgabeAisFertig = teilaufgabeA();
		System.out.println(aufgabeAisFertig);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Ohne Buffer: " + duration);
		
		
		startTime = System.currentTimeMillis();
		boolean aufgabeBisFertig = teilaufgabeB();
		System.out.println(aufgabeBisFertig);
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("Mit Buffer:" + duration);
		
	}
	static String dateiPfad = null; 
	static String dateiName = null;
	static String dateiFile = null;
	
	public static boolean teilaufgabeA() 
	{
		Scanner scan = new Scanner(System.in);
		
		FileInputStream fis = null;
		//String dateiPfad = null; 
		//String dateiName = null;
		//String dateiFile = null;
		do 
		{
			try 
			{
				System.out.println("Bitte geben Sie den Pad ein: ");
				//dateiPfad = "Files/musik1.mp3";
				dateiName = scan.nextLine();
				dateiFile = "Files/";
				dateiPfad = dateiFile + dateiName;
				fis = new FileInputStream(dateiPfad);
				System.out.println("while ist fertig ");
				break;
			}
			catch(FileNotFoundException e) 
			{
				System.out.println("Pfad ungültig, bitte erneut eingeben! ");
			}
			
		}while(true);
		
		String dateiPfadCopy = dateiFile + "Kopie_von_"+dateiName;
		
		try
		{
			//fis = new FileInputStream(dateiPfad);
			FileOutputStream fos = new FileOutputStream(dateiPfadCopy);
			int b;
			do
			{
				b = fis.read();
				if (b != -1) fos.write(b);
				System.out.println("schreibe..... ");
				
			}
			while (b != -1);
			System.out.println("read/write ist fertig ");
			try 
			{
				if (fis != null) fis.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				if (fos != null) fos.close();
			}
			catch (IOException e) 
			{	
				e.printStackTrace();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		scan.close();	
		
		return true;
	}
	
	public static boolean teilaufgabeB() 
	{
		Scanner scan = new Scanner(System.in);
		
		InputStream initialStream = null;
		OutputStream outStream = null;
		//String dateiPfad = null; 
		//String dateiName = null;
		//String dateiFile = null;
		
		do 
		{
			try 
			{
				System.out.println("(Buffer)Bitte geben Sie den Pad ein: ");
				//dateiPfad = "Files/musik1.mp3";

				dateiName = scan.nextLine();
				dateiFile = "Files/";
				dateiPfad = dateiFile + dateiName;
				
				initialStream = new FileInputStream(new File(dateiPfad));
				System.out.println("while ist fertig ");
				break;
			}
			catch(FileNotFoundException e) 
			{
				System.out.println("Pfad ungültig, bitte erneut eingeben! ");
			}
		}while(true);
		
		String dateiPfadCopy = dateiFile + "BufferKopie_von_"+dateiName;
		
		try
		{
			 initialStream = new FileInputStream(new File(dateiPfad));
			 byte[] buffer = new byte[initialStream.available()];
			 initialStream.read(buffer);
				 
			 outStream = new FileOutputStream(dateiPfadCopy);
			 outStream.write(buffer);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if (initialStream != null) initialStream.close();
			}
			catch (IOException e) 
			{
			}
			try 
			{
				if (outStream != null) outStream.close();
			}
			catch (IOException e) 
			{
			}
			}
		scan.close();
		
		return true;
	}
}
