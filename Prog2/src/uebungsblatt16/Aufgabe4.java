package uebungsblatt16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Aufgabe4 
{
	public static void main(String[]args) 
	{
		translaterLettersIntoNumbers();
	}
	
	public static void translaterLettersIntoNumbers() 
	{
		String datenquelle = "File/Zeichenkontakte.txt";
		String datensenke = "File/Nummernkontakte.txt";
		ArrayList<String> nummernStringArray = new ArrayList<String>();
		StringBuilder nummerString= null;
		
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader(datenquelle));
			do
			{
				nummerString = new StringBuilder();
				String line = br.readLine();
				if (line == null) break;
				System.out.println(line);
				
				char[] a = line.toCharArray();
				for( char k: a ) 
				{
					switch(k) 
					{
						case 'A': 
						case 'B': 
						case 'C':nummerString.append(2);
							break;
							
						case 'D': 
						case 'E': 
						case 'F':nummerString.append(3); 
							break;
							
						case 'G': 
						case 'H': 
						case 'I':nummerString.append(4); 
							break;
							
						case 'J': 
						case 'K': 
						case 'L':nummerString.append(5); 
							break;
							
						case 'M': 
						case 'N': 
						case 'O':nummerString.append(6);
							break;
							
						case 'P': 
						case 'Q': 
						case 'R':
						case 'S':nummerString.append(7); 
							break;
							
						case 'T': 
						case 'U': 
						case 'V':nummerString.append(8);
							break;
							
						case 'W': 
						case 'X': 
						case 'Y':
						case 'Z':nummerString.append(9);
							break;
							
							default: throw new IllegalTelefonNumberException();
					}
				}
				String temp = nummerString.toString();
				nummernStringArray.add(temp);
				nummernStringArray.add("\n");
				
			}
			while(true);
			writeInFile(nummernStringArray, datensenke);
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
	public static void writeInFile(ArrayList<String> nummern, String datensenke) 
	{
		BufferedWriter br = null;
		try
		{
			br = new BufferedWriter(new FileWriter(datensenke));
			for(int i = 0; i < nummern.size(); i++) 
			{
				br.write(nummern.get(i));
			}
			br.newLine();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
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