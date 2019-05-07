package uebungsblatt16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Aufgabe1 
{
	// a) Antwort: Der BufferedReader
	
	public void splitStudiengaenge(String dateiname) 
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
				if (line == null) break;
				
				int nummer = Integer.valueOf(line);
				if(nummer >= 5000000 && nummer <= 5099999 ) 
				{
					matrikelnummernWinf.add(line);
					
				}else if(nummer >= 5100000 && nummer <= 5199999) 
				{
					matrikelnummernInf.add(line);
					
				}else if(nummer >= 6100000 && nummer <= 6199999 ) 
				{
					matrikelnummernEC.add(line);
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
		try(BufferedWriter br = new BufferedWriter(new FileWriter(zieldateiName));)
		{
			for(int i = 0; i < matrikelnummern.size(); i++) 
			{
				br.write(matrikelnummern.get(i));
				br.newLine();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
