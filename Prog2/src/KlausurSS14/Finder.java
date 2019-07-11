package KlausurSS14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finder 
{
	public BufferedReader getSystemInAsBufferedReader() 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);

		return buff;
	}

	public void findStringInFiles(String searchString, String[] filenames) 
	{
		for (String s : filenames) 
		{
			try (FileReader fr = new FileReader(s); BufferedReader bf = new BufferedReader(fr)) 
			{
				String line = null;
				int zeilenNummer = 0;

				do 
				{
					line = bf.readLine();
					zeilenNummer++;
					if (line == null) 
					{
						break;
					}

					if (line.contains(searchString)) 
					{
						System.out.println("Zeilen Nr.: " + zeilenNummer + "\n" + "Datei Name: " + s + "\n");
					}
				} 
				while (true);

			} 
			catch (FileNotFoundException fnf) 
			{
				System.out.println("File " + s + " not found" + "\n");
			}
			catch (Exception e) 
			{
				System.out.println("Exception");
				e.printStackTrace();
			}
		}
	}
	
	public void findStringInFilesOption1(String searchString, String[] filenames) 
	{
		FileReader fr = null;
		BufferedReader bf = null;

		try 
		{
			for (String s : filenames) 
			{
				try 
				{
					fr = new FileReader(s);
					bf = new BufferedReader(fr);

					String line = null;
					int zeilenNummer = 0;

					do 
					{
						line = bf.readLine();
						zeilenNummer++;
						if (line == null) 
						{
							break;
						}

						if (line.contains(searchString)) 
						{
							System.out.println("Zeilen Nr.: " + zeilenNummer + "\n" + "Datei Name: " + s + "\n");
						}
					} while (true);

				} catch (FileNotFoundException fnf) 
				{
					System.out.println("File " + s + " not found" + "\n");
				}
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Exception");
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				fr.close();
			} 
			catch (IOException e) 
			{

			}
			try 
			{
				bf.close();
			} 
			catch (IOException e) 
			{

			}
		}
	}
	
	public static void main(String[] args) 
	{
		Finder finder = new Finder();
		BufferedReader br = finder.getSystemInAsBufferedReader();
		String searchString = null;
		String[] fileNames = { "fil1.txt", "fil0.txt", "fil2.txt" };

		try 
		{
			searchString = br.readLine();
			finder.findStringInFiles(searchString, fileNames);
			//finder.findStringInFilesOption1(searchString, fileNames);
			br.close();
		} 
		catch (IOException ex) 
		{
			System.out.println("Einlesen fehlgeschlagen.");
		}
	}
}
