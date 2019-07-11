package uebungsblatt19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe4_Exam 
{
	List<Aufgabe4_Questions> questionsList = new ArrayList<Aufgabe4_Questions>();
	
	// Liest den Tex‐Header aus einer Datei u. gibt ihn als String zurück
	public String readHeaderFromFile() 
	{

		return null;
	}

	public void toTest() 
	{

	}

	public void readQuestions() 
	{
		
		String datPath = "questions.csv";
		File file = new File(datPath); 

        if (!file.canRead() || !file.isFile()) 
        {
        	System.out.println("Pfad oder Dateiname ist falsch");
        	return;
        }
            
		// die die Datei questions.csv zeilenweise ausliest,

		BufferedReader in = null;
		String line = null;
		try 
		{
			in = new BufferedReader(new FileReader(datPath));

			while (in != null) 
			{
				line = in.readLine();
				Aufgabe4_Questions a = new Aufgabe4_Questions();
				questionsList.add(a.toQuestion(line));
			}
		} 
		catch (IOException e) 
		{
		} 
		finally 
		{
			if (in != null)
				try 
				{
					in.close();
				} catch (IOException e) 
				{
				}
		}
	}
}
