package Klausuren;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aufgabe1 
{
	public static boolean ibanCheck(String IBAN)throws Aufg1_FalscheIBANException
	{
		String laenderCode_DE = "DE";
		
		if(IBAN.length() < 22) 
		{
			throw new Aufg1_FalscheIBANException("IBAN ist ungültig da weniger als 22 Zeichen.\n Ihre eingegebene IBAN war: "+ IBAN+ " und hat "+ IBAN.length()+ " Zeichen");
		}
		
		if(!IBAN.substring(0, 2).equals(laenderCode_DE) ) 
		{
			throw new Aufg1_FalscheIBANException("Im Ländercode der IBAN ist ein fehler. \n Ihre eingabe war: " + IBAN);
		}
		
		return true;	
	}
	
	public static void ibanAusDateiLesen(String fileName) throws Aufg1_FalscheIBANException
	{
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));)
		{
			do 
			{
				String IBAN = br.readLine();
				if(IBAN == null) 
				{
					break;
				}
				ibanCheck(IBAN);
			}
			while(true);
			
		}catch(FileNotFoundException f) 
		{
			System.out.println("Datei " + fileName + " nicht gefunden");
			return;
		}
		catch(IOException ie) 
		{
			System.out.println("Fehler beim Lesevorgang von Datei: "+fileName);
			return;
		}
		catch(NullPointerException n) 
		{
			System.out.println("Datei "+fileName+ " existiert nicht");
			return;
		}
		
		System.out.println("Datei "+fileName+ " wurde erfolgreich gelesen und alle IBANs sind gültig");
	}
	
	public static void dateienTest(String[] fileNames)
	{
		for(int i = 0; i < fileNames.length; i++) 
		{
			try 
			{
				ibanAusDateiLesen(fileNames[i]);
			}
			catch(Aufg1_FalscheIBANException ex) 
			{
				System.out.println("Datei "+fileNames[i]+ " ist fehlerhaft");
			}
		}
	}
}
