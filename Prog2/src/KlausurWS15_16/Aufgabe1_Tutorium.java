package KlausurWS15_16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe1_Tutorium 
{
	public static int liesWerteAusIntDatei(String dateiname) 
	{
		int count = 0;
		try(FileInputStream fis = new FileInputStream(dateiname)) 
		{
			int i = fis.read();
			while(i != -1) 
			{
				count += i;
				i = fis.read();
			}
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static double liesWerteAusSystemIn() 
	{
		double sum = 0.0;
		int count = 0;
		
		try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)))
		{
			while(true) 
			{
				String str = rd.readLine();
				try 
				{
					double d = Double.parseDouble(str);
					sum += d;
					count++;
				}
				catch (NumberFormatException nf) 
				{
					break;
				}	
			}
			
		}catch(IOException e)
		{
		}
		
		return sum/count;
	}
}
