package uebungsblatt16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 
{
	// a) Antwort: Der BufferedReader
	
	public static void main(String[]args) 
	{
		String dateiname = "matNrNeu.txt";
		splitStudiengaenge(dateiname);
	}
	
	public static void splitStudiengaenge(String dateiname) 
	{
		ArrayList<String> matrikelnummernWinf = new ArrayList<>();
		ArrayList<String> matrikelnummernInf = new ArrayList<>();
		ArrayList<String> matrikelnummernEC = new ArrayList<>();
		String WinfDateiname = "WInfNr.txt";
		String InfDateiname = " InfNr.txt";
		String ECDateiname = "ECNr.txt";
				
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader(dateiname));
			do
			{
				String line = br.readLine();
				System.out.println(line);
				if (line == null) break;
				int nummer = 0;
				try 
				{
					nummer = Integer.valueOf(line);
					
				}catch(Exception e) 
				{	
				}
				
				if(nummer >= 5000000 && nummer <= 5099999 ) 
				{
					matrikelnummernWinf.add(line);
					System.out.println("test");
					
				}else if(nummer >= 5100000 && nummer <= 5199999) 
				{
					matrikelnummernInf.add(line);
					System.out.println(line);
					
				}else if(nummer >= 6100000 && nummer <= 6199999 ) 
				{
					matrikelnummernEC.add(line);
					System.out.println(line);
				}else 
				{
					throw new MatrikelNummerException();
				}
			}
			while(true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
				
		}finally
		{
			try {
					if (br != null) br.close();
				}
				catch (IOException e) 
				{
				}
		}
		schreibeDatei(WinfDateiname, matrikelnummernWinf);
		schreibeDatei(InfDateiname, matrikelnummernInf);
		schreibeDatei(ECDateiname, matrikelnummernEC);
	}
	
	
	
	public static void schreibeDatei(String zieldateiName, ArrayList<String> matrikelnummern) 
	{
		BufferedWriter br = null;
		try
		{
			br = new BufferedWriter(new FileWriter(zieldateiName));
			for(int i = 0; i < matrikelnummern.size(); i++) 
			{
				br.write(matrikelnummern.get(i));
				br.newLine();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
					if (br != null) br.close();
				}
				catch (IOException e) 
				{
				}
		}
	}
}
